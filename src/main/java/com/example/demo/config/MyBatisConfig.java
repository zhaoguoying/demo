package com.example.demo.config;

/*
 * 作者：赵国应
 * 时间：2018-01-01 20：40
 * 描述：配置
 */

import org.apache.ibatis.type.TypeAliasRegistry;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class MyBatisConfig {
    @Resource
    private DataSource dataSource;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactoryBean(ApplicationContext applicationContext)throws IOException{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath*:mapper/*.xml"));

        //别名注册
        TypeAliasRegistry typeAliasRegistry = new TypeAliasRegistry();
        typeAliasRegistry.registerAlias("STDOUT_LOGGING",MyBatisConfig.class);
        return sqlSessionFactoryBean;
    }

}
