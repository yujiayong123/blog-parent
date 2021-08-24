package com.mszlu.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mszlu.blog.dao.pojo.Tag;
import com.mszlu.blog.vo.Result;

import java.util.List;

public interface TagMapper extends BaseMapper<Tag> {
    /**
     * 根据文章id查询文章列表
     * @param articleId
     * @return
     */
    List<Tag> findTagsByArticleId(Long articleId);

    /**
     * 查询最热前n条标签
     * @param limit
     * @return
     */
    List<Long> findHotTagsIds(int limit);

    List<Tag> findTagsBTagIds(List<Long> tagIds);
}
