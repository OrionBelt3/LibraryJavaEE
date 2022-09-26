package com.example.libraryjavaee.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetStartPageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String startPage = "/WEB-INF/views/startPage.jsp";
        req.getRequestDispatcher(startPage).forward(req, resp);
    }
}
