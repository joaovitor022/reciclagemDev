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

    public String getNomeEmpresa(String actEmail, String actSenha) {
        database.connect();
        String query = "SELECT NOMEEMPRESA FROM EMPRESA WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
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

    public void setNomeEmpresa(String nomeEmpresa, String actEmail, String actSenha) {
        database.connect();
        String query = "UPDATE EMPRESA SET NOMEEMPRESA = '" + nomeEmpresa + "' WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

       public String getCNPJ(String actEmail, String actSenha) {
        database.connect();
        String query = "SELECT CNPJ FROM EMPRESA WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
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

    public void setCNPJ(String cnpj, String actEmail, String actSenha) {
        database.connect();
        String query = "UPDATE EMPRESA SET CNPJ = '" + cnpj + "' WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public String getEmail(String actEmail, String actSenha) {
        database.connect();
        String query = "SELECT EMAIL FROM EMPRESA WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
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
        String query = "UPDATE EMPRESA SET EMAIL = '" + email + "' WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public String getSenha(String actEmail, String actSenha) {
        database.connect();
        String query = "SELECT SENHA FROM EMPRESA WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
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
        String query = "UPDATE EMPRESA SET SENHA = '" + senha + "' WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public String getEndereco(String actEmail, String actSenha) {
        database.connect();
        String query = "SELECT ENDERECO FROM EMPRESA WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
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
        String query = "UPDATE EMPRESA SET ENDERECO = '" + endereco + "' WHERE EMAIL = '" + actEmail + "' AND SENHA = '" + actSenha + "'";
        database.executeUpdate(query);
        database.disconnect();
    }
}
