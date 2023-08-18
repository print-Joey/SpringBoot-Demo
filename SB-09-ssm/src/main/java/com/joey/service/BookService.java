package com.joey.service;

import com.joey.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
//@Transactional   事务管理加在业务层
public interface BookService {
    public boolean save(Book b);

    public boolean update(Book b);

    public boolean delete(Integer id);

    public Book getById(Integer id);
    public Book getByIdE(Integer id,Integer place);

    public List<Book> getAll();
}
