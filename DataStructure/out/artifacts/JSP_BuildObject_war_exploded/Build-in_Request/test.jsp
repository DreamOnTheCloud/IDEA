<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-03-26
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            text-align: center;
            margin: 200px auto;
            border: 10px solid yellow;
        }
    </style>
</head>
<body bgcolor="green">
<form action="control.jsp" method="post">
    <table>
        <tr>
            <td>
                用户名:
            </td>
            <td>
                <input type="text" name="userName">
            </td>
        </tr>
        <tr>
            <td>
                密码:
            </td>
            <td>
                <input type="password" name="passWord">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="登录">
            </td>
        </tr>
    </table>
</body>
</html>
