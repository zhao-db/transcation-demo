package com.example.demo.transcational.transcationaldemo.service;

import com.example.demo.transcational.transcationaldemo.entity.User;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/10/30 15:18
 * @Version 1.0
 */
public interface UserService1 {

    String saveUserById(String id);

    User getUser(String id);
}
