package com.example.demo.mapper;

import com.example.demo.VO.ArticleInfoVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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

    @Test
    void getListByIdOrTitle() {
        Integer id = 1;
        String title = "";
        List<ArticleInfoVO> list = articleMapper.getListByIdOrTitle(id,title);
        System.out.println(list);
    }
    @Transactional
    @Test
    void delByList() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        int ret = articleMapper.delByList(list);
        System.out.println("删除成功");
    }
}