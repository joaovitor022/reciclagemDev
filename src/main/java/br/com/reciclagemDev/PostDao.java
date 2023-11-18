package br.com.reciclagemDev;

import br.com.reciclagemDev.model.Post;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PostDao {

    Database database = new Database();

    public String getMaterial() {
        database.connect();
        String query = "SELECT MATERIAL FROM POST";
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
        String query = "UPDATE POST SET MATERIAL = '" + material + "' WHERE MATERIAL = '" + material + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public String getPeso() {
        database.connect();
        String query = "SELECT PESO FROM POST";
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
        String query = "UPDATE POST SET PESO = '" + peso + "' WHERE PESO = '" + peso + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public String getDescricao() {
        database.connect();
        String query = "SELECT DESCRICAO FROM POST";
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
        String query = "UPDATE POST SET DESCRICAO = '" + descricao + "' WHERE DESCRICAO = '" + descricao + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public String getNome() {
        database.connect();
        String query = "SELECT NOME FROM POST";
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
        String query = "UPDATE POST SET NOME = '" + nome + "' WHERE NOME = '" + nome + "'";
        database.executeUpdate(query);
        database.disconnect();
    }


    public String getSobrenome() {
        database.connect();
        String query = "SELECT SOBRENOME FROM POST";
        String sobrenome = null;
        try {
            ResultSet resultSet = database.executeQuery(query);
            if (resultSet.next()) {
                sobrenome = resultSet.getString("SOBRENOME");
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            database.disconnect();
        }
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        database.connect();
        String query = "UPDATE POST SET SOBRENOME = '" + sobrenome + "' WHERE SOBRENOME = '" + sobrenome + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public String getEndereco() {
        database.connect();
        String query = "SELECT ENDERECO FROM POST";
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
        String query = "UPDATE POST SET ENDERECO = '" + endereco + "' WHERE NOME = '" + endereco + "'";
        database.executeUpdate(query);
        database.disconnect();
    }

    public List<Post> showPosts() {

        database.connect();

        String SQL = "SELECT MATERIAL, PESO, DESCRICAO, NOME, SOBRENOME, ENDERECO FROM POST";
        try {
            List<Post> posts = new ArrayList<>();

            ResultSet resultSet = database.executeQuery(SQL);

            if (resultSet == null) {
                System.err.println("Erro: O ResultSet está nulo. Verifique a consulta SQL.");
            }

            while (resultSet.next()) {

                String material = resultSet.getString("MATERIAL");
                String peso = resultSet.getString("PESO");
                String description = resultSet.getString("DESCRICAO");
                String name = resultSet.getString("NOME");
                String lastName = resultSet.getString("SOBRENOME");
                String address = resultSet.getString("ENDERECO");

                Post post = new Post(material, peso, description, name, lastName, address);

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