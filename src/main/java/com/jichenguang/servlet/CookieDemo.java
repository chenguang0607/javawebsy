package com.jichenguang.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "CookieDemo",urlPatterns = "/CookieDemo")
public class CookieDemo  extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
//首次遍历用户登陆信息，查看是否存储有自动登陆相关信息
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("username")){
                cookie.setMaxAge(5);
                resp.addCookie(cookie);
                out.print("您已登录，欢迎你！");
                out.print("<a href='/Login.jsp'>退出</a>");
                return;
            }
        }
//用户收集用户登陆信息
        String username = req.getParameter("username");
        String autoLogin = req.getParameter("autoLogin");
        if(username.trim().equals("") || username==null){
            out.print("请输入用户名登陆");
            resp.setHeader("Refresh",
                    "2;URL=http://localhost:8080/Login.jsp");
            return;
        }
//表示用户使用自动登陆功能
        if(autoLogin!=null && autoLogin.equals("autoLogin")){
            Cookie cookie=new Cookie("username", username);
            cookie.setMaxAge(5);
            cookie.setPath("/");
            resp.addCookie(cookie);
        }
        out.print("您已登录，欢迎你！");
        out.print("<a href='/Login.jsp'>退出</a>");
        return;
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doGet(req, resp);
    }

}
