package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controle.classes.Conexao;

public final class buscar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns:h=\"http://xmlns.jcp.org/jsf/html\" xmlns:f=\"http://xmlns.jcp.org/jsf/core\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilo.css\" />\n");
      out.write("        <title>Consulta</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"interfaceOperacoes\">\n");
      out.write("            <font size=\"5\"><a href=\"menu.jsp\" class=\"linkButton\">Menu<a/></font>\n");
      out.write("            <div class=\"operacoes\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Digite o nome do produto a ser procurado:</legend>    \n");
      out.write("\n");
      out.write("                    <form  action=\"BuscarServlet\" method=\"Post\">\n");
      out.write("                        Insira o Nome: <input type=\"text\" name=\"nome\" value=\"\" /><br/><br/><br/>\n");
      out.write("                        <input type=\"submit\" value=\"Buscar\" />\n");
      out.write("                    </form>\n");
      out.write("                    \n");
      out.write("                    <br/><br/><br/><br/><br/>\n");
      out.write("                    <table border=\"1\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Código</th>\n");
      out.write("                                <th>Nome</th>\n");
      out.write("                                <th>Marca</th>\n");
      out.write("                                <th>Descrição</th>\n");
      out.write("                                <th>Preço de Compra</th>\n");
      out.write("                                <th>Preço de Venda</th>\n");
      out.write("                                <th>Lucro</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(//id );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(//nome );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(//marca );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(//descricao );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(//precoCompra );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(//precoVenda );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(//lucro );
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("                <br/><br/><br/><br/><br/>\n");
      out.write("                <center>\n");
      out.write("                <font size=\"5\"><a href=\"cadastro.jsp\" class=\"linkButton\">Cadastrar novo produto<a/></font>\n");
      out.write("                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <font size=\"5\"><a href=\"editar.jsp\" class=\"linkButton\">Editar produto<a/></font>  \n");
      out.write("                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <font size=\"5\"><a href=\"excluir.jsp\" class=\"linkButton\">Excluir produto<a/></font>\n");
      out.write("                </center>    \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("                </body>\n");
      out.write("                </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
