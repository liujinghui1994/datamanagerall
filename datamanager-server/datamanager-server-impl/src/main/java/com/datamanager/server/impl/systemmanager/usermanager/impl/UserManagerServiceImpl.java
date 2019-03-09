package com.datamanager.server.impl.systemmanager.usermanager.impl;

import com.datamanager.server.api.systemmanager.usermanager.dao.IUserManagerDao;
import com.datamanager.server.api.systemmanager.usermanager.model.UserVO;
import com.datamanager.server.api.systemmanager.usermanager.service.IUserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("userManagerService")
@Transactional
public class UserManagerServiceImpl implements IUserManagerService {

    @Autowired
    private IUserManagerDao iUserManageDao;

    @Override
    public int insertUser(UserVO userVO) {
        return iUserManageDao.insertUser(userVO);
    }

    @Override
    public int updateUser(UserVO userVO) {
        return iUserManageDao.updateUserById(userVO);
    }

    @Override
    public int deleteUser(int userId) {
        return iUserManageDao.deleteUser(userId);
    }

    @Override
    public UserVO queryUserByUserId(int userId) {
        return iUserManageDao.queryUserByUserId(userId);
    }

    @Override
    public UserVO queryUserByUserName(String userName) {
        return iUserManageDao.queryUserByUserName(userName);
    }

    @Override
    public UserVO queryUserByUserEmail(String userEmail) {
        return iUserManageDao.queryUserByEmail(userEmail);
    }

    @Override
    public UserVO queryUserByUserNameAndUserPassword(String userName, String userPassword) {
        return iUserManageDao.queryUserByUserNameAndUserPassword(userName,userPassword);
    }

    @Override
    public UserVO queryUserByUserEmailAndUserPassword(String userEmail, String userPassword) {
        return iUserManageDao.queryUserByUserEmailAndUserPassword(userEmail,userPassword);
    }

    @Override
    public List<UserVO> queryUser() {
        return iUserManageDao.queryUser();
    }
}
