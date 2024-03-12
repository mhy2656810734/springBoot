package com.example.demo.mapper;

import com.example.demo.VO.ArticleInfoVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author mahaiyang
 * @date 2024/3/12 13:35
 */
@SpringBootTest
class ArticleMapperTest {
    @Autowired
    private ArticleMapper articleMapper;
    @Test
    void getDetail() {
        ArticleInfoVO articleInfoVO = articleMapper.getDetail(1);
        System.out.println(articleInfoVO);
    }

    @Test
    void getByIdList() {
        List<ArticleInfoVO> list = articleMapper.getByIdList(1);
        list.stream().forEach(System.out::println);
    }
}