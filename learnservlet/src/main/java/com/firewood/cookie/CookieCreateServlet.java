package com.firewood.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/createcookie")
public class CookieCreateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        Cookie jcookie = new Cookie("nickname", "firewood");
        jcookie.setMaxAge(3600);
        resp.addCookie(jcookie);

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html><head><title> 쿠키 예제</title></head></body>");
        printWriter.println("<br/>");
        printWriter.println("<a href='/readcookie'>readcookie</a></body></html>");
    }
}
