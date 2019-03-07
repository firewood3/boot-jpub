package com.firewood.basic;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "HelloServlet",
        urlPatterns = {"/hello"},
        initParams = { @WebInitParam(name = "initValue", value = "firewood")}
)
public class HelloServlet extends HttpServlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init hello");
        System.out.println("초기화 시 설정 값은 " + servletConfig.getInitParameter("initValue") + "입니다.");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet 메소드 호출");

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<html>");
        printWriter.println("<head><title>get hello</title></head>");
        printWriter.println("<body> get 요청 입니다. </body>");
        printWriter.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost 호출");

        req.setCharacterEncoding("UTF-8");
        String message = req.getParameter("message");

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head><title>Login Servlet</title></head>");
        printWriter.println("<body>");
        printWriter.println("전달 받은 메시지는 " + message + "입니다.");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
