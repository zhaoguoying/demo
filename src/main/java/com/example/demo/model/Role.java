package com.example.demo.model;

/*
 * 作者：赵国应
 * 时间：2018-12-30 23：52
 * 描述：权限
 */

import lombok.Data;

@Data
public class Role {
    private int id;

    private String name;

    public Role(){

    }

    public Role(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
