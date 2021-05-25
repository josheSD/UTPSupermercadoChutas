
package negocio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private String num,fec;
    private Proveedor pro;
    private Empleado emp;
    private List<LineaPedido> ces = new ArrayList<LineaPedido>();

    public void agregarLinea(Articulo art, int cant){
        LineaPedido lin = new LineaPedido(art,cant); 
        ces.add(lin);
    }
    
    public void quitarLinea(String cod){
        for(int i=0; i<ces.size();i++){
            LineaPedido lin = (LineaPedido) ces.get(i);
            if(lin.getArt().getCod().equals(cod)){
                ces.remove(i);
            }
        }
    }
    
    public double getTot(){
        double tot = 0;
        for(int i=0; i<ces.size();i++){
            LineaPedido lin = (LineaPedido) ces.get(i);
            tot += lin.getImp();
        }
        return tot;
    }
    
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public Proveedor getPro() {
        return pro;
    }

    public void setPro(Proveedor pro) {
        this.pro = pro;
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

    public List<LineaPedido> getCes() {
        return ces;
    }

    public void setCes(List<LineaPedido> ces) {
        this.ces = ces;
    }
    
}
