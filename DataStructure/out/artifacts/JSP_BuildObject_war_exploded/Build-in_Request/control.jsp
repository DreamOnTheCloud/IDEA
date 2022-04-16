<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-03-26
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if (request.getParameter("userName").equals("admin") && request.getParameter("passWord").equals("123456")){
        
%>
<jsp:forward page="loginOK.jsp"></jsp:forward>
<%
    }else {
%>
<jsp:forward page="loginERROR.jsp"></jsp:forward>
<%
    }
%>
</body>
</html>
