<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-04-07
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<html>
<%request.setCharacterEncoding("UTF-8");  //用变量接收前台的所有数据并存在变量里面%>
<%String id = request.getParameter("stuid");%>
<%String stuName = request.getParameter("stuname");%>
<%String stuBirthday = request.getParameter("stubirthday");%>
<%String stuClass = request.getParameter("stuclass");%>
  <head>
    <title>添加学生</title>
    <%!ResultSet rs;%>
    <%
      String dbName = "studb";
      String userName = "root";
      String userPasswd = "3715";
      String url = "jdbc:mysql://localhost/" + dbName + "?user=" + userName + "&password=" + userPasswd;
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = DriverManager.getConnection(url);
      Statement statement = conn.createStatement();
      String sql = "insert ignore into student values ('" + id + "' , '" + stuName + "' , '" + stuBirthday + "', '" + stuClass + "' )";
      int result = statement.executeUpdate(sql);
      if (result > 0){
        out.print("<script type='text/javascript'>alert('添加成功');</script>");
      }else {
        out.print("<script type='text/javascript'>alert('添加失败');</script>");
      }
      sql = "select * from student";
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
      rs.close();
      statement.close();
      conn.close();
    %>
  </table>
  </body>
</html>
