package com.example.demo.service.impl;

/*
 * 作者：赵国应
 * 时间：2018-01-01 13:25
 * 描述：
 */

import com.example.demo.mapper.ArchiveMapper;
import com.example.demo.service.ArchiveService;
import com.example.demo.service.ArticleService;
import com.example.demo.utils.TimeUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArchiveServiceImpl implements ArchiveService {
    @Autowired
    ArchiveMapper archiveMapper;
   // @Autowired
    //ArticleService articleService;

    @Autowired
    public JSONObject findArchiveNameAndArticleNum(){
        List<String> archies = archiveMapper.findArchives();
        /*
         * 用[{"1":"1"}] 用数组形式输出，数据的外围加上[]
         */
        JSONArray archivesJsonArray = new JSONArray();
        /*
         * 数据外围不加上[]
         */
        JSONObject archiveJson;
        TimeUtil timeUtil = new TimeUtil();
        for (String archiveNmae : archies){
            archiveJson = new JSONObject();
            archiveJson.put("archiveName",archiveNmae);
            archiveNmae = timeUtil.timeYearToWhippletree(archiveNmae);
           // archiveJson.put("archiveArticleNum",articleService.countArticleArchiveByArchive(archiveNmae));
            archivesJsonArray.add(archiveJson);
        }
        JSONObject returnJson = new JSONObject();
        returnJson.put("status",200);
        returnJson.put("restule",archivesJsonArray);
        return returnJson;
    }

    @Override
    public void addArchiveName(String archiveName){
        int archiveNameIsExit = archiveMapper.findArchiveNameByArchiveName(archiveName);
        if(archiveNameIsExit == 0){
            archiveMapper.addArchiveName(archiveName);
        }
    }
}
