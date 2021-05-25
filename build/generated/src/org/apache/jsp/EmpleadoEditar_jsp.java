package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EmpleadoEditar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Dashboard | Supermercado Tick</title>\n");
      out.write("        <style>@import\"./assets/css/styles.css\";</style>\n");
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
      out.write("        <main class=\"l-admin\" id=\"admin\">\n");
      out.write("            \n");
      out.write("            <!-- START NAVBAR -->\n");
      out.write("            <section class=\"l-navbar\" id=\"navbar\">\n");
      out.write("                <article class=\"l-navbar__icon\">\n");
      out.write("\n");
      out.write("                    <aside class=\"l-hamburguer\" id=\"l-hamburguer\">\n");
      out.write("                        <div class=\"hamburger hamburger--slider\" id=\"hamburger\">\n");
      out.write("                            <span class=\"hamburger__box\">\n");
      out.write("                                <span class=\"hamburger__inner\"></span>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                    </aside>\n");
      out.write("\n");
      out.write("                    <img src=\"./assets/img/tick.png\">\n");
      out.write("\n");
      out.write("                </article>\n");
      out.write("                <article class=\"l-navbar__main\">\n");
      out.write("\n");
      out.write("                    <p class=\"mb-0\">Supermercado</p> <span>/</span> <p class=\"mb-0\">Tick - Dashboad...</p>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                </article>\n");
      out.write("                <article class=\"l-navbar__options\">\n");
      out.write("\n");
      out.write("                    <div class=\"l-toggle-theme\">\n");
      out.write("                        <div>\n");
      out.write("                            <input type=\"checkbox\" class=\"checkbox\" id=\"check-theme\" />\n");
      out.write("                            <label class=\"label\" for=\"check-theme\">\n");
      out.write("                                <i class=\"fas fa-moon\"></i>\n");
      out.write("                                <i class=\"fas fa-sun\"></i>\n");
      out.write("                                <div class=\"ball\"></div>\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </article>\n");
      out.write("                <article class=\"l-navbar__hero\">\n");
      out.write("                    <img src=\"./assets/img/admin/user.png\" id=\"user-photo\"> \n");
      out.write("                </article>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section class=\"l-navbar-profile\" id=\"navbar-profile\">\n");
      out.write("\n");
      out.write("                <article class=\"l-navbar-profile__name\">\n");
      out.write("                    <p class=\"mb-0\" >Supermercado Tick</p>\n");
      out.write("                </article>\n");
      out.write("\n");
      out.write("                <article class=\"l-navbar-profile__logout\">\n");
      out.write("                    <p class=\"mb-0\" id=\"sign-out\">Sign out</p>\n");
      out.write("                </article>\n");
      out.write("\n");
      out.write("                <article class=\"l-navbar-profile__info\">\n");
      out.write("\n");
      out.write("                    <aside class=\"l-navbar-profile__info-hero\">\n");
      out.write("\n");
      out.write("                        <img src=\"./assets/img/admin/user.png\"> \n");
      out.write("\n");
      out.write("                    </aside>\n");
      out.write("\n");
      out.write("                    <aside class=\"l-navbar-profile__info-user\">\n");
      out.write("                        ");
 Object[]fil = (Object[])session.getAttribute("fil"); 
      out.write("\n");
      out.write("                        <h2 class=\"mb-0\"> ");
      out.print( fil[0] );
      out.write(" </h2>\n");
      out.write("                        <p class=\"mb-0\" > ");
      out.print( fil[1] );
      out.write(" </p>\n");
      out.write("                        <p class=\"mb-0\" >View account</p>\n");
      out.write("                        <p class=\"mb-0\" >Switch directory</p>\n");
      out.write("                    </aside>\n");
      out.write("\n");
      out.write("                </article>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("            <!-- END NAVBAR -->\n");
      out.write("\n");
      out.write("            <section class=\"l-portal\" id=\"portal\">\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("            <!-- START SIDEBAR -->\n");
      out.write("            <section class=\"l-sidebar\" id=\"sidebar\">\n");
      out.write("                <main class=\"w-sidebar\">\n");
      out.write("\n");
      out.write("                    <article class=\"w-sidebar__title\">\n");
      out.write("                        <a href=\"javascript:void(0)\">\n");
      out.write("                            <span>\n");
      out.write("                                <img src=\"./assets/img/admin/proyecto.png\" /> \n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"module-parrafo\">\n");
      out.write("                                Supermercado Tick - Sist...\n");
      out.write("                            </span>\n");
      out.write("                        </a>\n");
      out.write("                    </article>\n");
      out.write("\n");
      out.write("                    <article class=\"w-sidebar__separator top\">\n");
      out.write("                    </article>\n");
      out.write("\n");
      out.write("                    <article class=\"w-sidebar__modules\">\n");
      out.write("\n");
      out.write("                            <section class=\"modules\">\n");
      out.write("\n");
      out.write("                                <div class=\"modules__main\">\n");
      out.write("                                    <a href=\"Admin.jsp\">\n");
      out.write("                                        <span>\n");
      out.write("                                            <img src=\"./assets/img/sidebar/01-analysis.svg\" alt=\"modulo\">\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"module-parrafo\">\n");
      out.write("                                            Dashboard\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </section>\n");
      out.write("\n");
      out.write("                            <section class=\"modules\" id=\"module-empleado\">\n");
      out.write("\n");
      out.write("                                <div class=\"modules__main\">\n");
      out.write("                                    <a href=\"javascript:void(0)\">\n");
      out.write("                                        <span>\n");
      out.write("                                            <img src=\"./assets/img/sidebar/08-id_card.svg\" alt=\"modulo\">\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"module-parrafo\">\n");
      out.write("                                            Empleado\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modules__sub\">\n");
      out.write("                                    <a href=\"EmpleadoBuscar.jsp\">\n");
      out.write("                                        <span>\n");
      out.write("                                            <i class=\"fab fa-shirtsinbulk\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"module-parrafo\">\n");
      out.write("                                            Buscar\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a>\n");
      out.write("                                        <span>\n");
      out.write("                                            <i class=\"fab fa-shirtsinbulk\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"module-parrafo\">\n");
      out.write("                                            <form action=\"EmpleadoControl\" method=\"post\">\n");
      out.write("                                                <input type=\"submit\" class=\"btn btn-link p-0 text-dark\" name=\"acc\" value=\"Listar\">\n");
      out.write("                                            </form>\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </section>\n");
      out.write("\n");
      out.write("                            <section class=\"modules\" id=\"module-cliente\">\n");
      out.write("\n");
      out.write("                                <div class=\"modules__main\">\n");
      out.write("                                    <a href=\"javascript:void(0)\">\n");
      out.write("                                        <span>\n");
      out.write("                                            <img src=\"./assets/img/sidebar/08-id_card.svg\" alt=\"modulo\">\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"module-parrafo\">\n");
      out.write("                                            <form action=\"EmpleadoControl\">\n");
      out.write("                                                Cliente\n");
      out.write("                                            </form>\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modules__sub\">\n");
      out.write("                                    <a>\n");
      out.write("                                        <span>\n");
      out.write("                                            <i class=\"fab fa-shirtsinbulk\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"module-parrafo\">\n");
      out.write("                                            Buscar\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a>\n");
      out.write("                                        <span>\n");
      out.write("                                            <i class=\"fab fa-shirtsinbulk\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"module-parrafo\">\n");
      out.write("                                            Listar\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </section>\n");
      out.write("\n");
      out.write("                            <section class=\"modules\" id=\"module-proveedor\" >\n");
      out.write("\n");
      out.write("                                <div class=\"modules__main\">\n");
      out.write("                                    <a href=\"javascript:void(0)\">\n");
      out.write("                                        <span>\n");
      out.write("                                            <img src=\"./assets/img/sidebar/08-id_card.svg\" alt=\"modulo\">\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"module-parrafo\">\n");
      out.write("                                            Proveedor\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modules__sub\">\n");
      out.write("                                    <a>\n");
      out.write("                                        <span>\n");
      out.write("                                            <i class=\"fab fa-shirtsinbulk\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"module-parrafo\">\n");
      out.write("                                            Buscar\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a>\n");
      out.write("                                        <span>\n");
      out.write("                                            <i class=\"fab fa-shirtsinbulk\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"module-parrafo\">\n");
      out.write("                                            Listar\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </section>\n");
      out.write("\n");
      out.write("                            <section class=\"modules\" id=\"module-articulo\" >\n");
      out.write("\n");
      out.write("                                <div class=\"modules__main\">\n");
      out.write("                                    <a href=\"javascript:void(0)\">\n");
      out.write("                                        <span>\n");
      out.write("                                            <img src=\"./assets/img/sidebar/05-packing.svg\" alt=\"modulo\">\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"module-parrafo\">\n");
      out.write("                                            Articulo\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modules__sub\">\n");
      out.write("                                    <a>\n");
      out.write("                                        <span>\n");
      out.write("                                            <i class=\"fab fa-shirtsinbulk\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"module-parrafo\">\n");
      out.write("                                            Buscar\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a>\n");
      out.write("                                        <span>\n");
      out.write("                                            <i class=\"fab fa-shirtsinbulk\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"module-parrafo\">\n");
      out.write("                                            Listar\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </section>\n");
      out.write("\n");
      out.write("                            <section class=\"modules\" id=\"module-pedido\" >\n");
      out.write("\n");
      out.write("                                <div class=\"modules__main\">\n");
      out.write("                                    <a href=\"javascript:void(0)\">\n");
      out.write("                                        <span>\n");
      out.write("                                            <img src=\"./assets/img/sidebar/12-settings.svg\" alt=\"modulo\">\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"module-parrafo\">\n");
      out.write("                                            Procesos\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modules__sub\">\n");
      out.write("                                    <a>\n");
      out.write("                                        <span>\n");
      out.write("                                            <i class=\"fab fa-shirtsinbulk\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"module-parrafo\">\n");
      out.write("                                            <form action=\"PedidoControl\">\n");
      out.write("                                                <input type=\"hidden\" name=\"cod\" value=\"");
      out.print( fil[0] );
      out.write("\" >\n");
      out.write("                                                <input type=\"submit\" class=\"btn btn-link p-0 text-dark\" name=\"acc\" value=\"Nuevo\"/>\n");
      out.write("                                            </form>\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a>\n");
      out.write("                                        <span>\n");
      out.write("                                            <i class=\"fab fa-shirtsinbulk\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"module-parrafo\">\n");
      out.write("                                            Listar\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </section>\n");
      out.write("\n");
      out.write("                    </article>\n");
      out.write("\n");
      out.write("                    <article class=\"w-sidebar__separator bottom\">\n");
      out.write("                    </article>\n");
      out.write("\n");
      out.write("                    <article class=\"w-sidebar__icons\">\n");
      out.write("\n");
      out.write("                        <i class=\"fa fa-cog first\"></i>\n");
      out.write("                        <span>Project settings</span>\n");
      out.write("                        <i class=\"fas fa-angle-double-left second\" id=\"sidebar-bottom-angle\"></i>\n");
      out.write("\n");
      out.write("                    </article>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </main>\n");
      out.write("            </section>\n");
      out.write("            <!-- END SIDEBAR -->\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <!-- START MAIN -->\n");
      out.write("            <section class=\"l-main\" id=\"main\">\n");
      out.write("                <main class=\"l-empleado\">\n");
      out.write("\n");
      out.write("                    <p> Editar Empleado </p>\n");
      out.write("                    ");
 Object[]empleadoDB = (Object[])session.getAttribute("empleadoDB"); 
      out.write("\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                Codigo\n");
      out.write("                                <input type=\"text\" name=\"cod\" size=\"20\" value=\"");
      out.print( empleadoDB[0] );
      out.write("\" />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                Nombre\n");
      out.write("                                <input type=\"text\" name=\"nom\" size=\"20\" value=\"");
      out.print( empleadoDB[1] );
      out.write("\" />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                Tipo\n");
      out.write("                                <input type=\"text\" name=\"tip\" size=\"20\" value=\"");
      out.print( empleadoDB[2] );
      out.write("\" />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                    \n");
      out.write("                </main>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("            <!-- END MAIN-->\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\" src=\"./assets/js/admin.js\">\n");
      out.write("        </script>\n");
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
