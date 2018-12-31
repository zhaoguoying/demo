package com.example.demo.mapper;

import com.example.demo.model.ArticleLikesRecord;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/*
 * 作者：赵国应
 * 时间：2018-12-31 02:05
 * 描述：文章点赞sql
 */
@Mapper
@Repository
public interface ArticleLikesMapper {

    @Insert("insert into article_likes_record(articleId,originalAuthor,likerId,likeDate) values(#{articleId},#{originalAuthor},#{likerId},#{likeDate})")
    void insertArticleLikesRecord(ArticleLikesRecord articleLikesRecord);

    @Select("select likeDate from article_likes_record where articleId=#{articleId} and originalAuthor=#{originalAuthor} and likerId=#{likerId}")
    ArticleLikesRecord isLiked(@Param("articleId") long articleId, @Param("originalAuthor") String originalAuthor, @Param("likerId") int likerId);

    @Delete("delete from article_likes_record where articleId=#{articleId}")
    void deleteArticleLikesRecordByArticleId(long articleId);
}
