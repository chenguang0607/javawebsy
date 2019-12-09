<%--
  Created by IntelliJ IDEA.
  User: chenguang
  Date: 19.12.5
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" errorPage="error.jsp" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%
    int[] array = {3,21};
%>
数组指定元素为：<%=(array[99]) %><!--此处会产生异常 -->
</body>
</html>
