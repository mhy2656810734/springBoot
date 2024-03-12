package com.example.demo.VO;

import com.example.demo.entity.ArticleInfo;

/**
 * @author mahaiyang
 * @date 2024/3/12 13:24
 */
public class ArticleInfoVO extends ArticleInfo {
    private String username;

    @Override
    public String toString() {
        return "ArticleInfoVO{" +
                "username='" + username + '\'' +
                "} " + super.toString();
    }
}
