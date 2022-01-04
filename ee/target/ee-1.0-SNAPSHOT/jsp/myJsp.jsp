<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <!-- Объявление методов или переменных-->
    <%! int i = 5 ;  %>
    <%! private void doJob(){
        System.out.println("Hello");
    }%>
    <!-- должно возращать String-->
    <%="hello world "  + (i+1)  %>
    <%= new Date()  %>
    <!-- jsp существует для упрощение работы со Html Страницами . в конечном этого это страница превращается в сервлет -->
<%--132rf--%>
    <% class  Student {
        String name ;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }%>
    <%=new Student()%>
    <% if(Math.random()>5) { %>
        1234
    <% }%>
    }
</body>
</html>
