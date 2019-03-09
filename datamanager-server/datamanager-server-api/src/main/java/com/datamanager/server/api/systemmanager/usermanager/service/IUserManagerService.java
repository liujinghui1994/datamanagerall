package com.datamanager.server.api.systemmanager.usermanager.service;

import com.datamanager.server.api.systemmanager.usermanager.model.UserVO;

import java.util.List;


/**
 * 用户管理模块
 */
public interface IUserManagerService {

    public int insertUser(UserVO userVO);

    public int updateUser(UserVO userVO);

    public int deleteUser(int userId);

    public UserVO queryUserByUserId(int userId);

    public UserVO queryUserByUserName(String userName);

    public UserVO queryUserByUserEmail(String userEmail);

    public UserVO queryUserByUserNameAndUserPassword(String userName, String userPassword);

    public UserVO queryUserByUserEmailAndUserPassword(String userEmail, String userPassword);

    public List<UserVO> queryUser();

}
