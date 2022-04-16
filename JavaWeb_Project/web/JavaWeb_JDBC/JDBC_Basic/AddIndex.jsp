<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-04-07
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
<form action="AddFirst.jsp" method="post">
    <table>
        <th colspan="2">添加学生信息</th>
        <tr>
            <td>学生学号:</td>
            <td><input type="text" name="stuid" id="stuid"></td>
        </tr>
        <tr>
            <td>学生姓名:</td>
            <td><input type="text" name="stuname" id="stuname"></td>
        </tr>
        <tr>
            <td>出生日期:</td>
            <td><input type="text" name="stubirthday" id="stubirthday"></td>
        </tr>
        <tr>
            <td>所在班级:</td>
            <td><input type="text" name="stuclass" id="stuclass"></td>
        </tr>
        <tr aria-rowspan="2">
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>
