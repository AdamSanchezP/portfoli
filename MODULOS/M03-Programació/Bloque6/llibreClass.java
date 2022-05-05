/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bloque6;

public class llibreClass {

    private String Llibre;
    private String ISBN;
    private String Autor;
    private String Editorial;
    private int Stock;
    private int Preu;

    public llibreClass() {
        this.Llibre = "";
        this.ISBN = "";
        this.Autor = "";
        this.Editorial = "";
        this.Stock = 0;
        this.Preu = 0;
    }

    public  llibreClass(String Llibre, String ISBN, String Autor, String Editorial, int Stock, int Preu) {
        this.setLlibre(Llibre);
        this.setISBN(ISBN);
        this.setAutor(Autor);
        this.setEditorial(Editorial);
        this.setStock(Stock);
        this.setPreu(Preu);
    }

    /**
     * @return the Llibre
     */
    public String getLlibre() {
        return Llibre;
    }

    /**
     * @param Llibre the Llibre to set
     */
    public void setLlibre(String Llibre) {
        this.Llibre = Llibre;
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the Autor
     */
    public String getAutor() {
        return Autor;
    }

    /**
     * @param Autor the Autor to set
     */
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    /**
     * @return the Editorial
     */
    public String getEditorial() {
        return Editorial;
    }

    /**
     * @param Editorial the Editorial to set
     */
    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    /**
     * @return the Stock
     */
    public int getStock() {
        return Stock;
    }

    /**
     * @param Stock the Stock to set
     */
    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    /**
     * @return the Preu
     */
    public int getPreu() {
        return Preu;
    }

    /**
     * @param Preu the Preu to set
     */
    public void setPreu(int Preu) {
        this.Preu = Preu;
    }

    public void imprimeix() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" El titol del llibre es: " + this.Llibre);
            System.out.println(" El codi ISBN es: " + this.ISBN);
            System.out.println(" L'autor del llibre es: " + this.Autor);
            System.out.println(" La editorial es: " + this.Editorial);
            System.out.println(" Tenim: " + this.Stock + " unitats del llibre ");
            System.out.println(" El preu es de: " + this.Preu + " € ");
        }
    }
}
