package br.com.reciclagemDev.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.reciclagemDev.Database;

@WebServlet("/Usuario")
public class CreateUsuarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Database database = new Database();

        String nome = req.getParameter("nome");
        String sobreNome = req.getParameter("sobrenome");
        String cpf = req.getParameter("cpf");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        String endereco = req.getParameter("endereco");

        database.connect();
        database.insertIntoUsuario(nome, sobreNome, cpf, email, senha, endereco);
        database.disconnect();

        req.getRequestDispatcher("pages/Usuario.html").forward(req, resp);

    }

}