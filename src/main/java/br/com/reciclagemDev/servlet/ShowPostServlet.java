package br.com.reciclagemDev.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.reciclagemDev.PostDao;
import br.com.reciclagemDev.model.Post;

@WebServlet("/showPost")
public class ShowPostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Post> posts = new PostDao().showPosts();

        req.setAttribute("posts", posts);

        for(Post post : posts) {
            
            System.out.println(post.getDescricao());

        }

        req.getRequestDispatcher("/pages/Empresa.jsp").forward(req, resp);

    }
}
