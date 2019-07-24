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
     *添加用户信息
     * @param users
     * @return
     */
    @Override
    public Integer addUser(Users users) {
        //添加功能测试通过
        Integer addUserMethed = JdbcTemplate.update(null,"insert into users (Jid,UserName,Password,Time,Email) values(?,?,?,?,?)",
                users.getJid(),users.getUserName(),users.getPassword(),users.getTime(),users.getEmail());
        return addUserMethed;
    }

    /**
     *通过Email修改密码
     * @param users
     * @return
     */
    @Override
    public Integer update(Users users) {
        Integer updateUserMethed = JdbcTemplate.update(null,"update users set Password=? where Email=?",
                users.getPassword(),users.getEmail());
        return updateUserMethed;
    }

    /**
     *通过UserName查询
     * @param users
     * @return
     */
    @Override
    public Users findUser(Users users) {
        List<Users> findUserMethed = jdbcTemplate.query("select * from users where UserName=?",
                users,users.getUserName());
        Users user = (Users) findUserMethed.get(0);
        return user;
    }

    /**
     *查询所有用户信息
     * @param
     * @return
     */
    @Override
    public List<Users> findUserAll(Users users) {
        List<Users> findUserAllMethed = jdbcTemplate.query("select * from users",
                new Users(),null);
        return findUserAllMethed;
    }

    /**
     * 通过id修改登录状态
     * @param users
     * @return
     */
    @Override
    public Integer updataLog(Users users) {
        Integer updataLogMethed = JdbcTemplate.update(null,"update users set IsLog=? where Id=?",
                users.getIsLog(), users.getId());
        return updataLogMethed;
    }
}
