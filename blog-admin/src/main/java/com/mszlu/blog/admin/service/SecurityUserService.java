package com.mszlu.blog.admin.service;

import com.mszlu.blog.admin.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class SecurityUserService implements UserDetailsService {

    @Autowired
    private AdminService adminService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        /**
         * 1.登录的时候会把username传到这里
         * 2.通过username查询admin表，如果admin存在，将密码告诉spring security
         * 3.如果不存在，认证失败，返回null
         */
        Admin admin = adminService.findAdminByUsername(username);
        if (admin == null) {
            return null;
        }
        UserDetails userDetails = new User(username,admin.getPassword(),new ArrayList<>());
        return userDetails;
    }
}
