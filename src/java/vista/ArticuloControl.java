
package vista;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.ArticuloServicio;
import servicio.ArticuloServicioImp;

@WebServlet(name = "ArticuloControl", urlPatterns = {"/ArticuloControl"})
public class ArticuloControl extends HttpServlet {

    
    private ArticuloServicio artSer;
    private ArticuloPresentador artPre;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String acc = request.getParameter("acc");
            
            if(acc.equals("Grabar")){
                artSer = new ArticuloServicioImp();
                
                String cod = request.getParameter("cod");
                String nom = request.getParameter("nom");
                String pre = request.getParameter("pre");
                String sto = request.getParameter("sto");
                
                artSer.grabar(cod, nom, pre, sto);
                response.sendRedirect("Admin.jsp");
            }
            
            if(acc.equals("Listar")){
                artSer = new ArticuloServicioImp();
                artPre = new ArticuloPresentador();
                artPre.setLis(artSer.listarArticulos());
                request.getSession().setAttribute("artPre", artPre);
                response.sendRedirect("ArticuloLista.jsp");
            }
            
            if(acc.equals("Quitar")){
                String cod = request.getParameter("cod"); // COD ARTICULO
                artSer = new ArticuloServicioImp();
                artSer.eliminarArticulo(cod);
                artPre.setLis(artSer.listarArticulos());
                request.getSession().setAttribute("artPre", artPre);
                response.sendRedirect("ArticuloLista.jsp");
            }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
