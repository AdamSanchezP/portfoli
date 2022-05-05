package Bloque6.actividad7;

public class Bloc6_7_class1 {

    private String Nom;
    private int edat;
    private int telefon;
    private String departamentos;

    public Bloc6_7_class1(String Nom, int edat, int telefon, String departamentos) {
        this.Nom = Nom;
        this.edat = edat;
        this.telefon = telefon;
        this.departamentos = departamentos;
    }

    public void imprimeix() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.Nom);
            System.out.println(this.edat);
            System.out.println(this.telefon);
            System.out.println(this.departamentos);
        }

    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String departamentos) {
        this.departamentos = departamentos;
    }

}
