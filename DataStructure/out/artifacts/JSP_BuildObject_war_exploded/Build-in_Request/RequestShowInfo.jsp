<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-03-24
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@page import="java.util.*" %>
<%
    //谁接受参数谁设置中文编码格式
    request.setCharacterEncoding("UTF-8");
%>
<%
    //定义枚举对象类型变量num并将表单中所有name参数的名称存进去
    Enumeration num = request.getParameterNames();
    while(num.hasMoreElements()){  //定义循环条件若还有下一个name的话就一直循环
        String ParameterName = (String) num.nextElement(); //定义变量ParameterName用来存每一个name参数的名称,每次循环存一个
        String ParameterValue = request.getParameter(ParameterName); //根据name参数名称获取name参数值
        out.print("参数名称:" + ParameterName + "<br/>");
        out.print("参数内容:" + ParameterValue + "<br/>");
    }
%>
</body>
</html>
