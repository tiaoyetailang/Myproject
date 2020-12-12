package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    UserDao userDao;


    @Override
    public List<User> getAll() {
        return  userDao.getAll();
    }

    @Override
    public User getByname(String username) {
        return userDao.getByname(username);
    }

    @Override
    public void insert(User user) {
        userDao.insert(user);

    }
}
