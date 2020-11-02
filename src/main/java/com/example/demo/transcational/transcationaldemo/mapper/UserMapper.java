package com.example.demo.transcational.transcationaldemo.mapper;

import com.example.demo.transcational.transcationaldemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/10/30 15:12
 * @Version 1.0
 */
@Mapper
@Repository
public interface UserMapper {

    User getUserById(@Param("id") String id);

    void saveUser(@Param("user") User user);

}
