package br.com.danieleleaoe.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/primeiroServlet")
public class MeuPrimeiroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Meu primeiro Servlet funcionou!</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // name
        // email 

        String name = req.getParameter("name");
        String email = req.getParameter("email");

        resp.setContentType("text/html");
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("Dados recebidos");
        resp.getWriter().println("Nome: " + name);
        resp.getWriter().println("Email: " + email);

        resp.getWriter().println("</body></html>");

    }

}
