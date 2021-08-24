package com.mszlu.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mszlu.blog.dao.pojo.SysUser;
import org.apache.ibatis.annotations.Mapper;


public interface SysUserMapper extends BaseMapper<SysUser> {
    SysUser findAuthorById(Long id);
}
