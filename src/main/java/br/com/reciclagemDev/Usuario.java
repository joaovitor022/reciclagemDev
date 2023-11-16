package br.com.reciclagemDev;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Usuario {
    private String nome;
    private String sobreNome;
    private String cpf;
    private String email;
    private String senha;
    private String endereco;

    private Database database = new Database();

    public String getNome(String actEmail, String actSenha) {
        database.connect();
        String query = "SELECT NOME FROM USUARIO WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
        String nome = null;
        try {
            ResultSet resultSet = database.executeQuery(query);
            if (resultSet.next()) {
                nome = resultSet.getString("NOME");
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            database.disconnect();
        }
        return nome;
    }

    public void setNome(String nome, String actEmail, String actSenha) {
        database.connect();
        String query = "UPDATE USUARIO SET NOME = '" + nome + "' WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public String getSobreNome(String actEmail, String actSenha) {
        database.connect();
        String query = "SELECT SOBRENOME FROM USUARIO WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
        String sobreNome = null;
        try {
            ResultSet resultSet = database.executeQuery(query);
            if (resultSet.next()) {
                sobreNome = resultSet.getString("SOBRENOME");
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            database.disconnect();
        }
        return sobreNome;
    }

    public void setSobreNome(String sobreNome, String actEmail, String actSenha) {
        database.connect();
        String query = "UPDATE USUARIO SET SOBRENOME = '" + sobreNome + "' WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

       public String getCPF(String actEmail, String actSenha) {
        database.connect();
        String query = "SELECT CPF FROM USUARIO WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
        String cpf = null;
        try {
            ResultSet resultSet = database.executeQuery(query);
            if (resultSet.next()) {
                cpf = resultSet.getString("CPF");
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            database.disconnect();
        }
        return cpf;
    }

    public void setCPF(String cpf, String actEmail, String actSenha) {
        database.connect();
        String query = "UPDATE USUARIO SET CPF = '" + cpf + "' WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public String getEmail(String actEmail, String actSenha) {
        database.connect();
        String query = "SELECT EMAIL FROM USUARIO WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
        String email = null;
        try {
            ResultSet resultSet = database.executeQuery(query);
            if (resultSet.next()) {
                email = resultSet.getString("EMAIL");
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            database.disconnect();
        }
        return email;
    }

    public void setEmail(String email, String actEmail, String actSenha) {
        database.connect();
        String query = "UPDATE USUARIO SET EMAIL = '" + email + "' WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public String getSenha(String actEmail, String actSenha) {
        database.connect();
        String query = "SELECT SENHA FROM USUARIO WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
        String senha = null;
        try {
            ResultSet resultSet = database.executeQuery(query);
            if (resultSet.next()) {
                senha = resultSet.getString("SENHA");
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            database.disconnect();
        }
        return senha;
    }

    public void setSenha(String senha, String actEmail, String actSenha) {
        database.connect();
        String query = "UPDATE USUARIO SET SENHA = '" + senha + "' WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public String getEndereco(String actEmail, String actSenha) {
        database.connect();
        String query = "SELECT ENDERECO FROM USUARIO WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
        String endereco = null;
        try {
            ResultSet resultSet = database.executeQuery(query);
            if (resultSet.next()) {
                endereco = resultSet.getString("ENDERECO");
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            database.disconnect();
        }
        return endereco;
    }

    public void setEndereco(String endereco, String actEmail, String actSenha) {
        database.connect();
        String query = "UPDATE USUARIO SET ENDERECO = '" + endereco + "' WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
        database.executeUpdate(query);
        database.disconnect();
    }
}
