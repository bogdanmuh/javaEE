
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="student" class="jsp.Student" type=""/><!--Создаем объект класса-->
    <jsp:setProperty name="student" property="name" value = "Max"/><!--устанавливаем значение для поля класса-->
    <jsp:getProperty name="student" property="name"/><!--Бурем значение их поля -->
</body>
</html>
