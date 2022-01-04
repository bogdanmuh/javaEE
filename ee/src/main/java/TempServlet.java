import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
        Cookie[] cookies = req.getCookies();
        for(Cookie cookie:cookies){
            System.out.println(cookie.getName());
            System.out.println(cookie.getValue());
        }
        Cookie cookie= new Cookie("testCookei","abc");

        cookie.setMaxAge(5);// в течение 5 секунд браузер удалит куки
        cookie.setPath("/temp.html");// только для этого пути будет доступны куки
        //cookie.setDomain();
        cookie.setSecure(true);// куки будут видны если будет только https соединение
        resp.addCookie(cookie);



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
