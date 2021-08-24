package com.mszlu.blog.service;

import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.params.CommentParam;

public interface CommentService {
    /**
     * 根据文章id查询评论
     * @param articleId
     * @return
     */
    Result findCommentsByArticleId(Long articleId);

    /**
     * 文章评论
     * @param commentParam
     * @return
     */
    Result comment(CommentParam commentParam);
}
