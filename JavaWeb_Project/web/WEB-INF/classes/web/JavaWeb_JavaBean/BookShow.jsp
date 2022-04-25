<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-04-21
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书信息</title>
    <style>
        #container{
            width: 450px;
            border: 1px solid;
            padding: 20px;
            margin: 180px auto;
        }

        #title{
            font-size: 16px;
            font-weight: bold;
            color: #3399ff;
        }

        #content{
            font-size: 12px;
            text-align: left;
        }
    </style>
</head>
<body>
<jsp:useBean id="book" class="jspSamples.unit5.javaBeanSamples.Book"></jsp:useBean> 
<jsp:useBean id="encoding" class="jspSamples.unit5.javaBeanSamples.CharactorEncoding"></jsp:useBean>
<jsp:setProperty name="book" property="*"></jsp:setProperty>
<div id="container">
    <div id="title">
        <%="<h3>书名: </h3>" + encoding.toString(book.getTitle())%>
    </div>
    <hr>
    <div id="content">
        <%="<h3>介绍: </h3>" + encoding.toString(book.getContent())%>
    </div>
</div>
</body>
</html>
