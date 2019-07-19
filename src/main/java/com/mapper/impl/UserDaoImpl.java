package com.mapper.impl;

import com.config.JdbcTemplate;
import com.mapper.UserDao;
import com.pojo.Users;

import java.util.List;

public class UserDaoImpl implements UserDao {
    /**
     * 实例化jdbc对象
     */
    JdbcTemplate<Users> jdbcTemplate =new JdbcTemplate<>();

    /**
     *
     * @param users
     * @return
     */
    @Override
    public Integer addUser(Users users) {
        //添加功能测试通过
        Integer i = JdbcTemplate.update("insert into users (Jid,UserName,Password,Time) values(?,?,?,?)",
                users.getJid(),users.getUserName(),users.getPassword(),users.getTime());
        return i;
    }

    /**
     *
     * @param users
     * @return
     */
    @Override
    public Integer update(Users users) {
        Integer i = JdbcTemplate.update("update users set Password=? where Email=?",
                users.getPassword(),users.getEmail());
        return i;
    }

    /**
     *
     * @param users
     * @return
     */
    @Override
    public Users findUser(Users users) {
        List<Users> query = jdbcTemplate.query("select * from users where id=?", users.getId());
        Users user = (Users) query.get(0);
        return user;
    }

    /**
     *
     * @param users
     * @return
     */
    @Override
    public List<Users> findUserAll(Users users) {
        List<Users> userAll = jdbcTemplate.query("select * from users", users);
        return userAll;
    }
}
