
package persistencia;

import negocio.Proveedor;

public class ProveedorDao {
    
    public static String grabar(Proveedor pro){
        String sql = "INSERT INTO proveedor VALUES('"+ pro.getCod()+"','"+pro.getNom()+"','"+pro.getDir()+"','"+pro.getUsu()+"','"+pro.getPas()+"')";
        String msg = Operacion.ejecutar(sql);
        return msg;
    }
}
