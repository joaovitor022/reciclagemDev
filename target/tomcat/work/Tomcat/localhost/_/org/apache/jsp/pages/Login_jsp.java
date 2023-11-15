/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-11-15 16:16:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"desciption\" content=\"Projeto PI-Reciclagem\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/main.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/Login.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../Imagens/Logo/icone-logo1.png\" type=\"image/x-icon\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Inter&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("    </head>\r\n");
      out.write("        <body>\r\n");
      out.write("            <header>\r\n");
      out.write("                <div class=\"image\">\r\n");
      out.write("                    <a href=\"../index.html\"><img src=\"../Imagens/Logo/icone-logo1.png\" alt=\"Ãcone\"> </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </header>\r\n");
      out.write("                    <main>\r\n");
      out.write("                        <div class=\"message\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("                        <section class=\"tela-login\">\r\n");
      out.write("                            <div class=\"btns\">\r\n");
      out.write("                                <button onclick=\"mostrarUsuario()\" class=\"btn-usuario\">UsuÃ¡rio</button>\r\n");
      out.write("                                <button onclick=\"mostrarEmpresa()\" class=\"btn-empresa\">Empresa</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                                <div class=\"usuario\">\r\n");
      out.write("                                    <h2>Login</h2>\r\n");
      out.write("                                    <form action=\"/loginUs\" method=\"post\">\r\n");
      out.write("                                        <label for=\"usuario\">UsuÃ¡rio:</label>\r\n");
      out.write("                                        <input type=\"text\" id=\"usuario\" name=\"usuario\" required>\r\n");
      out.write("                                    \r\n");
      out.write("                                        <label for=\"senha\">Senha:</label>\r\n");
      out.write("                                        <input type=\"password\" id=\"senha\" name=\"senha\" required>\r\n");
      out.write("                                    \r\n");
      out.write("                                        <button type=\"submit\">Entrar</button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                    <div class=\"registro\">\r\n");
      out.write("                                        <p>NÃ£o possui login?</p>\r\n");
      out.write("                                        <a href=\"../pages/Cadastro.html\"><button type=\"button\">Registrar-se</button></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"empresa\">\r\n");
      out.write("                                    <h2>Login</h2>\r\n");
      out.write("                                    <form action=\"/login\" method=\"post\">\r\n");
      out.write("                                        <label for=\"usuario\">UsuÃ¡rio:</label>\r\n");
      out.write("                                        <input type=\"text\" id=\"usuario\" name=\"usuario\" required>\r\n");
      out.write("                                    \r\n");
      out.write("                                        <label for=\"senha\">Senha:</label>\r\n");
      out.write("                                        <input type=\"password\" id=\"senha\" name=\"senha\" required>\r\n");
      out.write("                                    \r\n");
      out.write("                                        <button type=\"submit\">Entrar</button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                    <div class=\"registro\">\r\n");
      out.write("                                        <p>NÃ£o possui login?</p>\r\n");
      out.write("                                        <a href=\"../pages/Cadastro.html\"><button type=\"button\">Registrar-se</button></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                        </section>\r\n");
      out.write("                    </main>\r\n");
      out.write("                    <div class=\"direitos\">\r\n");
      out.write("                        <p>&copy;2023 ReciclaDev. todos os direitos reservados.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <script src=\"../js/front.js\"></script>\r\n");
      out.write("        </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
