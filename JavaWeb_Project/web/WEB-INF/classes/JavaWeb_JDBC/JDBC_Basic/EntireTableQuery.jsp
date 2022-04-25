<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-04-07
  Time: 8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<html>
<head>
    <title>整表查询</title>
    <%!ResultSet rs;%>
    <%
        //连接数据库,库名,数据库用户名,密码
        String dbName = "studb";
        String userName = "root";
        String userPasswd = "3715";
        String url = "jdbc:mysql://localhost/" + dbName + "?user=" + userName + "&password=" + userPasswd; //定义url集成他们
        Class.forName("com.mysql.cj.jdbc.Driver"); //注册驱动
        Connection conn = DriverManager.getConnection(url);
        Statement statement = conn.createStatement();
        String sql = "select * from student";
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
        <%while (rs.next()){%>
        <tr style="text-align: center">
            <td><%=rs.getString(1)%></td>
            <td><%=rs.getString(2)%></td>
            <td><%=rs.getString("birthday")%></td>
            <td><%=rs.getString("stuclass")%></td>
        </tr>
        <%}%>

        <%
            //用完关闭
            rs.close();
            statement.close();
            conn.close();
        %>
    </table>
</body>
</html>
