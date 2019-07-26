<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/26
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title></title>
    <script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="static/css/new_file.css" />
    <link rel="stylesheet" type="text/css" href="static/layui/css/layui.css" />
</head>
<body>
<!--顶栏-->
<header>
    <div class="headertext">
        <i class="layui-icon" style="color: #FFFFFF;">&#xe715;</i>
        <a style="color: #FFFFFF;" href="index.html">超市收银系统</a>
    </div>
</header>
<div id="main">
    <div class="left">
        <div class="left_tr" style="background-color: rgb(40, 49, 60);color: #009688;">
            <i class="layui-icon layui-icon-home left_text"></i>
            <a href="#" style="color: #009688;">首页</a>
        </div>
        <div class="left_tr">
            <i class="layui-icon layui-icon-cart-simple left_text"></i>
            <a href="#">商品下单</a>
        </div>
        <div class="left_tr">
            <i class="layui-icon layui-icon-username left_text"></i>
            <a href="#">个人管理</a>
        </div>
        <div class="left_tr">
            <i class="layui-icon layui-icon-user left_text"></i>
            <a href="#">员工管理</a>
        </div>
        <div class="left_tr">
            <i class="layui-icon layui-icon-cart left_text"></i>
            <a href="#">商品管理</a>
        </div>
        <div class="left_tr">
            <i class="layui-icon layui-icon-rmb left_text"></i>
            <a href="#">账单查询</a>
        </div>
        <div class="left_tr">
            <i class="layui-icon layui-icon-list left_text"></i>
            <a href="#">日志</a>
        </div>

        <div class="left_tr">
            <i class="layui-icon layui-icon-return left_text"></i>
            <a href="#">退出</a>
        </div>
    </div>
    <div class="right">
        <iframe frameborder="0" scrolling="no" src="order.html"  class="right_iframe"></iframe>
    </div>
</div>
<script src="static/layui/layui.js" type="text/javascript" charset="utf-8"></script>
<script src="static/js/new_file.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>

