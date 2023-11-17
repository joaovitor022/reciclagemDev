package br.com.reciclagemDev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    
    private String url;
    private String username;
    private String password;
    private Connection connection;
    
    public Database() {
        this.url = "jdbc:h2:~/test";
        this.username = "sa";
        this.password = "sa";
    }
    
    public void connect(){
        try{
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conectou meu bom");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public void disconnect() {
        try {
            if(connection != null) {
                connection.close();
                System.out.println("Fechou parceiro");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public ResultSet executeQuery(String query) {
        ResultSet resultSet = null;
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public void executeUpdate(String query) {
        try {
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(query);
            System.out.println(rowsAffected + " linhas afetadas");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        public void executeDelete(String query) {
        try {
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(query);
            System.out.println(rowsAffected + " linhas afetadas");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertIntoPost(String material, String peso, String descricao, String nome, String sobrenome, String endereco) {
        try {
            String sql = "INSERT INTO POST (MATERIAL, PESO, DESCRICAO, NOME, SOBRENOME, ENDERECO) VALUES ('" + material + "', " + peso + ", '" + descricao + "', '" + nome + "', '" + sobrenome + "', '" + endereco + "')";
    
            Statement statement = connection.createStatement();
            int rowsAfetadas = statement.executeUpdate(sql);
            System.out.println(rowsAfetadas + " linhas afetadas");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertIntoUsuario(String nome, String sobreNome, String cpf, String email, String senha, String endereco) {
        try {
            String sql = "INSERT INTO USUARIO (NOME, SOBRENOME, CPF, EMAIL, SENHA, ENDERECO) VALUES ('" + nome + "', '" + sobreNome + "', '" + cpf + "', '" + email + "', '" + senha + "', '" + endereco + "')";
    
            Statement statement = connection.createStatement();
            int rowsAfetadas = statement.executeUpdate(sql);
            System.out.println(rowsAfetadas + " linhas afetadas");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertIntoEmpresa(String cnpj, String nomeEmpresa, String email, String senha, String endereco) {
        try {
            String sql = "INSERT INTO EMPRESA (CNPJ, NOMEEMPRESA, EMAIL, SENHA, ENDERECO) VALUES ('" + cnpj + "', '" + nomeEmpresa + "', '" + email + "', '" + senha + "', '" + endereco + "')";
    
            Statement statement = connection.createStatement();
            int rowsAfetadas = statement.executeUpdate(sql);
            System.out.println(rowsAfetadas + " linhas afetadas");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

