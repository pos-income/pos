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
    <title>商品下单</title>
    <script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="static/css/new_file.css" />
    <link rel="stylesheet" type="text/css" href="static/layui/css/layui.css" />
</head>
<body>
<div class="searchBox">
    <form class="layui-form" action="">
        <div class="layui-form-item" style="position: relative;">
            <label class="layui-form-label">商品搜索</label>
            <div class="layui-input-block">
                <input type="text" autocomplete="off" placeholder="商品id/名称" class="layui-input">
            </div>
            <!-- 显示商品搜索结果 -->
            <div class="search_commodity" style="display: none;">
                <table class="layui-table layui-form" style="text-align: center;">
                    <thead>
                    <tr>
                        <th>PID</th>
                        <th>商品名称</th>
                        <th>商品价格</th>
                        <th>商品剩余数量</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>36567</td>
                        <td>15912345678</td>
                        <td>YY187919</td>
                        <td>7</td>
                    </tr>
                    <tr>
                        <td>36567</td>
                        <td>15912345678</td>
                        <td>YY187919</td>
                        <td>7</td>
                    </tr>
                    <tr>
                        <td>36567</td>
                        <td>15912345678</td>
                        <td>YY187919</td>
                        <td>7</td>
                    </tr>
                    <tr>
                        <td>36567</td>
                        <td>15912345678</td>
                        <td>YY187919</td>
                        <td>7</td>
                    </tr>

                    </tbody>
                </table>
            </div>
        </div>
        <div>
            <table class="layui-table layui-form" style="text-align: center;">
                <thead>
                <tr>
                    <th>PID</th>
                    <th>商品名称</th>
                    <th>商品价格</th>
                    <th>商品数量</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>36567</td>
                    <td>15912345678</td>
                    <td>YY187919</td>
                    <td>
                        <button type="button" class="layui-btn layui-btn-sm subtract">-</button>
                        <div class="layui-input-inline" style="width: 50px; margin: 0px 5px;">
                            <input type="text" name="price_min" autocomplete="off" class="layui-input verifyInt" value="7">
                        </div>
                        <button type="button" class="layui-btn layui-btn-sm">+</button>
                    </td>
                </tr>
                <tr>
                    <td>36567</td>
                    <td>15912345678</td>
                    <td>YY187919</td>
                    <td><button type="button" class="layui-btn layui-btn-sm subtract">-</button>
                        <div class="layui-input-inline" style="width: 50px; margin: 0px 5px;">
                            <input type="text" name="price_min" autocomplete="off" class="layui-input verifyInt" value="7">
                        </div><button type="button" class="layui-btn layui-btn-sm">+</button>
                    </td>
                </tr>
                <tr>
                    <td>36567</td>
                    <td>15912345678</td>
                    <td>YY187919</td>
                    <td><button type="button" class="layui-btn layui-btn-sm subtract">-</button>
                        <div class="layui-input-inline" style="width: 50px; margin: 0px 5px;">
                            <input type="text" name="price_min" autocomplete="off" class="layui-input verifyInt" value="7">
                        </div><button type="button" class="layui-btn layui-btn-sm">+</button>
                    </td>
                </tr>
                <tr>
                    <td>36567</td>
                    <td>15912345678</td>
                    <td>YY187919</td>
                    <td><button type="button" class="layui-btn layui-btn-sm subtract">-</button>
                        <div class="layui-input-inline" style="width: 50px; margin: 0px 5px;">
                            <input type="text" name="price_min" autocomplete="off" class="layui-input verifyInt" value="7">
                        </div><button type="button" class="layui-btn layui-btn-sm">+</button>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </form>
</div>
<script src="static/layui/layui.js" type="text/javascript" charset="utf-8"></script>
<script src="static/js/new_file.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">

</script>
</body>
</html>

