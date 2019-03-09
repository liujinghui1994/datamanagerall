package com.datamanager.server.api.systemmanager.usermanager.service;


import com.datamanager.server.api.systemmanager.usermanager.model.UserVO;

public interface IRegisterService {
	public int registerUser(UserVO userVO);
}
