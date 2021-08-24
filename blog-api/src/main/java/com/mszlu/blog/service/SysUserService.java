package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.SysUser;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.UserVo;

public interface SysUserService {

    UserVo findUserVoById(Long id);

    SysUser findAuthorById(Long id);

    SysUser findUser(String account, String password);

    /**
     * 获取用户信息
     * @param token
     * @return
     */
    Result findUserByToken(String token);

    /**
     * 根据账号查询用户名是否存在
     * @param account
     * @return
     */
    SysUser finUserByAccount(String account);

    /**
     *  保存用户信息
     * @param sysUser
     */
    void save(SysUser sysUser);
}
