import br.com.reciclagemDev.UserDAO;
import br.com.reciclagemDev.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/loginUs")
public class LoginUsServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("login.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String senha = req.getParameter("senha");

        User user = new User(email, senha);

        boolean isValidUser = new UserDAO().verifyCredentials(user);

        if (isValidUser) {

            req.getSession().setAttribute("loggedUser", email);

            resp.sendRedirect("Usuario.html");

        } else {

            req.setAttribute("message", "Login inválido");

            req.getRequestDispatcher("login.jsp").forward(req, resp);

        }

    }
    
}