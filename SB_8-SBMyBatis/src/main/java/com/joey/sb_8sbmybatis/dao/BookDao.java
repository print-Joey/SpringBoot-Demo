package com.joey.sb_8sbmybatis.dao;

import com.joey.sb_8sbmybatis.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper   //<====新知识
public interface BookDao {

    @Select("select * from tb_book where id = #{id}")
     Book getById(Integer id);
}
