package com.example.libraryjavaee.servlets;

import com.example.libraryjavaee.models.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

;

public class GetStartPageServlet extends HttpServlet {
    private static long COUNT;
    List<User> users;
    @Override
    public void init() throws ServletException {
        COUNT = 0;
        users = new CopyOnWriteArrayList<>();
        users.add(new User(COUNT++, "First", "First", 21));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String startPage = "/WEB-INF/views/startPage.jsp";
        req.setAttribute("users", users);
        req.getRequestDispatcher(startPage).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        if (!requestIsValid(req)) {
            doGet(req, resp);
        }

        final String name = req.getParameter("name");
        final String surname = req.getParameter("surname");
        final String age = req.getParameter("age");

        final User user = new User(COUNT++, name, surname, Integer.parseInt(age));
        users.add(user);

        doGet(req, resp);
    }

    private boolean requestIsValid(HttpServletRequest req) {
        final String name = req.getParameter("name");
        final String surname = req.getParameter("surname");
        final String age = req.getParameter("age");

        return name != null && name.length()>0 &&
                surname != null && surname.length()>0 &&
                age.matches("[+]?\\d+") && Integer.parseInt(age) > 0;
    }
}
