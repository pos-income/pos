package com.mapper;

import com.pojo.Users;

import java.util.List;

/**
 *
 */
public interface UserDao {
   Integer addUser(Users users);

   Integer update(Users users);

   Users findUser(Users users);

   List<Users> findUserAll(Users users);


}
