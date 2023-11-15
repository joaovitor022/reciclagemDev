package br.com.reciclagemDev;

import br.com.reciclagemDev.User;
import br.com.reciclagemDev.Database;

import java.sql.*;

public class EmpresaDAO {

    public boolean verifyCredentials(User user) {

        Database database = new Database();

        String SQL = "SELECT EMAIL, SENHA FROM EMPRESA WHERE EMAIL = '" + user.getEmail() + "'";

        try {

            database.connect();

            ResultSet resultSet = database.executeQuery(SQL);

            System.out.println("Email encontrado");

            while (resultSet.next()) {

                String senha = resultSet.getString("SENHA");

                if (senha.equals(user.getSenha())) {

                    return true;

                }

            }

            database.disconnect();

            return false;

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

            return false;

        }

    }

}