
package vista;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.EmpleadoServicio;
import servicio.EmpleadoServicioImp;

@WebServlet(name = "EmpleadoControl", urlPatterns = {"/EmpleadoControl"})
public class EmpleadoControl extends HttpServlet {
    private EmpleadoServicio empSer;
    
    public EmpleadoControl(){
        empSer = new EmpleadoServicioImp();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String acc = request.getParameter("acc");
        if(acc.equals("Grabar")){
            
            String cod = request.getParameter("cod");
            String nom = request.getParameter("nom");
            String tip = request.getParameter("tip");
            String usu = request.getParameter("usu");
            String pas = request.getParameter("pas");

            String msg = empSer.grabar(cod, nom, tip, usu, pas);
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("Login.jsp");
            
        }
        if(acc.equals("Iniciar Sesion")){
            
            String usu = request.getParameter("usu");
            String pas = request.getParameter("pas");
            
            Object[]fil = empSer.validar(usu, pas);
            if(fil != null){
                request.getSession().setAttribute("fil", fil);
                response.sendRedirect("Admin.jsp");
            }else{
                request.getSession().setAttribute("mgs", "Acceso no permitido");
                response.sendRedirect("index.htm");
            }
            
        }
        
        if(acc.equals("Buscar")){
            String cod = request.getParameter("cod");
            
            Object[]empleadoDB = empSer.buscar(cod);
            if(empleadoDB != null){
                request.getSession().setAttribute("empleadoDB", empleadoDB);
                response.sendRedirect("EmpleadoEditar.jsp");
            }else{
                request.getSession().setAttribute("mgs", "Empleado no encontrado");
                response.sendRedirect("EmpleadoMensaje.jsp");
            }
            
        }
        
        if(acc.equals("Listar")){
            List list = empSer.listar();
            request.getSession().setAttribute("lis",list);
            response.sendRedirect("EmpleadoListar.jsp");
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
