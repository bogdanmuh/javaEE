import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
// горячая клавиша для выбра метода для переопредления ctr+o
@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("initilalization");
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("do get method");
        PrintWriter printWriter = response.getWriter();
        printWriter.write("hello world");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service method");
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
        super.destroy();
    }
}