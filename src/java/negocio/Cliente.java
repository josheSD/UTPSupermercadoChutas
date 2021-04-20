
package negocio;


public class Cliente {
    
    private String cod,nom,dir,usu,pas;

    public Cliente(String cod, String nom, String dir, String usu, String pas) {
        this.cod = cod;
        this.nom = nom;
        this.dir = dir;
        this.usu = usu;
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
