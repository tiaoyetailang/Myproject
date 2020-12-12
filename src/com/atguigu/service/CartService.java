package com.atguigu.service;


import com.atguigu.pojo.Cart;

import java.util.List;

public interface CartService {

    void insert(Cart cart);

    List<Cart> getAll();

    void delete();

}
