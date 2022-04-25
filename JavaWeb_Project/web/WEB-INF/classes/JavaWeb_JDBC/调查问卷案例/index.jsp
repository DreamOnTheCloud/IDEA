<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-04-12
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<%@include file="top.html"%>
<form action="hobby.jsp" method="post">
    <table border="1">
        <tr>
            <td colspan="2">
                    欢迎参加网上调查
            </td>
        </tr>
        <tr>
            <td>姓名:</td>
            <td><input type="text" name="name" size="16"></td>
        </tr>
        <tr>
            <td>性别:</td>
            <td>
                <input type="radio" name="sex" value="man" checked>男&nbsp;
                <input type="radio" name="sex" value="woman" checked>女
            </td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
            <td><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>
</body>
</html>
