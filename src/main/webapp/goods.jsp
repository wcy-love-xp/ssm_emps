<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 。荏苒  。
  Date: 2020/5/19
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <th>商品名</th>
            <th>价格</th>
            <th>生产日期</th>
        </tr>
        <c:forEach items="${list}" var="row">
            <tr>
                <td>${row.goodsName}</td>
                <td>${row.goodsPrice}</td>
                <td>${row.goodsTime}</td>
                <td><a href="./del?gid=${row.gid}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
