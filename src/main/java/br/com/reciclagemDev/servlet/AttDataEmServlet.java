package br.com.reciclagemDev.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.reciclagemDev.Database;
import br.com.reciclagemDev.Empresa;


@WebServlet("/Att-Empresa")
public class AttDataEmServlet extends HttpServlet {

    Empresa empresa = new Empresa();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Database database = new Database();

        String nomeEmpresa = req.getParameter("nomeEmpresa");
        String cnpj = req.getParameter("cnpj");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        String endereco = req.getParameter("endereco");

        String userEmail = (String) req.getSession().getAttribute("loggedUser");
        String userSenha = (String) req.getSession().getAttribute("loggedUserPass");

        if (nomeEmpresa != null && !nomeEmpresa.isEmpty()) {
            empresa.setNomeEmpresa(nomeEmpresa, userEmail, userSenha);
        }
        
        if (cnpj != null && !cnpj.isEmpty()) {
            empresa.setCNPJ(cnpj, userEmail, userSenha);
        }

        if (email != null && !email.isEmpty()) {
            empresa.setEmail(email, userEmail, userSenha);
            req.getSession().setAttribute("loggedUser", email);
        }

        if (senha != null && !senha.isEmpty()) {
            empresa.setSenha(senha, userEmail, userSenha);
            req.getSession().setAttribute("loggedUserPass", senha);
        }

        if (endereco != null && !endereco.isEmpty()) {
            empresa.setEndereco(endereco, userEmail, userSenha);
        }

        req.getRequestDispatcher("pages/Login.jsp").forward(req, resp);

    }

}