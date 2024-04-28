package com.example.demo.controller;

import com.example.demo.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mahaiyang
 * @date 2024/3/11 16:25
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private Student student;
    @RequestMapping("hi")
    public String say() {
        return student.getId()+student.getName()+student.getAge();
    }
    private static final Logger log = LoggerFactory.getLogger(StudentController.class);
    @RequestMapping("/log")
    public String func() {

        log.debug("我是debug级别");
        log.info("我是默认级别info");
        log.warn("我是warn级别");
        log.error("我是error级别");
        return "已经打印了日志";
    }
    @RequestMapping("/test")
    public String test() {
        return "没有配置aop";
    }
}
