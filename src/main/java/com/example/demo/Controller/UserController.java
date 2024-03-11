package com.example.demo.Controller;

import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author mahaiyang
 * @date 2024/3/11 15:59
 */
@Controller
@ResponseBody
@RequestMapping("/test")
public class UserController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("hi")
    public String say() {
        return "hello 小马"+ port;
    }
    @RequestMapping(value = "/exe",method = RequestMethod.GET)
    public String f() {
        return "hello";
    }
    @GetMapping("/get")
    public String get(@RequestParam(value = "myName",required = false) String name) {
        return "get"+"获取到的name: "+name;
    }
    @RequestMapping("/iqnput")
    public String input(Student student) {
        System.out.println("对象中的 id:"+student.getId());
        System.out.println("对象中的 name:"+student.getName());
        System.out.println("对象中的 age:"+student.getAge());
        return "获取对象属性成功";
    }
    @RequestMapping("/postMan")
    public Student fu(@RequestBody Student student) {
        return student;
    }
    @RequestMapping("/input/{name}/{age}")
    public String get(@PathVariable(required = false) String name,@PathVariable int age) {
        return name+age;
    }
}
