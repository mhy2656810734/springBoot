package com.example.demo.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author mahaiyang
 * @date 2024/3/12 13:23
 */
@Data
public class ArticleInfo {
    private Integer id;
    private String title;
    private String content;
    private LocalDateTime createtime;
    private LocalDateTime updatetime;
    private Integer uid;
    private Integer rcount;
    private Integer state;
}