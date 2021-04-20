
package servicio;

import negocio.Empleado;
import persistencia.EmpleadoDao;

public class EmpleadoServicio {
    
    public static String grabar(String cod,String nom,String tip,String usu,String pas){
        Empleado emp = new Empleado(cod,nom,tip,usu,pas);
        String msg = EmpleadoDao.grabar(emp);
        return msg;
    }
    
}
