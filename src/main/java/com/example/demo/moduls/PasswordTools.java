package com.example.demo.moduls;

import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.UUID;

/**
 * 加盐加密的工具类
 * @author mahaiyang
 * @date 2024/3/27 15:20
 */
public class PasswordTools {
    /**
     * 加密方法
     * @param password 用户传入的初始密码
     * @return
     */
    public static String encrypt(String password) {
        // 1.获取UUID,生成随机盐值
        String salt = UUID.randomUUID().toString().replace("-","");
        // 2.根据初始密码和随机盐值生成加盐加密的密码
        String finaPassword = DigestUtils.md5DigestAsHex((salt+password).getBytes(StandardCharsets.UTF_8));
        // 3.生成最终密码
        String dbPassword = salt+"$"+finaPassword;
        return dbPassword;
    }

    /**
     * 加盐加密方法重载
     * @param salt 随机盐值
     * @param password 初始密码
     * @return
     */
    public static String encrypt(String salt,String password) {
        String finalPassword = DigestUtils.md5DigestAsHex((salt+password).getBytes(StandardCharsets.UTF_8));
        return salt+"$"+finalPassword;
    }

    /**
     * 加盐解密
     * @param password 原始密码
     * @param dbPassword 数据库中密码
     * @return
     */
    public static  boolean decrypt(String password,String dbPassword) {
        // 1.参数校验
        if (StringUtils.hasLength(password) && StringUtils.hasLength(dbPassword) &&
                dbPassword.length() == 65 && dbPassword.contains("$")) {
            // 2.分割数据库中的密码
            String[] arrPassword = dbPassword.split("\\$");
            // 得到盐值
            String salt = arrPassword[0];
            if (dbPassword.equals(PasswordTools.encrypt(salt,password))) {
                return true;
            }

        }
        return false;
    }
}
