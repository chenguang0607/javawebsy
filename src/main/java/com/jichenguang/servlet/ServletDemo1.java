package com.jichenguang.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletDemo1",urlPatterns = "/ServletDemo1")
public class ServletDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print("post提交方式<br>");
        for( int i =1;i <= 9;i++){
            for(int j = 1; j <= i;j++){
                response.getWriter().print(j+"*"+i+"*"+"=" + j * i +" ");
            }
            response.getWriter().print("<br/>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print("get提交方式<br>");
        for( int i =1;i <= 9;i++){
            for(int j = 1; j <= i;j++){
                response.getWriter().print(j+"*"+i+"*"+"=" + j * i +" ");
            }
            response.getWriter().print("<br/>");
        }
    }
}
