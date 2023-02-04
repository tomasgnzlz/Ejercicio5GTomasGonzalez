/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteb;

import static java.lang.String.format;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
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
        Scanner teclado = new Scanner(System.in);

        //Creo un map. 
        Map<String, String> loteriaDAW = new HashMap<>();

        //Relleno el MAP con los numeros de la loteria con su premio correspondiente. 
        for (int i = 0; i < 10; i++) {

            String numeroLoteria = RandomStringUtils.randomNumeric(5);
            //Se generan premios aleatorios a cada numero
            String premioLoteria = RandomStringUtils.randomNumeric(1, 4);
            loteriaDAW.put(numeroLoteria, premioLoteria);
        }

        //Recorrer el Map para mostrar valores.
        for (Map.Entry<String, String> filaMap : loteriaDAW.entrySet()) {//entryset me devuelve un set(conjunto de filas desordenadas) de entradas, entradas que son unicas. 
            String key = filaMap.getKey();
            String value = filaMap.getValue();
            System.out.println("Nº loteria: " + key + " ··  Premio: " + value + "€");
        }

        //Se le asigna el premio dependiendo del numero que introduzca.
        System.out.println("Introduce tu nº de loteria para conocer tu premio.");
        String numero = teclado.nextLine();
        if (loteriaDAW.containsKey(numero)) {
            System.out.println("Tu premio es: " + loteriaDAW.get(numero));
        } else {
            System.out.println("Nº incorrecto");
        }
    }

}
