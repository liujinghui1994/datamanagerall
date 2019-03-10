package com.datamanager.server.impl.systemmanager.demomanager.impl;

import com.datamanager.server.api.systemmanager.demomanager.dao.IDemoManagerDao;
import com.datamanager.server.api.systemmanager.demomanager.model.DemoVO;
import com.datamanager.server.api.systemmanager.demomanager.service.IDemoManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<DemoVO> queryDemoVOList() {
        return iDemoManagerDao.queryDemoVOList();
    }

    @Override
    public List<DemoVO> queryDemoVOListById(long id) {
        return iDemoManagerDao.queryDemoVOListById(id);
    }

    @Override
    public void addDemoVO(DemoVO demoVO) {
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
