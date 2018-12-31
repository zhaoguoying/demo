package com.example.demo.mapper;

import com.example.demo.model.FeedBack;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * 作者：赵国应
 * 时间：2018-12-31 12:23
 * 描述：反馈sql
 */

@Repository
@Mapper
public interface FeedBackMapper {

    @Insert("insert into feedback(feedbackContent,contactInfo,personId,feedbackDate) values(#{feedbackContent},#{contactInfo},#{personId},#{feedbackDate})")
    void insertFeedback(FeedBack feedBack);

    @Select("select * from feedback")
    List<FeedBack> getAllFeedback();
}
