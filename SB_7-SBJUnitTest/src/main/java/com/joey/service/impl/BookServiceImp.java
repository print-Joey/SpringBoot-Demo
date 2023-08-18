package com.joey.service.impl;

import com.joey.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImp implements BookService {
    @Override
    public void save() {
        System.out.println("BookService is running!!!");
    }
}
