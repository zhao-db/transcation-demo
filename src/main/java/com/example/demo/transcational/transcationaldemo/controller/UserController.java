package com.example.demo.transcational.transcationaldemo.controller;

import com.example.demo.transcational.transcationaldemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/10/30 15:17
 * @Version 1.0
 */
@RequestMapping("/test")
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get/{id}")
    public String getUser(@PathVariable String id) {
        log.info("id,[{}]", id);
        return userService.getUserById(id);
    }

    @RequestMapping("/hello/{id}")
    public String hello(@PathVariable String id) {
        return userService.save(id);
    }

    @RequestMapping("/single/{id}")
    public String singleSave(@PathVariable String id) {
        return userService.singleSave(id);
    }

    @RequestMapping("/private/{id}")
    public String privatesSave(@PathVariable String id) {
        return userService.privatesSave(id);
    }


}