package Com_it;
//导包 ①HttpServlet ②HttpServletRequest ③HttpServletResponse ④IOException
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
<<<<<<< HEAD
import javax.swing.text.html.HTML;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    public RegisterServlet(){
        super();
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        //设置字符与获取表单中的信息
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("userName");
        String userPwd = request.getParameter("userPwd");
        String userEmail = request.getParameter("userEmail");
        String userSex = request.getParameter("userSex");
        String userEducation = request.getParameter("userEducation");
        //实例化输出对象并将表单中的信息输出
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Servlet</TITLE></HEAD>");
        out.println("<BODY><br/>");
        out.println(userName);
        out.println(userPwd);
        out.println(userEmail);
        out.println(userSex);
        out.println(userEducation);
        out.println("</BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
=======
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter(); //实例化输出对象
        out.println("My First Servlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

>>>>>>> origin/master
    }
}
