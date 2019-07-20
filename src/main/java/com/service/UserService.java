package com.service;

import com.pojo.Users;

import java.util.Map;

public interface UserService {
    /**
     * 新增用户
     * @param users 新用户信息
     * @param uid 添加人的id
     * @return
     */
    Map<String,Object> addUserService(Users users,Integer uid);

    /**
     * 修改密码
     * @param users 用户信息
     * @return
     */
    Map<String,Object> savePassword(Users users);

    /**
     * 用户登录
     * @param users 用户信息
     * @return
     */
    Map<String,Object> login(Users users);

    /**
     * 用户列表查询
     * @param users 用户搜索信息
     * @param page 页码
     * @return
     */
    Map<String,Object> list(Users users,Integer page);
}
