/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetea;

/**
 *
 * @author tomas
 */
public class PrubeaTraduccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo el Traductor
        Traductor traductor = new Traductor();
        //Creo aquellas palabras que se buscan traducir
        traductor.guardarEntrada("Car", "Coche");
        traductor.guardarEntrada("Boy", "Chico");
        traductor.guardarEntrada("Girl", "Chica");
        traductor.mostrarPalaras();
        
        
        
        
        
        
    }
    
}
