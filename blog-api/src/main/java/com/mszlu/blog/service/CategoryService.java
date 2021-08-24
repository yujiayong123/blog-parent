package com.mszlu.blog.service;

import com.mszlu.blog.vo.CategoryVo;
import com.mszlu.blog.vo.Result;

import java.util.List;

public interface CategoryService {
    CategoryVo findCategoryById(Long categoryId);

    /**
     * 查询所有文章分类
     * @return
     */
    Result findAll();

    /**
     * 查询所有文章分类
     * @return
     */
    Result findAllDetail();

    /**
     * 根据id查询分类详情
     * @param id
     * @return
     */
    Result categoryDetailById(Long id);
}
