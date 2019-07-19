package com.mapper;

import com.pojo.Users;

import java.util.List;

/**
 *Dao层对用户的曾加、修改、查找
 */
public interface UserDao {
   //增加方法接口  返回受影响行数
   Integer addUser(Users users);
   //修改方法接口   返回受影响行数
   Integer update(Users users);
   //查找单个用户方法接口  返回查到的用户信息
   Users findUser(Users users);
   //查找多个用户方法接口  返回一个集合数组
   List<Users> findUserAll(Users users);


}
