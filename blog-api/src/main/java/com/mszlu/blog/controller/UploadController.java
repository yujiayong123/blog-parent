//package com.mszlu.blog.controller;
//
//import com.mszlu.blog.utils.QiniuUtils;
//import com.mszlu.blog.vo.Result;
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.util.UUID;
//
//@RestController
//@RequestMapping("Upload")
//public class UploadController {
//
//    @Autowired
//    private QiniuUtils qiniuUtils;
//
//    @PostMapping
//    public Result upload(@RequestParam("image") MultipartFile file) {
//        // 原始文件名称
//        String originalFilename = file.getOriginalFilename();
//        // 唯一的文件名称
//        String fileName = UUID.randomUUID().toString() + "." + StringUtils.substringAfterLast(originalFilename,".");
//        // 文件上传到哪里？ 七牛云
//        boolean upload = qiniuUtils.upload(file, fileName);
//        if (upload) {
//            return Result.success(QiniuUtils.url + fileName);
//        }
//        return Result.fail(20001,"上传失败");
//    }
//}
