package com;

import com.config.JdbcTemplate;
import com.config.JdbcUtils;
import com.mapper.impl.UserDaoImpl;
import com.pojo.Job;
import com.pojo.Users;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;

public  class Test001 {
    public static void main(String[] args) {

        //Job job = new Job();
        Users users =new Users();
        UserDaoImpl userDao = new UserDaoImpl();
        //JdbcTemplate.update("insert into job (Jname) value(1232)");
        //JdbcTemplate.query("select * from job",job);
//       Users users=new Users();
//        users.setJid(1);
//        users.setUserName("12");
//        users.setPassword("123");
//        users.setTime("2019-07-19");
//        UserDaoImpl userDao=new UserDaoImpl();
//        userDao.addUser(users);

       users.setUserName("12");
//       userDao.addUser(users);
//        System.out.println(users.getUserName());
        System.out.println(userDao.findUser(users).getUserName());
//        userDao.findUser(users);

//        Job job = new Job();
        //JdbcTemplate.update("insert into job (Jname) value(1232)");
        //JdbcTemplate.query("select * from job",job);
       // Users users=new Users();
        users.setJid(1);
        users.setUserName("12");
        users.setPassword("123");
        users.setTime("2019-07-19");
//        UserDaoImpl userDao=new UserDaoImpl();
//        userDao.addUser(users);
        UserService userService = new UserServiceImpl();
        userService.login(users);



    }
}
