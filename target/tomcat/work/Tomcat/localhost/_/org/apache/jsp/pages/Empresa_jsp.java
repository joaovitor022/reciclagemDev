/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-11-16 03:27:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Empresa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"desciption\" content=\"Projeto PI-Reciclagem\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/main.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/Empresa.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"../Imagens/Logo/icone-logo1.png\" type=\"image/x-icon\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\"\r\n");
      out.write("        integrity=\"sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==\"\r\n");
      out.write("        crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Inter&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("        integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\r\n");
      out.write("    <title>Empresa</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("        <img src=\"../Imagens/Logo/lixo eletronico about.png\"\r\n");
      out.write("            alt=\"Logo simbolo de reciclagem com circuitos eletrÃ´nicos\">\r\n");
      out.write("\r\n");
      out.write("        <ul>\r\n");
      out.write("            <a href=\"../index.html\">\r\n");
      out.write("                <li>Home</li>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"../pages/Informativo_Lixo.html\">\r\n");
      out.write("                <li>Tipos de lixo</li>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"\">\r\n");
      out.write("                <li>OpÃ§Ã£o 3</li>\r\n");
      out.write("            </a>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <form action=\"/logout\">\r\n");
      out.write("            <div class=\"buttons\">\r\n");
      out.write("                <button class=\"cadastro\">Sair</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </header>\r\n");
      out.write("    <main>\r\n");
      out.write("        <img id=\"loginem1\" src=\"../Imagens/Empresa/Imagemlogin1.svg\" alt=\"Login empresa\">\r\n");
      out.write("        <div class=\"cabe\">\r\n");
      out.write("            <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.nomeUser}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h1>\r\n");
      out.write("            <span class=\"placeholder w-75\"> </span>\r\n");
      out.write("            <img id=\"bell\" src=\"../Imagens/Empresa/BEll.svg\" alt=\"Bell\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <table class=\"dados\">\r\n");
      out.write("            <h3>Seus dados</h3>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Nome: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.nomeUser}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>CNPJ: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.cnpjUser}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>EndereÃ§o: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.enderecoUser}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"altButton\">\r\n");
      out.write("            <form action=\"/delete-account-us\" method=\"post\">\r\n");
      out.write("                <div class=\"button-delete\">\r\n");
      out.write("                    <button>Deletar conta</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <button><a href=\"../pages/AtualizarDados.html\">Atualizar dados</a></button>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"buttons\">\r\n");
      out.write("            <a href=\"/showPost\"><button class=\"cadastro\">Mostrar novos posts</button></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </main>\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"listas\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                Lista 1\r\n");
      out.write("                <a href=\"\">\r\n");
      out.write("                    <li>item 1</li>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"\">\r\n");
      out.write("                    <li>item 2</li>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"\">\r\n");
      out.write("                    <li>item 3</li>\r\n");
      out.write("                </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul>\r\n");
      out.write("                Lista 2\r\n");
      out.write("                <a href=\"\">\r\n");
      out.write("                    <li>item 1</li>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"\">\r\n");
      out.write("                    <li>item 2</li>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"\">\r\n");
      out.write("                    <li>item 3</li>\r\n");
      out.write("                </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul>\r\n");
      out.write("                Lista 3\r\n");
      out.write("                <a href=\"\">\r\n");
      out.write("                    <li>item 1</li>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"\">\r\n");
      out.write("                    <li>item 2</li>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"\">\r\n");
      out.write("                    <li>item 3</li>\r\n");
      out.write("                </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"direitos\">\r\n");
      out.write("            <p>&copy;2023 ReciclaDev. todos os direitos reservados.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /pages/Empresa.jsp(82,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("post");
    // /pages/Empresa.jsp(82,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/pages/Empresa.jsp(82,8) '${posts}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${posts}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <section class=\"paragrafos\">\r\n");
          out.write("                <div class=\"paragrafo center\">\r\n");
          out.write("                        <div class=\"texto\">\r\n");
          out.write("                            <p class=\"placeholder-glow \">\r\n");
          out.write("                            <h1><img id=\"loginem\" src=\"../Imagens/Empresa/Imagemlogin1.svg\" alt=\"Login empresa\">Nome do\r\n");
          out.write("                                usuÃ¡rio\r\n");
          out.write("                            </h1>\r\n");
          out.write("                            <p class=\" dadoslogin\"> Dados de endereÃ§o </p>\r\n");
          out.write("                            <span class=\"placeholder col-12\"></span>\r\n");
          out.write("                            </p>\r\n");
          out.write("\r\n");
          out.write("                                <p class=\"placeholder-wave\">\r\n");
          out.write("                                    Material: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.material}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                                </p>\r\n");
          out.write("                                <p class=\"placeholder-wave\">\r\n");
          out.write("                                    Peso: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.peso}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                                </p>\r\n");
          out.write("                                <br>\r\n");
          out.write("                                <p class=\"placeholder-wave\">\r\n");
          out.write("                                    DescriÃ§Ã£o: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.descricao}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                                </p>\r\n");
          out.write("\r\n");
          out.write("                            <br>\r\n");
          out.write("                            <div class=\"d-grid gap-2 col-6 mx-auto\">\r\n");
          out.write("                                <button type=\"button\" class=\"btn btn-outline-success  indi\">Indicar interrese </button>\r\n");
          out.write("                            </div>\r\n");
          out.write("\r\n");
          out.write("                        </div>\r\n");
          out.write("\r\n");
          out.write("                    </div>\r\n");
          out.write("                \r\n");
          out.write("            </section>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
