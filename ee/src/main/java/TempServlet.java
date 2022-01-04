import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

//ctrl+alt+v горячие клавиша для объявления переменной возвращаемого методом
//ctrl+w выделить строку
//ctrl+shift+/ закомментировать выделенное
@WebServlet("/temp")
public class TempServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // на сервере есть сессии, а на клиенте есть куки

        HttpSession session = req.getSession();
        Enumeration<String> attributeNames = session.getAttributeNames();
        while(attributeNames.hasMoreElements()){
            String attributeName = attributeNames.nextElement();
            System.out.println(attributeName+"="+session.getAttribute(attributeName));
        }
        session.setAttribute("one","two");
        System.out.println(session.getMaxInactiveInterval());//сессия существует ограниченное время
        


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
