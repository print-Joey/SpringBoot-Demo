package com.joey.service.impl;

import com.joey.controller.Code;
import com.joey.dao.BookDao;
import com.joey.domain.Book;
import com.joey.exception.SystemException;
import com.joey.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    //没有Autowiring的，把 Incorrect injection point autowiring in Spring bean components去掉  要是还爆红就重启IDEA
    @Autowired
    private BookDao bookDao;
    public boolean save(Book b) {
        bookDao.save(b);
        return  true;
    }

    public boolean update(Book b) {
        bookDao.update(b);
        return true;
    }

    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    public Book getByIdE(Integer id,Integer place) {
 //第二步    下一步: ProjectExceptionAdvice
        //在可能出现异常的地方包装 try catch
        try {
            //模拟异常
            int i = 1/0;
        }catch(Exception e){
            throw new SystemException("服务器超时",e, Code.SYSTEM_TIMEOUT_ERR);
        }
        return bookDao.getById(id);
    }


    public Book getById(Integer id) {

        return bookDao.getById(id);
    }
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
