
package servicio;

import java.util.List;

public interface ArticuloServicio {
 
    public String grabar(String cod,String nom,String pre,String sto);
    public List listarArticulos();
    public String eliminarArticulo(String cod);
    
}
