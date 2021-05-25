
package servicio;

import java.util.List;

public interface CompraServicio {
    
    public Object[] nuevoPedido(String cod);
    public List agregarArticulo(String cod, String nom, String pre, String can);
    public List quitarArticulo(String cod);
    public List listarArticulos();
    public Object[] buscarProveedor(String cod);
    public String grabarPedido(String cod);
    
}
