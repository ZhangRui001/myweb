package com;


import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/listUser.do")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String strid=req.getParameter("sno").trim();
        int sno=Integer.parseInt(strid);
        String sql=" select * from teacher where sno > ? ";
        List<User> list=MyDbUtil.executeQuery(User.class,sql,sno);
        req.setAttribute("sno",list);
        req.getRequestDispatcher("listUser.jsp").forward(req,resp);

    }
}
