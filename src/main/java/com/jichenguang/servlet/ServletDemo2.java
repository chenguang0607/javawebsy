package com.jichenguang.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletDemo2",urlPatterns = "/ServletDemo2")
public class ServletDemo2 extends HttpServlet {
    @Override
    public void init() throws ServletException{
        //给次数设置一个初始值0
        int count = 0;
        //将0存入到ServletContext中
        getServletContext().setAttribute("count", count);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //将原来的次数取出来
        int count = (Integer) getServletContext().getAttribute("count");
        count += 1;
        //存入到ServletContext中
        getServletContext().setAttribute("count",count);
        //向页面输出欢迎光临!
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<h1>欢迎光临本网站！这是您第"+ count+"次访问</h1>");
    }
}
