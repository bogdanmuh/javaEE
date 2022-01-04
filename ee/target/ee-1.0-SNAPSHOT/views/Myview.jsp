<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 04.01.2022
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="Person" class = "jsp.Person" scope="request"/>
    <%-- <jsp:useBean id="person" class = "jsp.Person" scope="session"/>
    <jsp:useBean id="person" class = "jsp.Person" scope="application"/>--%>
    <jsp:getProperty name="Person" property="name"/>
</body>
</html>
