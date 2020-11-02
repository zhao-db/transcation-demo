package com.example.demo.transcational.transcationaldemo.service;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/10/30 15:18
 * @Version 1.0
 */
public interface UserService {

    String getUserById(String id);

    String save(String id);

    String singleSave(String id);

    String privatesSave(String id);
}
