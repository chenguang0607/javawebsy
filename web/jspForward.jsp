<%--
  Created by IntelliJ IDEA.
  User: chenguang
  Date: 19.12.5
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    double i = Math.random();
    if (i > 0.5) {
%>
<jsp:forward page="forward1.jsp" />
<%
} else {
%>
<jsp:forward page="forward2.jsp" />
<%
    }
%>
</body>
</html>
