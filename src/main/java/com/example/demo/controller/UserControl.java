package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/*
 * @RestController整个类所有方法不再返回视图页面,全部返回方法中定义的返回内容,比如json:
 * @SuppressWarnings("all")屏蔽所以警告
 */
@RestController
@SuppressWarnings("all")
public class UserControl {
/*
 * @Autowired 注释，它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。
 */
    private Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserService userService;

}
