package com.example.demo.service;

/*
 * 作者：赵国应
 * 时间：2018-01-01 12:40
 * 描述：归档业务操作
 */


import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public interface ArchiveService {

    /**
     * 获得归档信息
     * @return
     */
    JSONObject findArchiveNameAndArticleNum();

    /**
     * 添加归档日期
     * @param archiveName
     */
    void addArchiveName(String archiveName);

}
