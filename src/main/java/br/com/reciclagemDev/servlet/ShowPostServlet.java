package br.com.reciclagemDev.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.reciclagemDev.Post;

@WebServlet("/showPost")
public class ShowPostServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Post> posts = new Post().showPosts();

        req.setAttribute("posts", posts);
        req.getRequestDispatcher("../pages/posts.jsp").forward(req, resp);
    }
}
