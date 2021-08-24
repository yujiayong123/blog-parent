package com.mszlu.blog.service;

import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.TagVo;

import java.util.List;

public interface TagService {

    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);

    /**
     * 查询所有标签
     * @return
     */
    Result findAll();

    /**
     * 查询导航栏中文章分类下的所有标签
     * @return
     */
    Result findAllDetail();

    /**
     * 根据id查询标签详情
     * @param id
     * @return
     */
    Result findDetailById(Long id);
}
