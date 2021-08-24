package com.mszlu.blog.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mszlu.blog.dao.mapper.ArticleMapper;
import com.mszlu.blog.dao.pojo.Article;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class ThreadService {

    @Async("taskExecutor")
    public void updateArticleViewCount(ArticleMapper articleMapper, Article article) {
        try {
            int viewCounts = article.getViewCounts();
            Article updateArticle = new Article();
            updateArticle.setViewCounts(viewCounts+1);
            LambdaQueryWrapper<Article> updateWrapper = new LambdaQueryWrapper<>();
            updateWrapper.eq(Article::getId,article.getId());
            updateWrapper.eq(Article::getViewCounts,viewCounts);
//            update article set view_count = 100 where id = 11 and view_count = 99
            articleMapper.update(updateArticle,updateWrapper);
            Thread.sleep(5000);
            System.out.println("更新完成。。。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
