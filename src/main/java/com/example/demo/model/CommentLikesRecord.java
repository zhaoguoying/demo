package com.example.demo.model;

import lombok.Data;

/*
 * 作者：赵国应
 * 时间：2018-12-31 00：26
 * 描述：文章点赞记录
 */
@Data
public class CommentLikesRecord {
    private long id;

    /**
     * 文章id
     */
    private long articleId;

    /**
     * 原作者
     */
    private String originalAuthor;

    /**
     * 评论的id
     */
    private long pId;

    /**
     * 点赞人
     */
    private int likerId;

    /**
     * 点赞时间
     */
    private String likeDate;

    public CommentLikesRecord() {
    }

    public CommentLikesRecord(long articleId, String originalAuthor, int pId, int likerId, String likeDate) {
        this.articleId = articleId;
        this.originalAuthor = originalAuthor;
        this.pId = pId;
        this.likerId = likerId;
        this.likeDate = likeDate;
    }
}
