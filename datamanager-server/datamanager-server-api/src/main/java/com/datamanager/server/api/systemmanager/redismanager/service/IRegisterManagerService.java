package com.datamanager.server.api.systemmanager.redismanager.service;


import com.datamanager.server.api.systemmanager.usermanager.model.UserVO;

public interface IRegisterManagerService {
	public int registerUser(UserVO userVO);
}
