package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/task1")
public class Task1Servlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        for (int i = 0; i < 10; i++) {
            writer.print("<h1>" + "HELLO WORLD!" + "</h1>");
        }
    }
}
