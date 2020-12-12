package com.atguigu.service.impl;

import com.atguigu.dao.BookDao;
import com.atguigu.pojo.Book;
import com.atguigu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceimpl implements BookService {

    @Autowired
    BookDao bookDao;


    @Override
    public List<Book> getAll() {
        return bookDao.getALL();
    }

    @Override
    public Book getbyId(Integer id) {
        return bookDao.getbyId(id);
    }

    @Override
    public void update(Book book) {
        bookDao.update(book);
    }

    @Override
    public void insert(Book book) {
        bookDao.insert(book);
    }

    @Override
    public void delete(Integer id) {

        bookDao.delete(id);
    }

    @Override
    public List<Book> getByPrice(Integer min, Integer max) {
        return bookDao.getByprice(min,max);
    }


}
