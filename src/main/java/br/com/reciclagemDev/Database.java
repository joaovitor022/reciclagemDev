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

    public void insertIntoPost(String material, int peso, String descricao) {
        try {
            String sql = "INSERT INTO tabela_post (nome, idade) VALUES ('" + material + "', " + peso + ", '" + descricao + "')";
    
            Statement statement = connection.createStatement();
            int rowsAfetadas = statement.executeUpdate(sql);
            System.out.println(rowsAfetadas + " linhas afetadas");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

