
package servicio;

import negocio.Proveedor;
import persistencia.ProveedorDao;
import persistencia.ProveedorDaoImp;

public class ProveedorServicioImp implements ProveedorServicio{
    
    private ProveedorDao proDao;
    
    public ProveedorServicioImp(){
        this.proDao = new ProveedorDaoImp();
    }
    
    @Override
    public String grabar(String cod, String nom, String tip, String usu, String pas) {
        Proveedor pro = new Proveedor(cod,nom,tip,usu,pas);
        String msg = proDao.grabar(pro);
        return msg;
    }
    
}
