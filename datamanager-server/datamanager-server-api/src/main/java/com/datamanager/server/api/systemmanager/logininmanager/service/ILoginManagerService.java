package com.datamanager.server.api.systemmanager.logininmanager.service;


import com.datamanager.server.api.systemmanager.usermanager.model.UserVO;

public interface ILoginManagerService {

	public UserVO loginUserByUserNameAndUserPassword(String userName, String userPassword);

	public UserVO loginUserByUserEmailAndUserPassword(String userEmail, String userPassword);

}
