package com.example.demo.mapper;

import com.example.demo.entity.UserInfo;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author mahaiyang
 * @date 2024/3/12 9:50
 */
@Mapper
public interface UserMapper {
    /**
     * 查询所有用户
     * @return 结果
     */
    List<UserInfo> getAll();

    /**
     * 根据Id查询用户
     * @param id 输入的id
     * @return 查到的结果
     */
    UserInfo getById(@Param("id") Integer id);
    UserInfo getByUserName(@Param("username") String username);
    UserInfo login(UserInfo userInfo);
    UserInfo getByName(@Param("username") String username);
    int update(@Param("id") Integer id,
               @Param("password") String password,
               @Param("newPassword") String newPassword);
    int addUser(UserInfo userInfo);
    int addUser2(UserInfo userInfo);
}
