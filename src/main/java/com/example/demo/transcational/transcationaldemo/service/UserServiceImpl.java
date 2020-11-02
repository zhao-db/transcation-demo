package com.example.demo.transcational.transcationaldemo.service;

import com.example.demo.transcational.transcationaldemo.entity.User;
import com.example.demo.transcational.transcationaldemo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/10/30 15:20
 * @Version 1.0
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService1 userService1;

    @Override
    public String getUserById(String id) {
        userService1.saveUserById(id);
        log.info("id[{}]", id);
        User u = userMapper.getUserById(id);
        throw new RuntimeException("sss");
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public String save(String id) {
        User u = new User();
        u.setAge(1);
        u.setId(id);
        u.setNickName("zzx");
        u.setPassword("zxcvg");
        u.setPrice(BigDecimal.TEN);
        u.setUserName("zzyux");
        userMapper.saveUser(u);
        log.info("id[{}]", id);
        User u1 = userService1.getUser(id);
        return u1.toString();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public String singleSave(String id) {
        User u = new User();
        u.setAge(1);
        u.setId(id);
        u.setNickName("zzx");
        u.setPassword("zxcvg");
        u.setPrice(BigDecimal.TEN);
        u.setUserName("zzyux");
        userMapper.saveUser(u);
        return u.toString();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public String privatesSave(String id) {
        this.privateSave(id);
        throw new RuntimeException();
    }

    private void privateSave(String id) {
        User u = new User();
        u.setAge(1);
        u.setId(id);
        u.setNickName("zzx");
        u.setPassword("zxcvg");
        u.setPrice(BigDecimal.TEN);
        u.setUserName("zzyux");
        userMapper.saveUser(u);
    }


}
