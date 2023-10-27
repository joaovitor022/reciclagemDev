package br.com.reciclagemDev;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Post {
    private String material;
    private String peso;
    private String descricao;

    Database database = new Database();

    public String getMaterial() {
        database.connect();
        String query = "SELECT MATERIAL FROM PRODUTO";
        String material = null;
        try {
            ResultSet resultSet = database.executeQuery(query);
            if (resultSet.next()) {
                material = resultSet.getString("MATERIAL");
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            database.disconnect();
        }
        return material;
    }

    public void setMaterial(String material) {
        database.connect();
        String query = "UPDATE PRODUTO SET MATERIAL = '" + material + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public String getPeso() {
        database.connect();
        String query = "SELECT PESO FROM PRODUTO";
        String peso = null;
        try {
            ResultSet resultSet = database.executeQuery(query);
            if (resultSet.next()) {
                peso = resultSet.getString("PESO");
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            database.disconnect();
        }
        return peso;
    }

    public void setPeso(String peso) {
        database.connect();
        String query = "UPDATE PRODUTO SET PESO = '" + peso + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public String getDescricao() {
        database.connect();
        String query = "SELECT DESCRICAO FROM PRODUTO";
        String descricao = null;
        try {
            ResultSet resultSet = database.executeQuery(query);
            if (resultSet.next()) {
                descricao = resultSet.getString("DESCRICAO");
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            database.disconnect();
        }
        return descricao;
    }

    public void setDescricao(String descricao) {
        database.connect();
        String query = "UPDATE PRODUTO SET DESCRICAO = '" + descricao + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public List<Post> showPosts() {
        database.connect();
        String SQL = "SELECT MATERIAL, PESO, DESCRICAO FROM PRODUTO";
        try {
            List<Post> posts = new ArrayList<>();
            
            ResultSet resultSet = database.executeQuery(SQL);

            while (resultSet.next()) {
                Post post = new Post();
                post.setMaterial(resultSet.getString("MATERIAL"));
                post.setPeso(resultSet.getString("PESO"));
                post.setDescricao(resultSet.getString("DESCRICAO"));
    
                posts.add(post);
            }

            return posts;
        } catch (SQLException e) {
            e.printStackTrace();
            return Collections.emptyList();
        } finally {
            database.disconnect();
        }
}

}