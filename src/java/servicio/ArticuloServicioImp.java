
package servicio;

import java.util.List;
import negocio.Articulo;
import persistencia.*;

public class ArticuloServicioImp implements ArticuloServicio{

    @Override
    public String grabar(String cod, String nom, String pre, String sto) {
        Articulo art = new Articulo(cod,nom,Double.parseDouble(pre),Integer.parseInt(sto));
        return new ArticuloDaoImp().grabar(art);
    }

    @Override
    public List listarArticulos() {
        return new ArticuloDaoImp().listar();
    }

    @Override
    public String eliminarArticulo(String cod) {
        return new ArticuloDaoImp().eliminar(cod);
    }
    
}
