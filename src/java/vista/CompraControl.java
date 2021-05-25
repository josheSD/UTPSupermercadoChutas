
package vista;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.CompraServicio;
import servicio.CompraServicioImp;

@WebServlet(name = "CompraControl", urlPatterns = {"/CompraControl"})
public class CompraControl extends HttpServlet {

    private CompraServicio comSer;
    private CompraPresentador comPre;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
            String acc = request.getParameter("acc");
            
            if(acc.equals("Nuevo")){
                comSer = new CompraServicioImp();
                comPre = new CompraPresentador();
                
                String cod = request.getParameter("cod");
                comPre.setFil(comSer.nuevoPedido(cod));
                request.getSession().setAttribute("comPre", comPre);
                
                response.sendRedirect("CompraGui.jsp");
            }
            if(acc.equals("Listar")){
                comPre.setLis(comSer.listarArticulos());
                response.sendRedirect("CompraListaGui.jsp");
            }
            if(acc.equals("Agregar")){
                String cod=request.getParameter("cod");
                String nom=request.getParameter("nom");
                String pre=request.getParameter("pre");
                String can=request.getParameter("can");
                comPre.setLis(comSer.agregarArticulo(cod, nom, pre, can));
                
                response.sendRedirect("CompraGui.jsp");
            }
            if(acc.equals("Quitar")){
                String cod = request.getParameter("cod"); // COD ARTICULO
                comPre.setLis(comSer.quitarArticulo(cod));
                response.sendRedirect("CompraGui.jsp");
            }
            if(acc.equals("Buscar")){
                String cod = request.getParameter("cod"); // COD PROVEEDOR
                Object[] fil = comSer.buscarProveedor(cod);
                if(fil!=null){
                    comPre.setFil2(fil);
                }else{
                    comPre.setMsg("Cliente no existe en la BD");
                }
                response.sendRedirect("CompraGui.jsp");
            }
            if(acc.equals("Grabar")){
                String cod = request.getParameter("cod"); // COD PROVEEDOR
                comPre.setMsg(comSer.grabarPedido(cod));
                response.sendRedirect("CompraGui.jsp");
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
