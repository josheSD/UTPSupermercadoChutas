
package persistencia;

import java.util.List;
import negocio.Empleado;

public class EmpleadoDaoImp implements EmpleadoDao{

    @Override
    public String grabar(Empleado emp){
        String sql = "INSERT INTO empleado VALUES('"+ emp.getCod()+"','"+emp.getNom()+"','"+emp.getTip()+"','"+emp.getUsu()+"','"+emp.getPas()+"')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public Empleado validar(String usu, String pas) {
        String sql = "SELECT * FROM empleado WHERE usu LIKE '"+usu+"' AND pas LIKE '"+pas+"'";
        Object[]fil = Operacion.buscar(sql);
        if(fil != null){
            Empleado emp = new Empleado();
            emp.setCod(fil[0].toString());
            emp.setNom(fil[1].toString());
            emp.setTip(fil[2].toString());
            emp.setUsu(fil[3].toString());
            emp.setPas(fil[4].toString());
            return emp;
        }
        return null;
    }

    @Override
    public Empleado buscar(String cod) {
        String sql = "SELECT * FROM empleado WHERE cod='"+cod+"'";
        Object[]fil = Operacion.buscar(sql);
        if(fil != null){
            Empleado emp = new Empleado();
            emp.setCod(fil[0].toString());
            emp.setNom(fil[1].toString());
            emp.setTip(fil[2].toString());
            emp.setUsu(fil[3].toString());
            emp.setPas(fil[4].toString());
            return emp;
        }
        return null;
    }

    @Override
    public String actualizar(String tip, String pas, String cod) {
        String sql = "UPDATE empleado SET tip='"+tip+"', pas='"+pas+"' WHERE cod='"+cod+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(String cod) {
        String sql = "DELETE FROM empleado WHERE cod='"+cod+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public List listar() {
        String sql = "SELECT * FROM empleado";
        List list = Operacion.listar(sql);
        if(list != null){
            return list;
        }
        return null;
    }
}
