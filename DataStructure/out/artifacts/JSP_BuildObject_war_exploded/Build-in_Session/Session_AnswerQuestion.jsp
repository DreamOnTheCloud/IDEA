<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-03-26
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center><h3>回答问题页面</h3></center>
<%
    request.setCharacterEncoding("UTF-8"); //设置接受的中文编码格式为UTF-8
    String username = request.getParameter("username"); //获得传递参数username
    session.setAttribute("theusername",username); //把用户名保存在session中，String可以当着对象
%>
<p>您的用户名为：<%=username%><p>
    <!—提交表单 -->
<form action="Session_ShowAnswer.jsp">
    <table border="1" align="center">
        <tr><td>您喜欢的运动是?：<input type="text" name="food" size="10"></td></tr>
        <tr><td align="center"><input type="submit" value="提交"></td></tr>
    </table>
</form>
</body>
</html>
