<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kun
  Date: 2016/5/5
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>资源下载</title>
</head>
<body>
    <c:if test="${!empty errorMsg}">
        <h3>${errorMsg}</h3>
    </c:if>
    <form action="login" method="post">
        <h2>资源下载</h2>
        <p>
            <label for="isbnNumber">请输入ISBN号</label>
            <input type="text" id="isbnNumber" name="isbnNumber">
        </p>
<%--
<p>
    <label for="password">密码</label>
    <input type="password" id="password" name="password">
</p>
--%>
<p>
    <input type="submit" value="提交">
</p>
</form>
</body>
</html>
