package com.example.demo;

import com.example.demo.mapper.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Resource
    public ArchiveMapper ArchiveMapper;
    /*
     * 每一个测试又要加这个，否则空指针异常，没办法自动加载
     */
    @Resource
    public TagMapper l;

    @Test
    public void contextLoads() {
        System.out.println();
    }

    @Test
    public void h() {
        System.out.println("\n" + ArchiveMapper.findArchives()+ "\n");
    }

    @Test
    public void h2() {
        System.out.println(l.findTagsCloud().hashCode());
    }

    @Test
    public void h3() {
        System.out.println("commentService.commentNum():");
    }
}

