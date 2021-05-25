
package servicio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import negocio.Articulo;
import negocio.Compra;
import negocio.Empleado;
import negocio.LineaPedido;
import negocio.Proveedor;
import persistencia.ArticuloDaoImp;
import persistencia.CompraDaoImp;
import persistencia.ProveedorDaoImp;

public class CompraServicioImp implements CompraServicio{

    private Compra com;
    
    @Override
    public Object[] nuevoPedido(String cod) {
        com = new Compra();
        com.setNum("C00001");
        com.setFec(getFec());
        com.setEmp(verEmpleado(cod));
        return verCompra();
    }

    @Override
    public List agregarArticulo(String cod, String nom, String pre, String can) {
        Articulo art = new Articulo(cod,nom,Double.parseDouble(pre));
        com.agregarLinea(art, Integer.parseInt(can));
        return verCesta();
    }

    @Override
    public List quitarArticulo(String cod) {
        com.quitarLinea(cod);
        return verCesta();
    }

    @Override
    public List listarArticulos() {
        return new ArticuloDaoImp().listar();
    }

    @Override
    public Object[] buscarProveedor(String cod) {
        Object[]fil=new ProveedorDaoImp().buscar(cod);
        if(fil!=null){
            return fil;
        }
        return null;
    }

    @Override
    public String grabarPedido(String cod) {
        Proveedor pro = new Proveedor();
        pro.setCod(cod);
        com.setPro(pro);
        String msg = new CompraDaoImp().grabar(com);
        if(msg==null){
            msg="Compra Grabado";
        }
        return msg;
        
    }
    
    private String getFec(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(new Date());
    }
    
    private Empleado verEmpleado(String cod){
        Empleado emp = new Empleado();
        emp.setCod(cod);
        return emp;
    }
    
    private Object[] verCompra(){
        Object[] fil = new Object[5];
        fil[0] = com.getNum();
        fil[1] = com.getFec();
        fil[2] = com.getTot();
        fil[3] = com.getEmp().getCod();
        return fil;
    }
    
    private List verCesta(){
        List list = new ArrayList();
        for(int i=0; i<com.getCes().size();i++){
            LineaPedido lin = (LineaPedido) com.getCes().get(i);
            Object[]fil = new Object[6];
            fil[0] = lin.getArt().getCod();
            fil[1] = lin.getArt().getNom();
            fil[2] = lin.getArt().getPre();
            fil[3] = lin.getCan();
            fil[4] = lin.getImp();
            fil[5] = com.getTot();
            list.add(fil);
        }
        return list;
    }
    
}
