package com.example.demo.controller;

import com.example.demo.service.CommentService;
import com.example.demo.service.LeaveMessageService;
import com.example.demo.service.PrivateWordService;
import com.example.demo.service.UserService;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


/*
 * 作者：赵国应
 * 时间：2019-01-01 11：45
 * 描述：
 */
@RestController
@SuppressWarnings("all")
public class UserControl {

}
