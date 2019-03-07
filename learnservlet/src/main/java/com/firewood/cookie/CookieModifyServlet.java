package com.firewood.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/modifycookie")
public class CookieModifyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html><head><title> cookie 수정  </title></head>");
        printWriter.println("<body>");
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("nickname")) {
                    Cookie modifiedCookie = new Cookie("nickname", "read");
                    resp.addCookie(modifiedCookie);
                }
            }
        }
        printWriter.println("<a href='/readcookie'>readcookie</a></body></html>");
    }
}
