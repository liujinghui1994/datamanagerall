package com.datamanager.server.impl.systemmanager.registermanager.impl;

import com.datamanager.server.api.systemmanager.redismanager.service.IRegisterManagerService;
import com.datamanager.server.api.systemmanager.usermanager.model.UserVO;
import com.datamanager.server.api.systemmanager.usermanager.service.IUserManagerService;
import com.datamanager.server.impl.systemmanager.others.utils.DoubleMD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class RegisterManagerServiceImpl implements IRegisterManagerService {
	
	@Autowired
	private IUserManagerService iUserManagerService;
	
	@Override
	public int registerUser(UserVO userVO){
		userVO.setUserSalt(UUID.randomUUID().toString());
		userVO.setUserPassword(DoubleMD5Util.genMD5(userVO.getUserPassword(),userVO.getUserSalt()));
		int result = iUserManagerService.insertUser(userVO);
		return result;
	}
}
