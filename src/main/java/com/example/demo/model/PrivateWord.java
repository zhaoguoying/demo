package com.example.demo.model;

/*
 * 作者：赵国应
 * 时间：2018-12-30 23：58
 * 描述：悄悄话
 */

import lombok.Data;

@Data
public class PrivateWord {
    private int id;

    /**
     * 悄悄话内容
     */
    private String privateWord;

    /**
     * 发布者
     */
    private int publisherId;

    /**
     * 回复者
     */
    private int  replierId;

    /**
     * 回复内容
     */
    private String replyContent;

    /**
     * 发布时间
     */
    private String publisherDate;

    public PrivateWord() {
    }

    public PrivateWord(String privateWord, int publisherId, String publisherDate) {
        this.privateWord = privateWord;
        this.publisherId = publisherId;
        this.publisherDate = publisherDate;
    }
}
