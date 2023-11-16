package br.com.reciclagemDev.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.reciclagemDev.Database;
import br.com.reciclagemDev.Usuario;


@WebServlet("/Att-Usuario")
public class AttDataUsServlet extends HttpServlet {

    Usuario usuario = new Usuario();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Database database = new Database();

        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        String cpf = req.getParameter("cpf");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        String endereco = req.getParameter("endereco");

        String userEmail = (String) req.getSession().getAttribute("loggedUser");
        String userSenha = (String) req.getSession().getAttribute("loggedUserPass");

        if (nome != null && !nome.isEmpty()) {
            usuario.setNome(nome, userEmail, userSenha);
        }

        if (sobrenome != null && !sobrenome.isEmpty()) {
            usuario.setSobreNome(sobrenome, userEmail, userSenha);
        }
        
        if (cpf != null && !cpf.isEmpty()) {
            usuario.setCPF(cpf, userEmail, userSenha);
        }

        if (email != null && !email.isEmpty()) {
            usuario.setEmail(email, userEmail, userSenha);
            req.getSession().setAttribute("loggedUser", email);
        }

        if (senha != null && !senha.isEmpty()) {
            usuario.setSenha(senha, userEmail, userSenha);
            req.getSession().setAttribute("loggedUserPass", senha);
        }

        if (endereco != null && !endereco.isEmpty()) {
            usuario.setEndereco(endereco, userEmail, userSenha);
        }

        req.getRequestDispatcher("pages/Login.jsp").forward(req, resp);

    }

}