package br.com.reciclagemDev.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.reciclagemDev.Database;
import br.com.reciclagemDev.Usuario;

@WebServlet("/post")
public class CreatePostServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Database database = new Database();
        Usuario usuario = new Usuario();

        String userEmail = (String) req.getSession().getAttribute("loggedUser");
        String userSenha = (String) req.getSession().getAttribute("loggedUserPass");

        String material = req.getParameter("material");
        String peso = req.getParameter("peso");
        String descricao = req.getParameter("descricao");
        String nome = usuario.getNome(userEmail, userSenha);
        String sobrenome = usuario.getSobreNome(userEmail, userSenha);
        String endereco = usuario.getEndereco(userEmail, userSenha);
        
        database.connect();
        database.insertIntoPost(material, peso, descricao, nome, sobrenome, endereco);
        database.disconnect();

        req.getRequestDispatcher("pages/Usuario.jsp").forward(req, resp);

    }
    
}
