<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-04-07
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%
    //获取到输入的学号,根据此学号查询
    String id = request.getParameter("stuid");
%>
<html>
<head>
    <title>条件查询</title>
    <%!ResultSet rs;%>
    <%
        String dbName = "studb";
        String userName = "root";
        String userPasswd = "3715";
        String url = "jdbc:mysql://localhost/" + dbName + "?user=" + userName + "&password=" + userPasswd;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url);
        Statement statement = conn.createStatement();
        String sql = "select * from student where number = '" + id + "'";
        rs = statement.executeQuery(sql);
    %>
</head>
<body>
<table border="1" cellspacing="0">
    <th colspan="4" style="font-size: x-large;alignment: center">学生信息表</th>
    <tr style="text-align: center">
        <td>学号</td>
        <td>姓名</td>
        <td>出生日期</td>
        <td>所在班级</td>
    </tr>
    <%while (rs.next()){ //判断还有下一个%>
    <tr style="text-align: center">
        <td><%=rs.getString(1)%></td>
        <td><%=rs.getString(2)%></td>
        <td><%=rs.getString("birthday")%></td>
        <td><%=rs.getString("stuclass")%></td>
    </tr>
    <%}%>

    <%
        //用完关闭资源
        rs.close();
        statement.close();
        conn.close();
    %>
</table>
</body>
</html>
