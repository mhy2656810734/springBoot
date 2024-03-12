package com.example.demo.mapper;

import com.example.demo.entity.UserInfo;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author mahaiyang
 * @date 2024/3/12 10:13
 */
@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    void getAll() {
        List<UserInfo> list = userMapper.getAll();
        for (UserInfo userInfo:list) {
            System.out.println(userInfo);
        }
    }

    @Test
    void getById() {
        UserInfo userInfo = userMapper.getById(1);
        System.out.println(userInfo);
//        UserInfo userInfo1 = userMapper.getByUserName("admin");
//        System.out.println(userInfo1);
    }

    @Test
    void login() {
//        UserInfo us = new UserInfo();
//        us.setUsername("admin");
//        us.setPassword(" ' or 1 = '1");
//        UserInfo userInfo = userMapper.login(us);
//        System.out.println(userInfo);
    }

    @Test
    void getByName() {
        UserInfo userInfo = userMapper.getByName("ad");
        System.out.println(userInfo);
    }
    @Transactional
    @Test
    void update() {
        System.out.println(userMapper.update(1,"xiaoma","hhhhh"));
    }
}