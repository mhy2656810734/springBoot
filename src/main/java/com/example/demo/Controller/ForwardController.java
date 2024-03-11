package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mahaiyang
 * @date 2024/3/11 17:14
 */

@RestController
@RequestMapping("/get")
public class ForwardController {
    @RequestMapping("/forward")
    public Object getFW() {
        return"forward:/index.html";
    }
    @RequestMapping("/redirect")
    public Object getRD() {
        return "redirect:/index.html";
    }
}
