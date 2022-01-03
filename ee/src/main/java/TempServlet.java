import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

//ctrl+alt+v горячие клавиша для объявления переменной возвращаемого методом
//ctrl+w выделить строку
//ctrl+shift+/ закомментировать выделенное
@WebServlet("/temp")
public class TempServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   /*     String one = req.getParameter("one");
        String two = req.getParameter("two");
        //url параметры
        //Для нескольких одиннаковых параметров
        String[] ones = req.getParameterValues("one");
        for (String s : ones){
            System.out.println(s);
        }
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String elementName = parameterNames.nextElement();
            System.out.println(elementName+"="+req.getParameter(parameterNames.nextElement()));
        }//параметры  и значения
        Map<String, String[]> parameterMap = req.getParameterMap();
        System.out.println(req.getRequestURL());
        System.out.println(req.getRequestURI());
        System.out.println(req.getServletPath());
        System.out.println(req.getRemoteHost());

        System.out.println(req.getLocalPort());
        System.out.println(req.getRequestURI());
        System.out.println(req.getQueryString());// url запрос подходит для того чтобы распарсить
       */ // это для get запросов
        String one = req.getParameter("one");
        String two = req.getParameter("two");
        resp.getWriter().write("<html>"+
                "<head></head>"+
                "<body>"+
                "one="+one+
                "two="+two+

                "<form action = 'temp' method ='post'>"+
                "<input type = 'text' name='one'/>"+
                "<input type = 'text' name='two'/>"+
                "<input type = 'submit' name='submit'/>"+
                "</form>"+
                "</body>"+
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
