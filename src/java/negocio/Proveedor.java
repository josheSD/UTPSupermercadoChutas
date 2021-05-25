
package negocio;

public class Proveedor {
        
    private String cod,nom,dir,usu,pas;
    
    public Proveedor(){}

    public Proveedor(String cod, String nom, String dir, String usu, String pas) {
        this.cod = cod;
        this.nom = nom;
        this.dir = dir;
        this.usu = usu;
        this.pas = pas;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }

    public String getCod() {
        return cod;
    }

    public String getNom() {
        return nom;
    }

    public String getDir() {
        return dir;
    }

    public String getUsu() {
        return usu;
    }

    public String getPas() {
        return pas;
    }
    
}
