package com.atguigu.service.impl;

import com.atguigu.dao.CartDao;
import com.atguigu.pojo.Cart;
import com.atguigu.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartDao cartDao;

    @Override
    public void insert(Cart cart) {
         cartDao.insert(cart);
    }

    @Override
    public List<Cart> getAll() {
        return cartDao.getAll();
    }

    @Override
    public void delete() {
        cartDao.delete();
    }


}
