package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ProveedorRegistro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Proveedor Registro | Supermercado Tick</title>\n");
      out.write("        <style>@import\"./assets/css/styles.css\";</style>\n");
      out.write("        <style>@import\"./assets/css/components/login.css\";</style>\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"./assets/img/tick.png\">\n");
      out.write("        <meta name=\"theme-color\" content=\"#0078D7\">\n");
      out.write("        <meta name='viewport' content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0'/>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/2fb25d77eb.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        \n");
      out.write("        <!-- BOOSTSTRAP -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\" integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"theme-light\" id=\"body\">\n");
      out.write("        \n");
      out.write("        <main class=\"l-auth\">\n");
      out.write("\n");
      out.write("            <section class=\"l-auth__hero\">\n");
      out.write("\n");
      out.write("                <article class=\"l-auth__hero-top\"></article>\n");
      out.write("                <article class=\"l-auth__hero-top-left\"> <img src=\"./assets/img/tick.png\"> </article> \n");
      out.write("                <article class=\"l-auth__hero-bottom\"></article>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section class=\"l-auth__content\">\n");
      out.write("\n");
      out.write("                <article>\n");
      out.write("\n");
      out.write("                    <aside>\n");
      out.write("                        <p class=\"title\">Bienvenido al Sistema de</p>\n");
      out.write("                        <p class=\"subtitle\">Supermercado <span>Tick</span></p>\n");
      out.write("                        <img src=\"./assets/img/login/laptop-erp.png\" alt=\"laptop\">\n");
      out.write("                    </aside>\n");
      out.write("\n");
      out.write("                </article>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section class=\"l-auth__login\">\n");
      out.write("\n");
      out.write("                <!-- START REGISTER EMPLEADO -->\n");
      out.write("                \n");
      out.write("                <section class=\"l-login-hero\">\n");
      out.write("                    <img src=\"./assets/img/tick.png\" alt=\"logo\">\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <main class=\"l-login\">\n");
      out.write("\n");
      out.write("                    <section class=\"l-login__title\">\n");
      out.write("\n");
      out.write("                        <h1> Registrar Proveedor </h1>\n");
      out.write("\n");
      out.write("                    </section>\n");
      out.write("\n");
      out.write("                    <section class=\"l-login__content\">\n");
      out.write("\n");
      out.write("                        <form method=\"post\" action=\"ProveedorControl\" >\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-12 px-0\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"formGroupExampleInput\" for=\"cod\">Codigo</label>\n");
      out.write("                                            <input placeholder=\"P001\" id=\"cod\" name=\"cod\" type=\"text\" class=\"form-control\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-12 px-0\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"formGroupExampleInput\" for=\"nom\">Nombre</label>\n");
      out.write("                                            <input id=\"nom\" name=\"nom\" type=\"text\" class=\"form-control\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-12 px-0\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"formGroupExampleInput\" for=\"dir\">Dirección</label>\n");
      out.write("                                            <input id=\"dir\" name=\"dir\" type=\"text\" class=\"form-control\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-12 px-0\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"formGroupExampleInput\" for=\"usu\">Usuario</label>\n");
      out.write("                                            <input id=\"usu\" name=\"usu\" type=\"text\" class=\"form-control\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-12 px-0\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"formGroupExampleInput\" for=\"pas\">Password</label>\n");
      out.write("                                            <input id=\"pas\" name=\"pas\" type=\"password\" class=\"form-control\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <input type=\"submit\" class=\"btn btn-primary\" placeholder=\"Crear\" name=\"acc\" value=\"Grabar\" />\n");
      out.write("                            \n");
      out.write("                            <a href=\"./Login.jsp\" class=\"aviso-regitro mt-2\">Volver</a>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </section>\n");
      out.write("\n");
      out.write("                </main>\n");
      out.write("                <!-- START REGISTER EMPLEADO -->\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
