package com.atguigu.service;

import com.atguigu.pojo.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();

    Book getbyId(Integer id);

    void update(Book book);

    void insert(Book book);

    void delete(Integer id);

    List<Book> getByPrice(Integer min ,Integer max);

}
