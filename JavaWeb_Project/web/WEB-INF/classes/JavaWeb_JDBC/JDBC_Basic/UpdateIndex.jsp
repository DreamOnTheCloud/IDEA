<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-04-12
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改学生数据</title>
</head>
<body>
<form action="UpdateFirst.jsp" method="post">
    <table>
        <th colspan="2">修改学生信息</th>
        <tr>
            <td colspan="2">指定需要被修改的学生信息</td>
        </tr>
        <tr>
            <td>学生学号:</td>
            <td><input type="text"name="stuid" id="stuid"></td>
        </tr>
        <tr>
            <td colspan="2">填写需要改正的学生信息</td>
        </tr>
        <tr>
            <td>出生日期:</td>
            <td><input type="text"name="stubirthday" id="stubirthday"></td>
        </tr>
        <tr>
            <td>所在班级:</td>
            <td><input type="text"name="stuclass" id="stuclasss"></td>
        </tr>
        <tr aria-colspan="2">
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>
