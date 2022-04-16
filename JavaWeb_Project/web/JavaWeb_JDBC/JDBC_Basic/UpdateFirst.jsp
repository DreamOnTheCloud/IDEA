<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-04-12
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%request.setCharacterEncoding("UTF-8");%>
<%String id = request.getParameter("stuid");%>
<%String stuBirthday = request.getParameter("stubirthday");%>
<%String stuClass = request.getParameter("stuclass");%>
<html>
<head>
    <title>修改结果</title>
    <%!ResultSet rs;%>
    <%
        String dbName = "studb";
        String userName = "root";
        String userPasswd = "3715";
        String url = "jdbc:mysql://localhost/" + dbName + "?user=" + userName + "&password=" + userPasswd;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url);
        String sql = "update ignore student set birthday=?,stuclass=? where Number=?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,stuBirthday);
        preparedStatement.setString(2,stuClass);
        preparedStatement.setString(3,id);
        int result = preparedStatement.executeUpdate();
        if (result > 0){
            out.print("<script type='text/javascript'>alert('修改成功');</script>");
        }else {
            out.print("<script type='text/javascript'>alert('修改失败');</script>");
        }
        sql = "select * from student";
        rs = preparedStatement.executeQuery(sql);
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
        rs.close();
        preparedStatement.close();
            conn.close();
    %>
</table>
</body>
</html>
