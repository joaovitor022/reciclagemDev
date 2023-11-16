package br.com.reciclagemDev.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.reciclagemDev.Database;

@WebServlet("/delete-account-em")
public class DeleteAccountEmServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Database database = new Database();

        String userEmail = (String) req.getSession().getAttribute("loggedUser");
        String userSenha = (String) req.getSession().getAttribute("loggedUserPass");

        if (userEmail != null && userSenha != null) {
            String SQL = "DELETE FROM EMPRESA WHERE EMAIL = '" + userEmail + "' AND SENHA = '" + userSenha + "'";

            database.connect();
            database.executeDelete(SQL);
            database.disconnect();
            System.out.println("Empresa deletada\nEmail: " + userEmail + "\nSenha: " + userSenha);
        }

        req.getRequestDispatcher("pages/Login.jsp").forward(req, resp);

    }
    
}
