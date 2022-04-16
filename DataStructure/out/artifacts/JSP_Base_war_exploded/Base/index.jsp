<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-03-12
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <style>
        .a{border: 1px solid red}
    </style>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Script脚本Statement声明Expression表达式</title
    <%!
        //【1】JSP声明变量与方法--一般写在头标签--表示全局作用域------------------------------------------------------------------
        public int count = 5;
        public int i;
        public String url = "Expression.jsp";

        public String info() {  //声明String类型的方法并返回Hello
            return "Hello";
        }
    %>
</head>

<body>
<%
    out.println(count++); //每次刷新页面count的值加一
    out.println("<a href='#'>" + info() + "</a>"); //JSP脚本内可添加HTML标签需要用" "包括
%>

<hr>

<%
    //【2】JSP脚本,单个程序段可以不完整但最后结果必须完整-----------------------------------------------------------------------
    for (int i = 0; i <= 1; i++) {   //单个程序段不完整,少个花括号
%>
<h1>你好,张先生！</h1>
<%
    }   //循环收尾最后结果完整,补上花括号
%>

<hr>

<!--【3】JSP表达式--将JSP页面转为Servlet后,用out.println()输出表达式的值---------------------------------------------------->
<!--表达式里面的url变量就是Expression.jsp的地址作为值写在超链接与表单里面-->
<a href="<%=url%>">点击跳转</a>
<form name="form1" action="<%=url%>">
    <input type="submit" value="点击跳转"/>
</form>

<hr>
<!--打印9*9到表格里面-->
<table>
    <%
        for (int i = 1; i < 10; i++){  //外层循环打印tr行的个数
    %>
    <tr>
        <%
            for (int j = 1; j <= i; j++){ //内层循环打印每行tr有多少td列
        %>
        <td class="a"><%out.print(i + "*" + j + "=" + i * j); request.setCharacterEncoding("UTF-8");%></td>
            <%
                }
            %>
    </tr>
    <%
        }
    %>
</table>

<%--JSP静态引入文件:很简单直接<%@include file="要引入的文件url地址 添加主文件那里就在那里展示子文件内容"%>--%>
<%@include file="Expression.jsp"%>

<%--JSP动态包含文件:很简单直接<jsp:include page="url地址" 客户端执行时>--%>
<jsp:include page="Date.jsp">
    <jsp:param name="userName" value="张宇"></jsp:param>
    <jsp:param name="float" value="8.555"></jsp:param>
    <jsp:param name="PI" value="3.1415926"></jsp:param>
</jsp:include>
</body>
</html>