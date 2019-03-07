package com.firewood.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/readse")
public class ReadSessionValueServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        out.println("<html><head><title>세션</title></head><body>");

        HttpSession session = req.getSession();
        String sessionValue = (String) session.getAttribute("jpub");
        out.println("Session value : " + sessionValue);
        out.println("</body></html>");
    }
}
