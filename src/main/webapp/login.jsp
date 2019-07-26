<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/26
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>登陆</title>
    <script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="static/css/new_file.css" />
    <link rel="stylesheet" type="text/css" href="static/layui/css/layui.css" />
</head>
<body>
<div class="login">
    <h2>超市收银系统</h2>
    <form class="layui-form" method="post" target="_blank" action="">
        <div class="layui-form-item">
            <input type="username" name="user" placeholder="用户名" id="username" required lay-verify="required" class="layui-input">
            <i class="layui-icon input-icon">&#xe66f;</i>
        </div>
        <div class="layui-form-item">
            <input type="password" name="pwd" placeholder="密码" id="password" required lay-verify="required" class="layui-input">
            <i class="layui-icon input-icon">&#xe673;</i>
        </div>
        <div class="layui-form-item">
            <input type="checkbox" name="box" lay-skin="primary" title="记住密码" checked=""> <a class="back" href="ChangePassword.jsp"
                                                                                             style="margin-top: 10px">忘记密码</a>
        </div>
        <div class="layui-form-item">
            <button style="width: 100%" id="login_submit" class="layui-btn" type="button">立即登录</button>
        </div>
    </form>
    <script src="static/layui/layui.js" type="text/javascript" charset="utf-8"></script>
    <script src="static/js/new_file.js" type="text/javascript" charset="utf-8"></script>
</div>
</body>
</html>
</html>

