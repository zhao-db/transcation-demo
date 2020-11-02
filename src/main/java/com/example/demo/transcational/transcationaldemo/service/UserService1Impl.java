package com.example.demo.transcational.transcationaldemo.service;

import com.example.demo.transcational.transcationaldemo.entity.User;
import com.example.demo.transcational.transcationaldemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/10/30 15:22
 * @Version 1.0
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class UserService1Impl implements UserService1 {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String saveUserById(String id) {
        User u = new User();
        u.setAge(1);
        u.setId(id);
        u.setNickName("zzx");
        u.setPassword("zxcvg");
        u.setPrice(BigDecimal.TEN);
        u.setUserName("zzyux");
        userMapper.saveUser(u);
        throw new RuntimeException("sdf");
    }

    @Override
    public User getUser(String id) {
        return userMapper.getUserById(id);
    }
}
