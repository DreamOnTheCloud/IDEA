<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-03-26
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center><h3>用户输入界面</h3></center>
    <form action="Session_AnswerQuestion.jsp" method="post"> <!--提交到的地址为session2.jsp-->
        <table border="1" align="center" cellspacing="0">
            <tr>
                <td>
                    用户名:<input type="text" name="username" size="10" />
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="提交" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
