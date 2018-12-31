package com.example.demo.repository.mybaits.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

/*
 * 作者：赵国应
 * 时间：2018-12-31 17:10
 * 描述：
 */
@Repository
public class ArticleRepository {
    @Autowired
    RedisTemplate<Object, Object> redisTemplate;

    @SuppressWarnings("all")
    @Resource(name = "redisTemplate")
    ValueOperations<Object, Object> valueOps;
}
