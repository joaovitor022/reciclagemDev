package br.com.reciclagemDev.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/post")
public class CreatePostServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String material = req.getParameter("material");
        Double peso = req.getParameter("peso");
        String descricao = req.getParameter("descricao");

        System.out.println(material);
        System.out.println(peso);
        System.out.println(descricao);

        req.getRequestDispatcher("../pages/Usuario.html").forward(req, resp);
    }
}