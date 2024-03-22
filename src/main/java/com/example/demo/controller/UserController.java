package com.example.demo.controller;

import com.example.demo.entity.UserInfo;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author mahaiyang
 * @date 2024/3/11 15:59
 */
@Controller
@ResponseBody
@RequestMapping("/test")
public class UserController {
    @Autowired
    private UserService userService;
    @Value("${server.port}")
    private String port;
    @RequestMapping("hi")
    public String say() {
        return "hello 小马"+ port;
    }
//    @RequestMapping(value = "/exe",method = RequestMethod.GET)
//    public String f() {
//        return "hello";
//    }
//    @GetMapping("/get")
//    public String get(@RequestParam(value = "myName",required = false) String name) {
//        return "get"+"获取到的name: "+name;
//    }
//    @RequestMapping("/input")
//    public String input(Student student) {
//        System.out.println("对象中的 id:"+student.getId());
//        System.out.println("对象中的 name:"+student.getName());
//        System.out.println("对象中的 age:"+student.getAge());
//        return "获取对象属性成功";
//    }
//    @RequestMapping("/postMan")
//    public Student fu(@RequestBody Student student) {
//        return student;
//    }
//    @RequestMapping("/input/{name}/{age}")
//    public String get(@PathVariable(required = false) String name,@PathVariable int age) {
//        return name+age;
//    }

    @RequestMapping("/getList")
    public List<UserInfo> getAll() {
        return userService.getAll();
    }
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/user")
    public List<UserInfo> getAll1() {
        return userMapper.getAll();
    }
    @RequestMapping("/getById")
    public UserInfo getById(@Param("id") Integer id) {
        return userService.getById(id);
    }

    @RequestMapping("/login")
    public String login() {
        System.out.println("执行了login方法");
        return "hello login";
    }
    @RequestMapping("/test1")
    public String test1() {
        System.out.println("执行了test1方法");
        return "hello test1";
    }
}
