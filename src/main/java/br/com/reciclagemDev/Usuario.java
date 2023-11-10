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

    public String getNome() {
        database.connect();
        String query = "SELECT NOME FROM USUARIO";
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

    public void setNome(String nome) {
        database.connect();
        String query = "UPDATE USUARIO SET NOME = '" + nome + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public String getSobreNome() {
        database.connect();
        String query = "SELECT SOBRENOME FROM USUARIO";
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

    public void setSobreNome(String sobreNome) {
        database.connect();
        String query = "UPDATE USUARIO SET SOBRENOME = '" + sobreNome + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

       public String getCPF() {
        database.connect();
        String query = "SELECT CPF FROM USUARIO";
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

    public void setCPF(String cpf) {
        database.connect();
        String query = "UPDATE USUARIO SET CPF = '" + cpf + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public String getEmail() {
        database.connect();
        String query = "SELECT EMAIL FROM USUARIO";
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

    public void setEmail(String email) {
        database.connect();
        String query = "UPDATE USUARIO SET EMAIL = '" + email + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public String getSenha() {
        database.connect();
        String query = "SELECT SENHA FROM USUARIO";
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

    public void setSenha(String senha) {
        database.connect();
        String query = "UPDATE USUARIO SET SENHA = '" + senha + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public String getEndereco() {
        database.connect();
        String query = "SELECT ENDERECO FROM USUARIO";
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

    public void setEndereco(String endereco) {
        database.connect();
        String query = "UPDATE USUARIO SET ENDERECO = '" + endereco + "'";
        database.executeUpdate(query);
        database.disconnect();
    }
}
