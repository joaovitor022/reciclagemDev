package br.com.reciclagemDev.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.reciclagemDev.Database;

@WebServlet("/Empresa")
public class CreateEmpresaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Database database = new Database();

        String cnpj = req.getParameter("cnpj");
        String nomeEmpresa = req.getParameter("nome_da_empresa");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        String endereco = req.getParameter("endereco");

        database.connect();
        database.insertIntoEmpresa(cnpj, nomeEmpresa, email, senha, endereco);
        database.disconnect();

        req.getRequestDispatcher("pages/Empresa.jsp").forward(req, resp);

    }

}