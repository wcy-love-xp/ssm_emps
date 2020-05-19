package com.wang.service;

import com.wang.dao.UserMapper;
import com.wang.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public List<User> findByName(User user) {
        return userMapper.findByName(user);
    }

    public int delById(int id) {
        return userMapper.delByid(id);
    }

    public List<User> findByNames(User user) {
        return userMapper.findByNames(user);
    }

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    public User selectByID(User user) {
        return userMapper.selectByID(user);
    }

    public int updateById(User user) {
        return userMapper.updateById(user);
    }
}
