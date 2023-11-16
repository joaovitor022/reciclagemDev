import br.com.reciclagemDev.EmpresaDAO;
import br.com.reciclagemDev.User;
import br.com.reciclagemDev.Empresa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/loginEm")
public class LoginEmServlet extends HttpServlet {

    Empresa empresa = new Empresa();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("pages/Login.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        String nome = empresa.getNomeEmpresa(email, senha);

        User user = new User(email, senha);

        boolean isValidUser = new EmpresaDAO().verifyCredentials(user);

        if (isValidUser == true) {

            req.getSession().setAttribute("loggedUser", email);
            req.getSession().setAttribute("loggedUserPass", senha);
            req.getSession().setAttribute("nomeUser", nome);

            resp.sendRedirect("pages/Empresa.jsp");

        } else {

            req.setAttribute("message", "Login inválido");

            req.getRequestDispatcher("pages/Login.jsp").forward(req, resp);

        }

    }
    
}