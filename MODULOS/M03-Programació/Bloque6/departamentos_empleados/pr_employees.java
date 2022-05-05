package Bloque6.departamentos_empleados;

import java.util.Scanner;

public class pr_employees {

    private String nom;
    private int edat;
    private String telefon;
    private String departament;

    public pr_employees() {
    }

    public pr_employees(String nom, int edat, String telefon, String departament) {
        this.nom = nom;
        this.edat = edat;
        this.telefon = telefon;
        this.departament = departament;
    }

    public void telefonClass(String telefon) {

        telefon = telefon.replaceAll("-", "");
        telefon = telefon.replaceAll(" ", "");
        telefon = telefon.replaceAll(".", "");
        if (telefon.length() != 9) {
            System.out.println("telefon invalid");
        } else {
            System.out.println("telefon valid");
            this.telefon=telefon;

        }
        System.out.println(telefon);

    }

   

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "pr_employees{" + "nom=" + nom + ", edat=" + edat + ", telefon=" + telefon + ", departament=" + departament + '}';
    }

}
