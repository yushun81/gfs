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
    @GetMapping("   ")
    public String sayHello() {
        return "say hello";
    }
}
