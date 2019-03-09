package com.datamanager.server.api.systemmanager.usermanager.dao;

import com.datamanager.server.api.systemmanager.usermanager.model.UserVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserManagerDao {

    public int insertUser(UserVO userVO);

    public int updateUserById(UserVO userVO);

    public int deleteUser(int userId);

    public UserVO queryUserByUserId(int userId);

    public UserVO queryUserByUserName(String userName);

    public UserVO queryUserByEmail(String email);

    public UserVO queryUserByUserNameAndUserPassword(@Param("userName") String userName, @Param("userPassword") String userPassword);

    public UserVO queryUserByUserEmailAndUserPassword(@Param("userEmail") String userEmail, @Param("userPassword") String userPassword);

    public List<UserVO> queryUser();

}
