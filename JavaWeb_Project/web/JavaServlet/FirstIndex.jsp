<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-04-26
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="RegisterServlet" method="post">
    <table align="center" border="0" bgcolor="#7fffd4">
        <tr>
            <th colspan="2" scope="col">用户注册</th>
        </tr>
        <tr bgcolor="#FFFFFF">
            <th scope="row">用户名:</th>
            <td><input type="text" name="userName"></td>
        </tr  02202002
        <tr bgcolor="#FFFFFF">
            <th scope="row">密码:</th>
            <td><input type="password" name="userPwd"></td>
        </tr>
        <tr bgcolor="#FFFFFF">
            <th scope="row">电子邮箱:</th>
            <td><input type="text" name="userEmail"></td>
        </tr>
        <tr bgcolor="#FFFFFF">
            <th scope="row">性别:</th>
            <td><input type="text" name="userSex"></td>
        </tr>
        <tr bgcolor="#FFFFFF">
            <th scope="row">教育水平:</th>
            <td>
                <select name="userEducation">
                    <option>研究生</option>
                    <option>本科</option>
                    <option>专科</option>
                    <option>初中</option>
                </select>
            </td>
        </tr>
        <tr bgcolor="#FFFFFF">
            <th scope="row">&nbsp;</th>
            <td>
                <input type="submit" name="submit" value="提交">
                <input type="reset" name="reset" value="重置">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
