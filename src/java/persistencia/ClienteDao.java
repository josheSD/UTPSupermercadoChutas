
package persistencia;

import negocio.Cliente;

public class ClienteDao {
    
    public static String grabar(Cliente cli){
        String sql = "INSERT INTO cliente VALUES('"+ cli.getCod()+"','"+cli.getNom()+"','"+cli.getDir()+"','"+cli.getUsu()+"','"+cli.getPas()+"')";
        String msg = Operacion.ejecutar(sql);
        return msg;
    }
    
}
