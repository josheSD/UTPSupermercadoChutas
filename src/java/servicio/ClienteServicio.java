
package servicio;

import negocio.Cliente;
import persistencia.ClienteDao;

public class ClienteServicio {
    
    public static String grabar(String cod,String nom,String tip,String usu,String pas){
        Cliente emp = new Cliente(cod,nom,tip,usu,pas);
        String msg = ClienteDao.grabar(emp);
        return msg;
    }
    
}
