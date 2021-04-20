
package servicio;

import negocio.Proveedor;
import persistencia.ProveedorDao;

public class ProveedorServicio {
    
    public static String grabar(String cod,String nom,String tip,String usu,String pas){
        Proveedor emp = new Proveedor(cod,nom,tip,usu,pas);
        String msg = ProveedorDao.grabar(emp);
        return msg;
    }
    
}
