<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-03-29
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*,java.text.*" %>
<html>
<head>
    <title>Application内置对象</title>
    <style>

    </style>
</head>
<body bgcolor="#abcdef">
<form action="checkMessage.jsp" method="post">
    请输入姓名:<input type="text" name="name"/><br/>
    请输入标题:<input type="text" name="title"/><br>
    请输入内容:<textarea cols="40" rows="10" name="message"></textarea>
    <br><br><br>
    <input type="submit" value="查看留言版">
</form>

</body>
</html>
