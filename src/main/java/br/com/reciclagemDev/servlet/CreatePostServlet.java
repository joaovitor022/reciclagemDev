package br.com.reciclagemDev.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.reciclagemDev.Database;

@WebServlet("/post")
public class CreatePostServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Database database = new Database();

        String material = req.getParameter("material");
        String peso = req.getParameter("peso");
        /*try {
            double numero = Double.parseDouble(peso);
        } catch (NumberFormatException e) {
            System.out.println("A string não é um número válido.");
        }*/
        String descricao = req.getParameter("descricao");
        
        database.connect();
        database.insertIntoPost(material, peso, descricao);
        database.disconnect();

        req.getRequestDispatcher("../pages/Usuario.html").forward(req, resp);
    }
}