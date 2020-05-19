package com.wang.dao;

import com.wang.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> findAll();
    List<User> findByName(User user);
    int delByid(int id);
    List<User> findByNames(User user);
    int insertUser(User user);
    User selectByID(User user);
    int updateById(User user);
}

