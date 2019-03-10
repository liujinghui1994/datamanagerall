package com.datamanager.server.impl.systemmanager.demomanager.impl;

import com.datamanager.server.api.systemmanager.demomanager.dao.IDemoManagerDao;
import com.datamanager.server.api.systemmanager.demomanager.model.DemoVO;
import com.datamanager.server.api.systemmanager.demomanager.service.IDemoManagerService;
import com.datamanager.server.impl.systemmanager.others.utils.ProtostuffUtil;
import com.datamanager.server.impl.systemmanager.redismanager.utils.RedisPoolFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @program: com.datamanager.server.impl.systemmanager.demomanager.impl
 * @description:
 * @author: liujinghui
 * @create: 2019-03-10 14:37
 **/
@Service
public class DemoManagerServiceImpl implements IDemoManagerService {

    @Autowired
    private IDemoManagerDao iDemoManagerDao;

    @Autowired
    private RedisPoolFactory redisPoolFactory;

    /**
     * 根据Redis查询全部数据，如果不存在就去mysql查询
     * @return
     */
    @Override
    public List<DemoVO> queryDemoVOList() {
        Set<String> contentKeys = redisPoolFactory.getJedis().keys("*");
        if(contentKeys!=null && contentKeys.size()>0){
            List<DemoVO> demoVOList = new ArrayList<DemoVO>();
            Iterator iterator = contentKeys.iterator();
            while(iterator.hasNext()){
                byte[] key = iterator.next().toString().getBytes();
                byte[] content = redisPoolFactory.getJedis().get(key);
                DemoVO demoVO = ProtostuffUtil.deserializer(content,DemoVO.class);
                demoVOList.add(demoVO);
            }
            return demoVOList;
        }else{
            return iDemoManagerDao.queryDemoVOList();
        }
    }

    @Override
    public List<DemoVO> queryDemoVOListById(long id) {
        return iDemoManagerDao.queryDemoVOListById(id);
    }

    /**
     * 应用了redis的插入，还有Protostuff的序列化
     * @param demoVO
     */
    @Override
    public void addDemoVO(DemoVO demoVO) {
        String key = "demo:"+demoVO.getId();
        redisPoolFactory.getJedis().set(key.getBytes(), ProtostuffUtil.serializer(demoVO));
        iDemoManagerDao.addDemoVO(demoVO);
    }

    @Override
    public void deleteDemoVO(long id) {
        iDemoManagerDao.deleteDemoVO(id);
    }

    @Override
    public void updateDemoVO(DemoVO demoVO) {
        iDemoManagerDao.updateDemoVO(demoVO);
    }
}
