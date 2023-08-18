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
    //第一种
    @Value("${lesson}")
    private String lessonName;

    //第二种
    @Autowired
    private Environment env;

    //第三种
    @Autowired
    private Enterprise enterprise;


    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("id ==>"+id); //print()
        //第一种
        System.out.println("=========================================");
        System.out.println("lessonName ==>"+lessonName); //print()
        //第二种
        System.out.println("=========================================");
        System.out.println("lessonName ==>"+env.getProperty("lesson"));
        //第三种
        System.out.println("=========================================");
        //System.out.println(enterprise);
        System.out.println(enterprise.toString());
        return "hello, springboot!";
    }
}
