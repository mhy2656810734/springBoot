package com.example.demo.entity;


import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author mahaiyang
 * @date 2024/3/26 16:19
 */
@Data
public class Template implements Serializable {
    // 用来存放templateId
    private List<Integer> templateIdList;
}
