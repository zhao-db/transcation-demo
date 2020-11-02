package com.example.demo.transcational.transcationaldemo.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/10/30 15:11
 * @Version 1.0
 */
@Data
public class User {

    private String id;
    private Integer age;
    private String nickName;
    private String password;
    private String userName;
    private BigDecimal price;

}
