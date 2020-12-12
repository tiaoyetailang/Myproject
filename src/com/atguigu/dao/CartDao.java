package com.atguigu.dao;

import com.atguigu.pojo.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartDao {

    void insert(@Param("cart") Cart cart);

    List<Cart> getAll();

    void delete();
}
