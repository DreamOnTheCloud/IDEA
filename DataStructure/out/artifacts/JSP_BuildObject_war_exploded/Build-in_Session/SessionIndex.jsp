<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-03-26
  Time: 8:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session内置对象计数器</title>
    <style>
        h1,p{
            text-align: center;
        }
    </style>
</head>
<body>
<%! int Num = 0; //声明计数器变量%>
<%
    if (session.isNew()){
        Num += 1;
        session.setAttribute("Num" , Num);  //将name变量存入session
    }
%>
<h1>session计数器</h1>
<br/>
<p>
    您是第
    <%=session.getAttribute("Num")%>
    个访问本站的用户
</p>
</body>
</html>
