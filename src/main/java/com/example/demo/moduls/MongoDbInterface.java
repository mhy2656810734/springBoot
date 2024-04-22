package com.example.demo.moduls;

/**
 * @author mahaiyang
 * @date 2024/4/22 10:34
 */
public interface MongoDbInterface {
    public void createIndex(String data);
    // 执行修改操作
    public void updateData(String data);
    // 添加数据
    public void insertData(String data);

}
