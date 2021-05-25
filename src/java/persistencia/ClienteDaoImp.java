
package persistencia;

public class ClienteDaoImp implements ClienteDao {

    @Override
    public Object[] buscar(String cod) {
        return Operacion.buscar("SELECT * FROM cliente WHERE cod='"+cod+"'");
    }
    
}
