import br.com.reciclagemDev.UserDAO;
import br.com.reciclagemDev.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getSession().invalidate();
        

        req.setAttribute("message", "Logout bem sucedido");

        req.getRequestDispatcher("pages/Login.jsp").forward(req, resp);

    }

}