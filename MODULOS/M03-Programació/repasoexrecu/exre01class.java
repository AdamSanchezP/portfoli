/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoexrecu;

public class exre01class {

    private String director;
    private String type;
    private String title;

    public exre01class() {
    }

    public exre01class(String director, String type, String title) {
        this.director = director;
        this.type = type;
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void imprimeix() {

        System.out.println(" Director: " + this.director);
        System.out.println(" Tipus: " + this.type);
        System.out.println(" Titol: " + this.title);

    }
}
