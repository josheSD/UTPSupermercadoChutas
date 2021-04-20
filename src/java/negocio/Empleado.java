
package negocio;

public class Empleado {
    
    private String cod,nom,tip,usu,pas;
    
    public Empleado(String cod,String nom, String tip,String usu,String pas){
        this.cod = cod;
        this.nom = nom;
        this.tip = tip;
        this.usu = usu;
        this.pas = pas;
    }   

    public String getCod() {
        return cod;
    }

    public String getNom() {
        return nom;
    }

    public String getTip() {
        return tip;
    }

    public String getUsu() {
        return usu;
    }

    public String getPas() {
        return pas;
    }
    
}
