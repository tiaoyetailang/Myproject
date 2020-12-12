package com.atguigu.dao;

import com.atguigu.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {

    List<User> getAll();

    User getByname(String username);

     void insert(User user);
}
