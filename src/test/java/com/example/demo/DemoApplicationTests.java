package com.example.demo;

import com.example.demo.mapper.ArticleMapper;
import com.example.demo.mapper.CommentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Resource
	public ArticleMapper ArticleMapper;
	public CommentMapper l;
	@Test
	public void contextLoads() {
		System.out.println();
	}
	@Test
    public void h(){
	    System.out.println("\n\n\n\n"+ArticleMapper.findArticleById(1).getArticleCategories()+"\n\n\n\n");
    }
	@Test
    public void h2(){

	}

}

