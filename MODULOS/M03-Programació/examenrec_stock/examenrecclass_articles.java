/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenrec_sanchezadam;

public class examenrecclass_articles {
private int id;
private String nom;
private int preu;

    public examenrecclass_articles() {
    }

    public examenrecclass_articles(int id, String nom, int preu) {
        this.id = id;
        this.nom = nom;
        this.preu = preu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }


}
