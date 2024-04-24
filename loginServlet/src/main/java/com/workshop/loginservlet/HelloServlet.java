package com.workshop.loginservlet;

import java.io.*;
import java.util.Objects;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "login", value = "/login")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hi, you can check your credentials here";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (Objects.equals(username, "alina") && Objects.equals(password, "corinna")) {

            // Hello
            out.println("<html><body>");
            out.println("<h1>" + "Success" + "</h1>");
            out.println("<p> Credentials are correct");
            out.println("</body></html>");
        } else {
            // Hello
            out.println("<html><body>");
            out.println("<h1>" + "Failure" + "</h1>");
            out.println("<p> Credentials are wrong");
            out.println("</body></html>");
        }

    }

    public void destroy() {
    }
}