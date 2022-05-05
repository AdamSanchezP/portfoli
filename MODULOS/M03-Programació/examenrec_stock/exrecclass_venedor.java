/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenrec_sanchezadam;

public class exrecclass_venedor {
    private String DNI;
    private String nom;
    
    public exrecclass_venedor() {
    }

    public exrecclass_venedor(String DNI, String nom) {
        this.DNI = DNI;
        this.nom = nom;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}
