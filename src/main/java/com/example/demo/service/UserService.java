package com.example.demo.service;

import com.example.demo.entity.UserInfo;
import com.example.demo.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mahaiyang
 * @date 2024/3/12 9:56
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<UserInfo> getAll() {
        return userMapper.getAll();
    }
    public UserInfo getById(@Param("id") Integer id) {
        return userMapper.getById(id);
    }
}
