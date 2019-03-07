package com.firewood.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("*.jsp")
public class ServletFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("최초 요청");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.setContentType("text/html");
        servletResponse.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.println("필터 동작 전");
        filterChain.doFilter(servletRequest, servletResponse);
        printWriter.println("필터 동작 후");
    }

    @Override
    public void destroy() {

    }
}
