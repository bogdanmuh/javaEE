package Controller;

import MyModel.MyModel;
import jsp.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/MyController")
public class MyController extends HttpServlet {
    MyModel myModel = new MyModel();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = myModel.getStudent();
        req.setAttribute("Student",student);   // при компиляции jsp переходит в servlet и три это варианты объясняю как зависит будущий созданный Servlet от scope
        req.getSession().setAttribute("Student",student);
        req.getServletContext().setAttribute("Student",student);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/Myview.jsp");
        requestDispatcher.forward(req,resp);
    }
}
