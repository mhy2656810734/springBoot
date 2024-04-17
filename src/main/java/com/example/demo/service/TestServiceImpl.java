package com.example.demo.service;

import org.springframework.stereotype.Service;

/**
 * @author mahaiyang
 * @date 2024/4/17 9:23
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public void test() {
        System.out.println("test");
    }
}
