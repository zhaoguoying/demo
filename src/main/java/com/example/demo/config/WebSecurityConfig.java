package com.example.demo.config;

/*
 * 作者：赵国应
 * 时间：2018-01-01 20：00
 * 描述：SpringSecurity配置
 */

import com.example.demo.service.security.CustomUserServiceImpl;
import com.example.demo.utils.MD5Util;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    UserDetailsService customUserService(){
        return new CustomUserServiceImpl();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth)throws Exception{
        auth.userDetailsService(customUserService()).passwordEncoder(new PasswordEncoder() {
            MD5Util md5Util = new MD5Util();
            @Override
            public String encode(CharSequence charSequence) {
                return md5Util.encode((String) charSequence);
            }

            @Override
            public boolean matches(CharSequence charSequence, String s) {
                return s.equals(md5Util.encode((String)charSequence));
            }
        });
    }
}
