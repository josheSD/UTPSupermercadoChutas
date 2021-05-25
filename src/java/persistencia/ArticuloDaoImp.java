
package persistencia;

import java.util.List;
import negocio.Articulo;

public class ArticuloDaoImp implements ArticuloDao {

    @Override
    public List listar() {
        return Operacion.listar("SELECT * FROM articulo");
    }

    @Override
    public String grabar(Articulo art) {
        String sql = "INSERT INTO articulo VALUES('"+ art.getCod()+"','"+art.getNom()+"',"+art.getPre()+","+art.getSto()+")";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(String cod) {
        String sql = "DELETE FROM articulo WHERE cod='"+cod+"'";
        return Operacion.ejecutar(sql);
    }
    
}
