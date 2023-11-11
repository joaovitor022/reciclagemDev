package br.com.reciclagemDev.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.h2.tools.RunScript;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;


@WebServlet(loadOnStartup = 1, urlPatterns = "/database")
public class AutoScriptServlet extends HttpServlet {



    @Override
    public void init() throws ServletException {

        loadDatabase();

    }

    public void loadDatabase() {

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            RunScript.execute(connection, new FileReader("src/main/resources/scriptTabelas.sql"));

            System.out.println("Tabelas inseridas com sucesso");

        } catch (Exception e) {

            System.out.println("Falha na inserção de tabelas. Motivo: {}" + e.getMessage());

        }

    }

}