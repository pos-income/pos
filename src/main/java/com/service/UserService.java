package com.service;

import com.pojo.Users;

import java.util.Map;

public interface UserService {
    /**
     * 新增用户
     * @param users
     * @return
     */
    Map<String,Object> addUserService(Users users);

    /**
     * 修改用户信息
     * @param users
     * @return
     */
    Map<String,Object> saveUser(Users users);

    /**
     * 用户登录
     * @param users
     * @return
     */
    Map<String,Object> login(Users users);

    /**
     * 用户列表查询
     * @param users
     * @return
     */
    Map<String,Object> list(Users users);
}
