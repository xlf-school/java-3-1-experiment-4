<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.io.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>页面访问计数器</title>
</head>
<body>

<%
    String counterKey = "pageVisitCounter";

    // 检查 application 对象中是否已有计数器值
    Integer counter = (Integer) application.getAttribute(counterKey);
    if (counter == null) {
        counter = 0;
    }

    counter++;

    application.setAttribute(counterKey, counter);
%>

<h1>欢迎访问该页面！</h1>
<p>该页面已被访问次数：<%= counter %>
</p>

</body>
</html>
