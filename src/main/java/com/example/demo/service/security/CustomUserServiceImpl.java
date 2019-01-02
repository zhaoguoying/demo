package com.example.demo.service.security;

/*
 * 作者：赵国应
 * 时间：2018-01-01 20:23
 * 描述：用户登录处理
 */

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.mybaits.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String phone) throws UsernameNotFoundException {
        User user = userRepository.findByPhone(phone);
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在");
        }
        TimeUtil timeUtil = new TimeUtil();
        /*
         * 年-月-日 时:分:秒
         */
        String recentlyLanded = timeUtil.getFormatDateForSix();
        /*
         * 更新最近登陆时间
         */
        userService.updateRecentlyLanded(user.getUsername(), recentlyLanded);
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for ( Role role : user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),authorities);
    }
}
