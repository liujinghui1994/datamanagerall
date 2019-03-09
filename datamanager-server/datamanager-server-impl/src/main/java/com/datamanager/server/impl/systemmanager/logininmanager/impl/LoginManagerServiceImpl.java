package com.datamanager.server.impl.systemmanager.logininmanager.impl;

import com.datamanager.server.api.systemmanager.logininmanager.service.ILoginManagerService;
import com.datamanager.server.api.systemmanager.usermanager.model.UserVO;
import com.datamanager.server.api.systemmanager.usermanager.service.IUserManagerService;
import com.datamanager.server.impl.systemmanager.others.utils.DoubleMD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("loginManagerService")
public class LoginManagerServiceImpl implements ILoginManagerService {
	
	@Autowired
	private IUserManagerService iUserService;

	@Override
	public UserVO loginUserByUserNameAndUserPassword(String userName, String userPassword) {
		UserVO userVO = null;
		userVO = iUserService.queryUserByUserName(userName);
		boolean checkPassword = DoubleMD5Util.validatePasword(userPassword,userVO.getUserPassword(),userVO.getUserSalt());
		if(!checkPassword){
			return null;
		}
		return userVO;
	}

	@Override
	public UserVO loginUserByUserEmailAndUserPassword(String userEmail, String userPassword) {
		UserVO userVO = iUserService.queryUserByUserEmail(userEmail);
		userVO = iUserService.queryUserByUserEmailAndUserPassword(userEmail, DoubleMD5Util.genMD5(userVO.getUserPassword(),userVO.getUserSalt()));
		return userVO;
	}
}
