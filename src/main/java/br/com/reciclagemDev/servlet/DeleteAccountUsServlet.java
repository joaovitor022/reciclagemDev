package br.com.reciclagemDev.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.reciclagemDev.Database;
import br.com.reciclagemDev.Usuario;

@WebServlet("/delete-account-us")
public class DeleteAccountUsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Database database = new Database();
        Usuario usuario = new Usuario();
        
        String SQL = "DELETE FROM USUARIO WHERE EMAIL = '" + usuario.getEmail() + "' AND SENHA = '" + usuario.getSenha() + "'";

        database.connect();
        database.executeDelete(SQL);
        database.disconnect();

        req.getRequestDispatcher("pages/Login.jsp").forward(req, resp);

    }
    
}
