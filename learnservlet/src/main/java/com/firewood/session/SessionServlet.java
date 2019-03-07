package com.firewood.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html><head><title>세션</title></head><body>");
        HttpSession httpSession = req.getSession();
        printWriter.println("sessionId::" + httpSession.getId() + "<br/>");
        printWriter.println("session created::" + httpSession.getCreationTime() + "<br/>");
        printWriter.println("session lastAccessTime" + httpSession.getLastAccessedTime() + "<br/>");
        printWriter.println("</body></html>");
    }
}
