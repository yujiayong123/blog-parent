package com.mszlu.blog.controller;

import com.mszlu.blog.service.CommentService;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.params.CommentParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("comments")
public class CommentsController {
    @Autowired
    private CommentService commentService;

    @GetMapping("article/{id}")
    public Result findCommentsByArticleId(@PathVariable("id") Long articleId) {
        return commentService.findCommentsByArticleId(articleId);
    }

    @PostMapping("create/change")
    public Result comment(@RequestBody CommentParam commentParam) {
        return commentService.comment(commentParam);
    }
}
