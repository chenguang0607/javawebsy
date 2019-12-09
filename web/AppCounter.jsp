<%--
  Created by IntelliJ IDEA.
  User: chenguang
  Date: 19.12.5
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
测试计数器页面
<%
    if(application.getAttribute("counter") == null)
    {
        application.setAttribute("counter", "1");
    }
    else
    {
        String strnum = null;
        strnum = application.getAttribute("counter").toString();
        int icount = 0;
        icount = Integer.valueOf(strnum).intValue();
        icount++;
        application.setAttribute("counter", Integer.toString(icount));
    }
%>
您是第<%=application.getAttribute("counter") %>位访问者！
</body>
</html>
