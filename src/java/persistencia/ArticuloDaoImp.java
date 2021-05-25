
package persistencia;

import java.util.List;

public class ArticuloDaoImp implements ArticuloDao {

    @Override
    public List listar() {
        return Operacion.listar("SELECT * FROM articulo");
    }
    
}
