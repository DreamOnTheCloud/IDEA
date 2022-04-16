<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-03-24
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>login</title>
    <style>
      body{
        background: green;
      }
    </style>
  </head>
  <body>
  <form action="RequestShowInfo.jsp" method="post">
    <p align="center">user:<input type="text" name="userName"/></p>
    <p align="center">pass:<input type="password" name="passWord"/></p>
    <p align="center">
      <input type="submit" value="登录" name="Submit">
      <input type="reset" name="Reset">
    </p>
  </form>
  </body>
</html>
