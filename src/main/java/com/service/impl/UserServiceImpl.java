package com.service.impl;

import com.config.UtilsCache;
import com.mapper.UserDao;
import com.mapper.impl.UserDaoImpl;
import com.pojo.Users;
import com.service.LoggerService;
import com.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();//加载持久层对象
    private LoggerService loggerService = new LoggerServiceImpl();////加载LoggerService对象
    @Override
    public Map<String, Object> addUserService(Users users,Integer uid) {
        Map<String, Object> map = new HashMap<>();
        if (users==null){
            map.put("code",0);
            map.put("msg","参数不能为空");
        }else {
            Integer integer = userDao.addUser(users);
            if (integer>0){
                //添加日志
                loggerService.addLogger(uid,"添加了新员工"+users.getUserName());
                UtilsCache.setUserUtils();//清空用户列表缓存
                UtilsCache.getLoggerUtils();//清空日志列表缓存
                map.put("code",200);
                map.put("msg","员工添加成功");
            }else {
                map.put("code",-4);
                map.put("msg","用户添加失败");
            }
        }
        return map;
    }

    @Override
    public Map<String, Object> savePassword(Users users) {
        Map<String, Object> map = new HashMap<>();
        if (users==null){
            map.put("code",0);
            map.put("msg","参数不能为空");
        }else{
            Integer update = userDao.update(users);
            if (update>0){
                //添加日志
                loggerService.addLogger(users.getId(),"密码修改成功");
                UtilsCache.getLoggerUtils();//清空日志列表缓存
                map.put("code",200);
                map.put("msg","密码修改成功");
            }else{
                map.put("code",-3);
                map.put("msg","密码修改失败");
            }
        }
        return map;
    }

    @Override
    public Map<String, Object> login(Users users) {
        Map<String, Object> map = new HashMap<>();
        if (users==null){
            map.put("code",0);
            map.put("msg","参数不能为空");
        }else {
            Users user = userDao.findUser(users);//查询用户信息
            if (user==null){
                map.put("code",-1);
                map.put("msg","用户名错误");
            }else if (user.getPassword().equals(users.getPassword())){
                map.put("code",-2);
                map.put("msg","密码错误");
            }else{
                user.setPassword(null);//密码置空
                //添加日志
                loggerService.addLogger(user.getId(),"登录成功");
                UtilsCache.getLoggerUtils();//清空日志列表缓存
                map.put("code",200);
                map.put("msg","登录成功");
                map.put("user",user);
            }
        }
        return map;
    }

    @Override
    public Map<String, Object> list(Users users,Integer page) {
        Map<String, Object> map = new HashMap<>();
        List<Users> userAll = UtilsCache.getUserUtils();
        if (page==null){
            page = 1;
        }
        Integer start = 5*(page-1);//起始下标
        Integer end = start+5;//结束下标
        map.put("count",userAll.size());
        map.put("userList",userAll.subList(start,end));
        return map;
    }
}
