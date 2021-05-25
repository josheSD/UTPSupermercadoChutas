
package servicio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import negocio.*;
import persistencia.*;

public class PedidoServicioImp implements PedidoServicio {

    private Pedido ped;
    
    @Override
    public Object[] nuevoPedido(String cod) {
        ped = new Pedido();
        ped.setNum("P00004");
        ped.setFec(getFec());
        ped.setEmp(verEmpleado(cod));
        return verPedido();
    }

    @Override
    public List agregarArticulo(String cod,String nom,String pre, String can) {
        Articulo art = new Articulo(cod,nom,Double.parseDouble(pre));
        ped.agregarLinea(art, Integer.parseInt(can));
        return verCesta();
    }

    @Override
    public List quitarArticulo(String cod) {
        ped.quitarLinea(cod);
        return verCesta();
    }
    
    private String getFec(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(new Date());
    }
    
    private Object[] verPedido(){
        Object[] fil = new Object[5];
        fil[0] = ped.getNum();
        fil[1] = ped.getFec();
        fil[2] = ped.getTot();
        fil[3] = ped.getEmp().getCod();
        return fil;
    }
    
    private Empleado verEmpleado(String cod){
        Empleado emp = new Empleado();
        emp.setCod(cod);
        return emp;
    }
    
    private List verCesta(){
        List list = new ArrayList();
        for(int i=0; i<ped.getCes().size();i++){
            LineaPedido lin = (LineaPedido) ped.getCes().get(i);
            Object[]fil = new Object[6];
            fil[0] = lin.getArt().getCod();
            fil[1] = lin.getArt().getNom();
            fil[2] = lin.getArt().getPre();
            fil[3] = lin.getCan();
            fil[4] = lin.getImp();
            fil[5] = ped.getTot();
            list.add(fil);
        }
        return list;
    }

    @Override
    public List listarArticulos() {
        return new ArticuloDaoImp().listar();
    }

    @Override
    public Object[] buscarCliente(String cod) {
        Object[]fil=new ClienteDaoImp().buscar(cod);
        if(fil!=null){
            return fil;
        }
        return null;
    }

    @Override
    public String grabarPedido(String cod) {
        Cliente cli = new Cliente();
        cli.setCod(cod);
        ped.setCli(cli);
        String msg = new PedidoDaoImp().grabar(ped);
        if(msg==null){
            msg="Pedido Grabado";
        }
        return msg;
    }
    
}
