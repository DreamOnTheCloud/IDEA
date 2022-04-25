<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-04-12
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>开除学生</title>
</head>
<body>
<form action="DeleteFirst.jsp" method="post">
    <table>
        <th colspan="2">开除学生</th>
        <tr>
            <td>学生学号:</td>
            <td><input type="text" name="stuid" id="stuid"></td>
        </tr>
        <tr aria-rowspan="2">
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>
