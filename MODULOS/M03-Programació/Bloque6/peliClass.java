package Bloque6;

import java.util.Scanner;

public class peliClass {

    private String Peli;
    private String Tipus;
    private String Director;

    public peliClass() {

        this.Peli="";
        this.Tipus="";
        this.Tipus="";
        
    }
    public peliClass(String Pelicula, String Genere, String Directorr){
        this.Peli=Pelicula;
        this.Tipus=Genere;
        this.Director=Directorr;
    }

    /**
     * @return the Peli
     */
    public String getPeli() {
        return Peli;
    }

    /**
     * @param Peli the Peli to set
     */
    public void setPeli(String Peli) {
        this.Peli = Peli;
    }

    /**
     * @return the Tipus
     */
    public String getTipus() {
        return Tipus;
    }

    /**
     * @param Tipus the Tipus to set
     */
    public void setTipus(String Tipus) {
        this.Tipus = Tipus;
    }

    /**
     * @return the Director
     */
    public String getDirector() {
        return Director;
    }

    /**
     * @param Director the Director to set
     */
    public void setDirector(String Director) {
        this.Director = Director;
    }
    
    public void imprimeix(){
        for (int i = 0; i < 3; i++) {
        System.out.println(" La peli es: " + this.Peli);
        System.out.println(" El genere de la peli es: " + this.Tipus);
        System.out.println(" El director es: " + Director);
        }
        
    }
}
