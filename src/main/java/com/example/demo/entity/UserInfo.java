package com.example.demo.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author mahaiyang
 * @date 2024/3/12 9:50
 */

@Data
public class UserInfo {
    private Integer id;
    private String username;
    private String password;
    private String photo;
    private LocalDateTime createtime;
    private LocalDateTime updatetime;
    // 表示状态，是1就是正常用户
    private Integer state;
}