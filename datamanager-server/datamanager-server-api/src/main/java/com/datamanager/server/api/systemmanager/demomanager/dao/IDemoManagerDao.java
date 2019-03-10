package com.datamanager.server.api.systemmanager.demomanager.dao;

import com.datamanager.server.api.systemmanager.demomanager.model.DemoVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDemoManagerDao {

    public List<DemoVO> queryDemoVOList();

    public List<DemoVO> queryDemoVOListById(long id);

    public void addDemoVO(DemoVO demoVO);

    public void deleteDemoVO(long id);

    public void updateDemoVO(DemoVO demoVO);
}
