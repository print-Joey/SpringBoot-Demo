package com.joey.controller;

import com.joey.pojo.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")

//SpringBoot-08-yaml数据读取方式(3种)

public class BookController {


    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("id ==>"+id); //print()

        return "hello, springboot!";
    }
}
