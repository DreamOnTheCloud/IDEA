<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-03-26
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center><h3>显示答案</h3></center>
<%! String food="";%>
<%
  request.setCharacterEncoding("UTF-8");
  food = request.getParameter("food"); //取得food参数值
  String name = (String)session.getValue("theusername"); //从session取出关键字为theusername的对象
%>
您的用户名：<%=name%>
<br>您喜欢的运动：<%=food%>
</body>
</html>
