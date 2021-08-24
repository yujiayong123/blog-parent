package com.mszlu.blog.controller;

import com.mszlu.blog.common.app.LogAnnotation;
import com.mszlu.blog.common.cache.Cache;
import com.mszlu.blog.service.ArticleService;
import com.mszlu.blog.vo.ArticleVo;
import com.mszlu.blog.vo.params.ArticleParam;
import com.mszlu.blog.vo.params.PageParams;
import com.mszlu.blog.vo.Result;
import io.lettuce.core.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("articles")
public class ArticleController {
    /**
     * 首页 文章列表
     * @param pageParams
     * @return
     */

    @Autowired
    private ArticleService articleService;

    @PostMapping
    @LogAnnotation(module = "文章",operator = "获取文章列表")
    @Cache(expire = 5 * 60 * 1000,name = "list_article")
    public Result listArticle(@RequestBody PageParams pageParams) {
        return articleService.listArticle(pageParams);
    }

    /**
     * 最热文章
     * @return
     */
    @PostMapping("hot")
    @Cache(expire = 5 * 60 * 1000,name = "hot_article")
    public Result hotsArticle() {
        int limit = 5;
        return articleService.hotsArticle(limit);
    }

    /**
     * 最新文章
     * @return
     */
    @PostMapping("new")
    @Cache(expire = 5 * 60 * 1000,name = "new_article")
    public Result newArticle() {
        int limit = 5;
        return articleService.newArticle(limit);
    }

    /**
     * 文章归档
     * @return
     */
    @PostMapping("listArchives")
    public Result listArchives() {
        return articleService.listArchives();
    }

    /**
     * 文章详情
     * @param articleId
     * @return
     */
    @PostMapping("view/{id}")
    public Result findArticleById(@PathVariable("id") Long articleId) {
        return articleService.findArticleById(articleId);
    }

    /**
     * 文章发布
     * @param articleParam
     * @return
     */
    @PostMapping("publish")
    public Result publish (@RequestBody ArticleParam articleParam) {
        return articleService.publish(articleParam);
    }
}
