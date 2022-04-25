<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-04-24
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="Computer" class="jspSamples.unit5.javaBeanSamples.Computer"></jsp:useBean>
<jsp:getProperty name="Computer" property="*"/>
    <form action="ShowComputer.jsp" method="get">
        计算结果是:
        <span>
            <%
                if (request.getParameter("operator") != null){
                    String operator = request.getParameter("operator");
                    int oper = Integer.parseInt(operator);
                    if (oper == 4 && Computer.getTwoNum() == 0){
                        out.print("除数不可为0");
                    }else {

            %>
            <%=Computer.getOneNum()%>
            <%
                if (oper == 1){out.print("+");}
                if (oper == 2){out.print("-");}
                if (oper == 3){out.print("*");}
                if (oper == 4){out.print("/");}
            %>
            <%=Computer.getTwoNum()%>
            =
            <%=Computer.getResuleMethod()%>
            <%
                }
                }
            %>
        </span>

        <!--表达式显示-->
        <hr align="left" style="width: 400px">
        <div align="left" style="width: 400px">
            <p align="center">简单计算机</p>
            第一个参数<input type="text" name="num1"><br>
            <div style="padding-left: 100px">
                <select>
                    <option value="1">+</option>
                    <option value="2">-</option>
                    <option value="3">*</option>
                    <option value="4">/</option>
                </select>
            </div>
            第二个参数:<input type="text" name="num2"><br>
            <input type="submit" value="计算" style="padding-left: 100px">
        </div>
    </form>
</body>
</html>
