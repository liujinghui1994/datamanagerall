package com.datamanager.server.api.systemmanager.demomanager.service;


import com.datamanager.server.api.systemmanager.demomanager.model.DemoVO;

import java.util.List;

public interface IDemoManagerService {

	public List<DemoVO> queryDemoVOList();

	public List<DemoVO> queryDemoVOListById(long id);

	public void addDemoVO(DemoVO demoVO);

	public void deleteDemoVO(long id);

	public void updateDemoVO(DemoVO demoVO);


}
