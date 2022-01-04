
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="person" class="jsp.Person" type=""/><!--Создаем объект класса-->
    <jsp:setProperty name="person" property="name" value = "Max"/><!--устанавливаем значение для поля класса-->
    <jsp:getProperty name="person" property="name"/><!--Бурем значение их поля -->
</body>
</html>
