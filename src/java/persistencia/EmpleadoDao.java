/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import negocio.Empleado;

/**
 *
 * @author Jose
 */
public class EmpleadoDao {

    public static String grabar(Empleado emp){
        String sql = "INSERT INTO empleado VALUES('"+ emp.getCod()+"','"+emp.getNom()+"','"+emp.getTip()+"','"+emp.getUsu()+"','"+emp.getPas()+"')";
        String msg = Operacion.ejecutar(sql);
        return msg;
    }
}
