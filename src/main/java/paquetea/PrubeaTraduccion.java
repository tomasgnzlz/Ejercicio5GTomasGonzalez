/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetea;

import java.util.ArrayList;


/**
 *
 * @author tomas
 */
public class PrubeaTraduccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creo el objeto para traducir,. 
        Traductor traduciones = new Traductor();

        //Meto palabras para traducir. 
        PalabraExtranjera ex1 = new PalabraExtranjera("Car");
        PalabraEspanola es1 = new PalabraEspanola("Coche");

        PalabraExtranjera ex2 = new PalabraExtranjera("White");
        PalabraEspanola es2 = new PalabraEspanola("Blanco");
        
        PalabraExtranjera ex3 = new PalabraExtranjera("Blue");
        PalabraEspanola es3 = new PalabraEspanola("Azul");
        
        PalabraExtranjera ex4 = new PalabraExtranjera("Five");
        PalabraEspanola es4 = new PalabraEspanola("Cinco");
        
        PalabraExtranjera ex5 = new PalabraExtranjera("Red");
        PalabraEspanola es5 = new PalabraEspanola("Rojo");
        
        PalabraExtranjera ex6 = new PalabraExtranjera("Pink");
        PalabraEspanola es6 = new PalabraEspanola("Rosa");

        PalabraExtranjera ex7 = new PalabraExtranjera("Yellow");
        PalabraEspanola es7 = new PalabraEspanola("Amarillo");
        
        PalabraExtranjera ex8 = new PalabraExtranjera("Constraint");
        PalabraEspanola es8 = new PalabraEspanola("Restricción");
        
        PalabraExtranjera ex9 = new PalabraExtranjera("Black");
        PalabraEspanola es9 = new PalabraEspanola("Negro");
        
        PalabraExtranjera ex10 = new PalabraExtranjera("One");
        PalabraEspanola es10 = new PalabraEspanola("Uno");
        
        traduciones.guardarEntrada(ex1.getPalabraExtanjera(), es1.getPalabraEs());
        traduciones.guardarEntrada(ex2.getPalabraExtanjera(), es2.getPalabraEs());
        traduciones.guardarEntrada(ex3.getPalabraExtanjera(), es3.getPalabraEs());
        traduciones.guardarEntrada(ex4.getPalabraExtanjera(), es4.getPalabraEs());
        traduciones.guardarEntrada(ex5.getPalabraExtanjera(), es5.getPalabraEs());
        traduciones.guardarEntrada(ex6.getPalabraExtanjera(), es6.getPalabraEs());
        traduciones.guardarEntrada(ex7.getPalabraExtanjera(), es7.getPalabraEs());
        traduciones.guardarEntrada(ex8.getPalabraExtanjera(), es8.getPalabraEs());
        traduciones.guardarEntrada(ex9.getPalabraExtanjera(), es9.getPalabraEs());
        traduciones.guardarEntrada(ex10.getPalabraExtanjera(), es10.getPalabraEs());
        
        
        //Muestro las traducciones de las palabras introducidas.
        traduciones.mostrarPalaras();
        
        System.out.println("\n");
        System.out.println("        LISTA PALABRAS EXTRANJERAS");
        ArrayList<String> extranjeras = traduciones.sacarPalabrasExtranjeras();
        extranjeras.forEach(System.out::println);
        System.out.println("        LISTA PALABRAS EN ESPAÑOL");
        ArrayList<String> españolas = traduciones.sacarPalabrasEspanolas();
        españolas.forEach(System.out::println);
        
        System.out.println("\n");
        //Prubeba del método para borrar palabras. 
        traduciones.borrarPalabraExtranjera("Car");
        System.out.println("        Lista Palabras tras borrar Car/Coche");
        traduciones.mostrarPalaras();
        System.out.println("\n");
        
        //Pruerba del método para modificar palabras
        traduciones.modificarPalabras("White", "GreyWhite");
        System.out.println("        Lista Palabras cambiar 'White' por 'GreyWhite'.");
        traduciones.mostrarPalaras();
        System.out.println("\n");
        
        
        
        

    }

}
