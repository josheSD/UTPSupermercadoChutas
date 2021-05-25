
package persistencia;

import negocio.Proveedor;

public class ProveedorDaoImp implements ProveedorDao{

    @Override
    public String grabar(Proveedor pro) {
        String sql = "INSERT INTO proveedor VALUES('"+ pro.getCod()+"','"+pro.getNom()+"','"+pro.getDir()+"','"+pro.getUsu()+"','"+pro.getPas()+"')";
        String msg = Operacion.ejecutar(sql);
        return msg;
    }
    
    @Override
    public Object[] buscar(String cod) {
        return Operacion.buscar("SELECT * FROM proveedor WHERE cod='"+cod+"'");
    }
    
}
