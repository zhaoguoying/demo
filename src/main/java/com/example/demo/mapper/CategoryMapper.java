package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * 作者：赵国应
 * 时间：2018-12-31 12:10
 * 描述：分类sql
 */

@Mapper
@Repository
public interface CategoryMapper {
    @Select("select categoryName from categories")
    List<String> findCategoriesName();

    @Select("select count(*) from categories")
    int countCategoriesNum();
}
