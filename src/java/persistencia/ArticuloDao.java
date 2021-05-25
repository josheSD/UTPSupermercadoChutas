
package persistencia;

import java.util.List;
import negocio.Articulo;

public interface ArticuloDao {
    
    public List listar();
    public String grabar(Articulo art);
    public String eliminar(String cod);
    
}
