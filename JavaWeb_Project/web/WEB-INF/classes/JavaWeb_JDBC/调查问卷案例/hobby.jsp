<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-04-12
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ page import="java.nio.charset.StandardCharsets" %>
<%String path = request.getContextPath();%>
<%String basePath = request.getScheme() + "//" + request.getServerName() + ":" + request.getServerPort() + path + "/";%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>爱好</title>
</head>
<body>
<%
    String name = request.getParameter("name");//获取用户姓名
    name = new String(name.getBytes("ISO-8859-1"),"UTF-8");
    String sex = request.getParameter("sex");
    if (sex.equals("man")){
        sex = "先生";
    }else {
        sex = "女士";
    }
    session.putValue("namesex",name + sex);
%>

<%@include file="images/top.jpg"%>
<p>
    <%=name%> <%=sex%> , 你好请继续完成调查
</p>
<p>你感兴趣的业余爱好有:</p>
<form name="form1" action="resule.jsp" method="post">
    <p>
        <input type="checkbox" name="hobby0" id="film" value="影视欣赏">
        影视欣赏
    </p>
    <p>
        <input type="checkbox" name="hobby1" id="book" value="阅读书籍">
        阅读书籍
    </p>
    <p>
        <input type="checkbox" name="hobby2" id="sports" value="体育运动">
        体育运动
    </p>
    <p>
        <input type="checkbox" name="hobby3" id="travel" value="户外旅游">
        户外旅游
    </p>
    <p>
        <input type="checkbox" name="hobby4" id="music" value="流行音乐">
        流行音乐
    </p>
    <p>
        <input type="submit" name="Submit" value="下一步">
        <input type="reset" name="Reset" value="重置">
    </p>
</form>
</body>
</html>
