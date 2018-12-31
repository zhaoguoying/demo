package com.example.demo.mapper;

import com.example.demo.model.LeaveMessageLikesRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/*
 * 作者：赵国应
 * 时间：2018-12-31 12:26
 * 描述：留言点赞sql
 */

@Mapper
@Repository
public interface LeaveMessageLikesRecordMapper {
    @Select("select likeDate from leave_message_likes_record where pageName=#{pageName} and pId=#{pId} and likerId=#{likerId}")
    LeaveMessageLikesRecord isLiked(@Param("pageName") String pageName, @Param("pId") int pId, @Param("likerId") int likerId);

    @Insert("insert into leave_message_likes_record(pageName,pId,likerId,likeDate) " +
            "values(#{pageName},#{pId},#{likerId},#{likeDate})")
    void insertLeaveMessageLikesRecord(LeaveMessageLikesRecord leaveMessageLikesRecord);
}
