<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/26
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>修改密码</title>
    <script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="static/css/new_file.css" />
    <link rel="stylesheet" type="text/css" href="static/layui/css/layui.css" />
</head>

<body>
<div class="ChangePassword">
    <h2>修改密码</h2>
    <form class="layui-form" method="post" target="_blank" action="">
        <div class="layui-form-item">
            <input type="email" id="email" name="email" placeholder="邮箱" required lay-verify="required" class="layui-input">
            <i class="layui-icon input-icon">&#xe66f;</i>
        </div>
        <div class="layui-form-item">
            <input type="verification" id="verification" name="verification" placeholder="验证码" required lay-verify="required"
                   class="layui-input">
            <i class="layui-icon input-icon">&#xe679;</i>
        </div>
        <div class="layui-form-item">
            <button type="button" id="verificationCode" class="layui-btn layui-btn-xs layui-btn-radius layui-btn-normal">获取验证码</button>
        </div>
        <div class="layui-form-item">
            <input type="password" id="password" name="pwd" placeholder="密码" required lay-verify="required" class="layui-input">
            <i class="layui-icon input-icon">&#xe673;</i>
        </div>
        <div class="layui-form-item">
            <input type="password" id="password2" name="pwd2" placeholder="确定密码" required lay-verify="required" class="layui-input">
            <i class="layui-icon input-icon">&#xe673;</i>
        </div>
        <div class="layui-form-item">
            <span id="passwordHint"></span>
        </div>
        <div class="layui-form-item">
            <button style="width: 100%" id="userlogin" class="layui-btn" type="button" lay-filter="login">提交</button>
        </div>
    </form>
</div>
<script src="static/layui/layui.js" type="text/javascript" charset="utf-8"></script>
<script src="static/js/new_file.js" type="text/javascript" charset="utf-8"></script>
</body>

</html>

