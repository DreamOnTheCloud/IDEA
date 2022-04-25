<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022-04-17
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        /* 初始化设置 -----------------------------------------------------------------------------------------------------*/

        html {
            background-color: rgb(61, 54, 54);
        }

        * {
            margin: 0;
            padding: 0;
        }

        a {
            text-decoration: none;
        }

        input,
        button {
            background: transparent;
            outline: none;
            border: none;
        }

        .loginBox {
            width: 400px;
            height: 364px;
            background: rgba(0, 0, 0, 0.5);
            box-shadow: 0 15px 25px 0 rgb(0, 0, 0, .6);
            padding: 40px;
            box-sizing: border-box;
            margin: 150px auto;
        }

        h2 {
            color: #fff;
            text-align: center;
            margin-bottom: 30px;
        }
        /* 输入框设置 -------------------------------------------------------------------------------------------------*/

        .item {
            height: 45px;
            border-bottom: 1px solid #fff;
            margin-bottom: 40px;
            position: relative;
        }

        .item input {
            height: 100%;
            width: 100%;
            color: #fff;
            padding-top: 20px;
            box-sizing: border-box;
        }

        .item input:focus+label,
        .item input:valid+label {
            /* transition改变时延迟的秒数 */
            top: 0px;
            font-size: 14px;
            transition: all 0.5s linear;
        }

        .item label {
            position: absolute;
            left: 0;
            top: 12px;
            color: #03e9f4;
        }
        /* 按钮设置 --------------------------------------------------------------------------------------------------*/

        .btn {
            padding: 10px 20px;
            /* 超出隐藏 */
            overflow: hidden;
            color: #03e9f4;
            position: relative;
        }

        .btn:hover {
            border-radius: 5px;
            color: #fff;
            box-shadow: 0 0 5px 0 #03e9f4, 0 0 25px 0 #03e9f4, 0 0 50px 0 #03e9f4, 0 0 100px 0 #03e9f4;
            background: #03e9f4;
            /* 文字全部大写 */
            text-transform: uppercase;
            letter-spacing: 1px;
        }

        .btn>span {
            position: absolute;
        }

        .btn>span:nth-child(1) {
            width: 100%;
            height: 2px;
            background: -webkit-linear-gradient(left, transparent, #03e9f4);
            left: -100%;
            top: 0px;
            animation: line1 1s linear infinite;
        }

        @keyframes line1 {
            50%,
            100% {
                left: 100%;
            }
        }

        .btn>span:nth-child(2) {
            width: 2px;
            height: 100px;
            background: -webkit-linear-gradient(top, transparent, #03e9f4);
            right: 0;
            top: -100%;
            animation: line2 1s 0.25s linear infinite;
        }

        @keyframes line2 {
            50%,
            100% {
                top: 100%;
            }
        }

        .btn>span:nth-child(3) {
            width: 100%;
            height: 2px;
            background: -webkit-linear-gradient(left, #03e9f4, transparent);
            left: 100%;
            bottom: 0;
            animation: line3 1s 0.5s linear infinite;
        }

        @keyframes line3 {
            50%,
            100% {
                left: -100%;
            }
        }

        .btn>span:nth-child(4) {
            width: 2px;
            height: 100%;
            background: -webkit-linear-gradient(top, #03e9f4, transparent);
            left: 0;
            top: 100%;
            animation: line4 1s 0.75s linear infinite;
        }

        @keyframes line4 {
            50%,
            100% {
                top: -100%;
            }
        }
    </style>
</head>
<body>
<form action="Show.jsp" method="post">
    <div class="loginBox">
        <h2>Book Registration</h2>
        <div class="item">
            <input type="text" required name="title"></input>
            <label for="">BookName</label>
        </div>
        <div class="item">
            <input type="text" required name="content"></input>
            <label for="">Introduction</label>
        </div>

        <button class="btn">提交
            <!-- 按钮流光思路 -->
            <span></span>
            <span></span>
            <span></span>
            <span></span>
        </button>
    </div>
</form>
</body>
</html>
