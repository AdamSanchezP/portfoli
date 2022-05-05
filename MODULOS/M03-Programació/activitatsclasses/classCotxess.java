/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitatsclasses;

public class classCotxess{

    private String marca;
    private String model;
    private int potencia;
    private boolean electric;
    
    public classCotxess(){
    this.marca=" ";
    this.model=" ";
    this.potencia=0;
    this.electric=false;
    
}
    public classCotxess(String marca, String model, int potencia, boolean electric){

       this.marca=marca;
       this.model=model;
       this.potencia=potencia;
       this.electric=electric;

   

}

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the electric
     */
    public boolean isElectric() {
        return electric;
    }

    /**
     * @param electric the electric to set
     */
    public void setElectric(boolean electric) {
        this.electric = electric;
    }



}

