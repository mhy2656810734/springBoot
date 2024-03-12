package com.example.demo.mapper;

import com.example.demo.VO.ArticleInfoVO;
import com.example.demo.entity.ArticleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author mahaiyang
 * @date 2024/3/12 13:26
 */
@Mapper
public interface ArticleMapper {
    ArticleInfoVO getDetail(@Param("id") Integer id);
    List<ArticleInfoVO> getByIdList(@Param("uid")Integer uid);
}
