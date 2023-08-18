package com.joey.controller;

import com.joey.domain.Book;
import com.joey.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * SMVC_9_ssm_result
 * 为前端程序员提供标准化的JSON数据
 * \result表示返回结果
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book b) {
        boolean flag = bookService.save(b);
        return new Result(flag,flag ? Code.SAVE_OK: Code.SAVE_ERR) ;
    }

    @PutMapping
    public Result update(@RequestBody Book b) {
        boolean flag = bookService.update(b);
        return  new Result(flag,flag ? Code.UPDATE_OK: Code.UPDATE_ERR) ;
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag =       bookService.delete(id);

        return new Result(flag,flag ? Code.DELETE_OK: Code.DELETE_ERR) ;

    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.GET_OK: Code.GET_ERR ;
        String msg = code.equals(Code.GET_OK) ? "":"数据查询失败";
        return new Result(book ,code,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book> books = bookService.getAll();
        Integer code = books != null ? Code.GET_OK: Code.GET_ERR;
        String msg = code.equals(Code.GET_OK) ? "":"数据查询失败";
        return new Result(books ,code,msg);
    }

/*
 *SMVC_10_Exception
 * SpringMVC 抛异常  往上抛  Dao(数据层) > 业务层(service) > 表现层 (controller)
 */
    /**
     * 测试异常
     * @return 走不到这一步
     */
    @GetMapping("/e")
    public Result getException() {
        int i = 1/0;

        List<Book> books = bookService.getAll();
        Integer code = books != null ? Code.GET_OK: Code.GET_ERR;
        String msg = code.equals(Code.GET_OK) ? "":"数据查询失败";
        return new Result(books ,code,msg);
    }
    /*
     *SMVC_10.1_RunTimeException
     *
     */

    @GetMapping("/e/{id}")
    public Result getByIdE(@PathVariable Integer id) {
        Book book = bookService.getByIdE(id,0);
        Integer code = book != null ? Code.GET_OK: Code.GET_ERR ;
        String msg = code.equals(Code.GET_OK) ? "":"数据查询失败";
        return new Result(book ,code,msg);
    }
}
