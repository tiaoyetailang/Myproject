package com.atguigu.dao;



import com.atguigu.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {

    List<Book> getALL();

    Book getbyId(Integer id);

   void update(@Param("book") Book book);

   void insert(@Param("book") Book book);

   boolean delete(Integer id);

   List<Book> getByprice(@Param("min") Integer min,@Param("max")Integer max);

}
