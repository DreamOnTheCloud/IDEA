<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-03-28
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <form aciton="Request练习.jsp">
      <br>Get request results:
      <br><input type="text" name="myname">
      <br><input type="submit" name="get value">
  </form>
  返回HTTP 请求信息中使用的方法名称:<%=request.getMethod()%>
  <br>
  返回请求信息中调用Servlet 的URL 部分:<%=request.getServletPath()%>
  <br>
  返回HTTP GET 请求信息中URL 之后的查询字符串:<%=request.getQueryString()%>
  <br>
  返回请求实体的MIME 类型:<%=request.getContentType()%>
  <br>
  返回请求信息中的协议名名字和版本号:<%=request.getProtocol()%>
  <br>
  有关任何路径信息:<%=request.getPathInfo()%>
  <br>
  返回接受请求的服务器主机:<%=request.getServerName()%>
  <br>
  返回服务器的端口号:<%=request.getServerPort()%>
  <br>
  返回提交请求的客户机的规范名字:<%=request.getRemoteHost()%>
  <br>
  返回提交请求的客户机的IP地址:<%=request.getRemoteAddr()%>
  <br>
  返回请求中使用的模式（协议）名字:<%=request.getScheme()%>
  <br>
  返回这个request值，提交过来的值:<%=request.getParameter("myname")%>
  </body>
</html>
