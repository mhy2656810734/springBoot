package com.example.demo.moduls;

import cn.hutool.db.nosql.mongo.MongoFactory;
import com.example.demo.entity.ArticleInfo;
import com.mongodb.MongoClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.core.index.Index;
import org.springframework.data.mongodb.core.index.IndexDefinition;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.ArrayList;
import java.util.List;


/**
 * @author mahaiyang
 * @date 2024/4/22 10:35
 */
public class Mongo implements MongoDbInterface{
    @Autowired
    private MongoTemplate mongoTemplate;
    /**
     * 创建索引
     * @param data 数据库字段
     */
    @Override
    public void createIndex(String data) {

        // 定义索引
        IndexDefinition indexDefinition = new Index().on(data, Sort.Direction.ASC);
        // 创建索引
        mongoTemplate.indexOps("mycollection").ensureIndex(indexDefinition);

    }

    @Override
    public void updateData(String data) {
       // 创建查询条件
        Criteria criteria = Criteria.where(data).is("mahaiyang");
        Query query = new Query(criteria);

        // 创建更新数据
        Update update = new Update().set(data, "张三");
        // 执行更新
        mongoTemplate.updateFirst(query, update, "mycollection");
    }

    @Override
    public void insertData(String data) {
        List<ArticleInfo> list = new ArrayList<>();
        ArticleInfo articleInfo1 = new ArticleInfo();
        articleInfo1.setId(1);
        articleInfo1.setTitle("标题1");
        list.add(articleInfo1);
        ArticleInfo articleInfo2 = new ArticleInfo();
        articleInfo2.setId(2);
        articleInfo2.setTitle("标题2");
        list.add(articleInfo2);
        mongoTemplate.insertAll(list);
    }
}
