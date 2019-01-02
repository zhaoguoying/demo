package com.example.demo.model;

import lombok.Data;

import java.util.List;
/*
@Data注解在类上时，简化java代码编写，为该类提供读写(get,set等等)属性，还提供了equals(),hashCode(),toString()方法
 */

/*
 * 作者：赵国应
 * 时间：2018-12-30 23：00
 * 描述：用户实体类
 */
@Data
public class User {

    private int id;

    /*
     * 手机号
     */
    private String phone;

    /*
     * 用户名
     */
    private String username;

    /*
     * 密码
     */
    private String password;

    /*
     * 性别
     */
    private String gender;

    /*
     * 真实姓名
     */
    private String trueName;

    /*
     * 生日
     */
    private String birthday;

    /*
     * 个人简介
     */
    private String personalBrief;

    /*
     * 邮箱
     */
    private String email;

    /*
     * 最后登录时间
     */
    private String recentlyLanded;

    /*
     * 头像地址
     */
    private String avatarImageUrl;

    /*
     * 角色关系，至少两个或者以上
     */
    private List<Role> roles;

    public User() {
    }

    public User(String phone, String username, String password, String gender) {
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

    public User(String phone, String username, String password, String gender, String trueName, String birthday, String personalBrief, String email, String recentlyLanded, String avatarImageUrl) {
        this.phone = phone;
        this.password = password;
        this.username = username;
        this.gender = gender;
        this.trueName = trueName;
        this.birthday = birthday;
        this.personalBrief = personalBrief;
        this.email = email;
        this.recentlyLanded = recentlyLanded;
        this.avatarImageUrl = avatarImageUrl;
    }

}
