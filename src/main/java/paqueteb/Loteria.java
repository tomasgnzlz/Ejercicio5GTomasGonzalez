/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteb;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author tomas
 */
public class Loteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo un map y le meto valores del 00000 hasta el 99999. 
        Map<String, String> numerosLoteria = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String numero = RandomStringUtils.randomNumeric(5);
            
            String premio = RandomStringUtils.randomNumeric(1,4);
            
            numerosLoteria.put(numero, premio);
        }
        
        
        //Recorrer el Map para mostrar valores.
        for (Map.Entry<String, String> filaMap : numerosLoteria.entrySet()) {//entryset me devuelve un set(conjunto de filas desordenadas) de entradas, entradas que son unicas. 
            String key = filaMap.getKey();
            String value = filaMap.getValue();

            System.out.println("Nº loteria: " + key + " ··  Premio: " + value + "€");
        }
        
        
        
        //Relleno los map tanto con un número como con el premio que le correesponda. 
       
    }
}
