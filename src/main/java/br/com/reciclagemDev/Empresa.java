package br.com.reciclagemDev;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empresa {
    private String nomeEmpresa;
    private String cnpj;
    private String email;
    private String senha;
    private String endereco;

    private Database database = new Database();

    public String getNomeEmpresa() {
        database.connect();
        String query = "SELECT NOME FROM USUARIO";
        String nomeEmpresa = null;
        try {
            ResultSet resultSet = database.executeQuery(query);
            if (resultSet.next()) {
                nomeEmpresa = resultSet.getString("NOMEEMPRESA");
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            database.disconnect();
        }
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        database.connect();
        String query = "UPDATE USUARIO SET NOME = '" + nomeEmpresa + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

       public String getCNPJ() {
        database.connect();
        String query = "SELECT CNPJ FROM USUARIO";
        String cnpj = null;
        try {
            ResultSet resultSet = database.executeQuery(query);
            if (resultSet.next()) {
                cnpj = resultSet.getString("CNPJ");
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            database.disconnect();
        }
        return cnpj;
    }

    public void setCNPJ(String cnpj) {
        database.connect();
        String query = "UPDATE USUARIO SET CNPJ = '" + cnpj + "'";
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
