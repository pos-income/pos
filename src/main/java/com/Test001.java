package com;

import com.config.JdbcTemplate;
import com.config.JdbcUtils;
import com.mapper.impl.UserDaoImpl;
import com.pojo.Job;
import com.pojo.Users;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;

public  class Test001 {
    public static void main(String[] args) {
        Job job = new Job();
        //JdbcTemplate.update("insert into job (Jname) value(1232)");
        //JdbcTemplate.query("select * from job",job);
        Users users=new Users();
        users.setJid(1);
        users.setUserName("12");
        users.setPassword("123");
        users.setTime("2019-07-19");
        UserDaoImpl userDao=new UserDaoImpl();
        userDao.addUser(users);


    }
}
