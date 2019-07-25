package com.controller;

import com.pojo.Users;
import com.service.UserService;
import com.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

//添加用户
@WebServlet("/addUser")
public class AddUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        //获取管理员的ID
        Integer userId = (Integer)session.getAttribute("UserId");
        //获取前端传过来的值：用户名（name）、用户密码（password）、用户邮箱（email）
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        //将获取到的值封装到Users对象中
        Users user = new Users();
        user.setUserName(name);
        user.setPassword(password);
        user.setEmail(email);
        //向数据库中添加用户
        UserService userServiceImpl = new UserServiceImpl();
        Map<String, Object> map = userServiceImpl.addUserService(user, userId);
        //将结果返回给前端
        session.setAttribute("addUserResultMap",map);
    }
}
