package com.example.demo.mapper;

/*
 * 作者：赵国应
 * 时间：2018-12-31 12:43
 * 描述：user表SQL语句
 */

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface VisitorMapper {

    @Select("select visitorNum from visitor where pageName=#{pageName}")
    long getVisitorNumByPageName(@Param("pageName") String pageName);

    @Update("update visitor set visitorNum=(case pageName when 'totalVisitor' then visitorNum+1 when #{pageName} then visitorNum+1 else visitorNum end)")
    void updateVisitorNumByTotalVisitorAndPageName(@Param("pageName") String pageName);

    @Update("update visitor set visitorNum=visitorNum+1 where pageName='totalVisitor'")
    void updateVisitorNumByTotalVisitor();

    @Insert("insert into visitor(visitorNum,pageName) values(0,#{pageName})")
    void insertVisitorArticlePage(String pageName);

    @Select("select visitorNum from visitor where pageName='totalVisitor'")
    long getAllVisitor();
}
