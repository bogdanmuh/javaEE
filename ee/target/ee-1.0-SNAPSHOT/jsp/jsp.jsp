
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%@include file="myJsp.jsp"%>
    <!-- на jsp страницах существуют зарезервированные названия определенных объектов  -->
    <%=request.getMethod()%>
    <%=session.getAttribute("")%>

    <jsp:forward page="myJsp.jsp"/>
</html>
