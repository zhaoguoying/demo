package com.example.demo.model;

import lombok.Data;

/*
 * 作者：赵国应
 * 时间：2018-12-30 23：48
 * 描述：标签
 */

@Data
public class Tag {

    private int id;

    /**
     * 标签名
     */
    private String tagName;

    /**
     * 标签大小
     */
    private int tagSize;

    public Tag() {
    }

    public Tag(String tagName, int tagSize) {
        this.tagName = tagName;
        this.tagSize = tagSize;
    }
}
