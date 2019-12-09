<%--
  Created by IntelliJ IDEA.
  User: chenguang
  Date: 19.12.5
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
测试计数器的页面
<%
    if(session.getAttribute("counter") == null)
    {
        session.setAttribute("counter", "1");
    }
    else
    {
        String strnum = null;
        strnum = session.getAttribute("counter").toString();
        int icount = 0;
        icount = Integer.valueOf(strnum).intValue();
        icount++;
        session.setAttribute("counter", Integer.toString(icount));
    }
%>
您是第<%=session.getAttribute("counter") %>位访问者！
</body>
</html>
