/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

/**
 *
 * @author tomas
 */
/*Método para guardar dos entradas, y recibirá:
        ·palabraExtranjera.
        ·palabraEspañol.
 */
public class Traductor {
    //Se declaran aquellos atributos que serán utiles par el ejercicioPropuesto.
    private String palabraExtranjera;
    private String palabraArgentina;
    
    //Constructor parametrizado. 
    public Traductor(String palabraExtranjera, String palabraArgentina) {
        this.palabraExtranjera = palabraExtranjera;
        this.palabraArgentina = palabraArgentina;
    }
    //Constructor vacío.
    public Traductor() {
        //Sin registros.
    }

    //Getters & Setters.
    public String getPalabraExtranjera() {
        return palabraExtranjera;
    }

    public void setPalabraExtranjera(String palabraExtranjera) {
        this.palabraExtranjera = palabraExtranjera;
    }

    public String getPalabraArgentina() {
        return palabraArgentina;
    }

    public void setPalabraArgentina(String palabraArgentina) {
        this.palabraArgentina = palabraArgentina;
    }

    //ToString. 
    @Override
    public String toString() {
        return "Traductor{" + "palabraExtranjera=" + palabraExtranjera + ", palabraArgentina=" + palabraArgentina + '}';
    }
    
    //-------------------------------------------------------------------------------------------------------------------------------------------------
    
    //Método para guardar entrada.
    public void guardarEntrada(String pExt, String pArg){
     
    }
    
    

}
