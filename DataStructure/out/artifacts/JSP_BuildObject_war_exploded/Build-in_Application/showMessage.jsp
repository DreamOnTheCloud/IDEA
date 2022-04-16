<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-03-29
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.sun.org.apache.xml.internal.serializer.utils.StringToIntTable" %>
<html>
<head>
    <title>Application内置对象</title>
    <style>
        body{
            background: RGBA(38,38,38,1);
        }
        div{
            width: 800px;
            border: 1px solid RGBA(100,90,87,1);
            color: white;
        }
        span{
            font-size: 20px;
            font-weight: bold;
        }
        .span0{
            color: red;
            font-size: 25px;
        }
        .span1{
            color: green;
        }
        .span2{
            color: orange;
        }
        .span3{
            color: green;
        }
        .span4{
            color: red;
        }
    </style>
</head>
<body>
<%@page import="java.util.*"%>
<div>
    <%
        Object o = application.getAttribute("message");
        if (o == null){
            out.print("暂时还没有留言呢");
        }else {
            Vector<String> v = (Vector<String>)o;
            for (int i = v.size() - 1; i >= 0; i--){
//                String[] st1 = v.get(i).split("/.");
//                for (int j = 0; j < st1.length; j++){
//                    out.print(st1[j] + "<br>");
//                }
//                out.print("<br>");
                StringTokenizer st = new StringTokenizer(v.get(i),".");
                while (st.hasMoreElements()){
                    out.print(st.nextToken() + "<br>");
                }
            }
        }
    %>
</div>
</body>
</html>
