package com.example.demo.controller;

/*
 * 作者：赵国应
 * 时间：2018-01-01 12:50
 * 描述：
 */

import com.example.demo.service.ArchiveService;
import com.example.demo.service.ArticleService;
import com.example.demo.utils.TransCodingUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class ArchivesControl {
    @Resource
    ArchiveService archiveService;
    @Resource
    ArticleService articleService;

    /**
     * 获得所有归档日期以及每个归档日期的文章数目
     * @return
     */
    @GetMapping("/findArchiveNameAndArticleNum")
    public JSONObject findArchiveNameAndArticleNum(){
        return archiveService.findArchiveNameAndArticleNum();
    }

}
