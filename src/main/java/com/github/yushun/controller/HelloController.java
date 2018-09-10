package com.github.yushun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>描述：请修改类描述 </p>
 * @author 于顺
 * @date 2018年9月10日
 */
@RestController
public class HelloController {
    @GetMapping("/api/hello/sayhello")
    public String sayHello() {
        return "say hello";
    }
    
    @GetMapping("/api/hello/sayhello2")
    public String sayHello2() {
        return "say hello too";
    }
    
    @GetMapping("/api/hello/sayhello3")
    public String sayHello3() {
        return "say hello three";
    }
    
    @GetMapping("/api/hello/sayhello4")
    public String sayHello4() {
        return "say hello four";
    }
}
