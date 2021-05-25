
package persistencia;

import negocio.Pedido;

public class PedidoDaoImp implements PedidoDao{

    @Override
    public String grabar(Pedido p) {
 
        String sql = "insert into pedido values('"+p.getNum()+"','"+p.getFec()+"',"+p.getTot()+",'"+p.getCli().getCod()+"','"+p.getEmp().getCod()+"')";
        return Operacion.ejecutar(sql);
        
    }
    
    
    
}
