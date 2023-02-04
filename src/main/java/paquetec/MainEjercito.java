/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**fhfu
 *
 * @author tomas
 */
public class MainEjercito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo el ejercito. 
        Map<Integer, Ejercito> ejercito = new HashMap<>();
        
        //Creo diferentes ejercitos, asignandole un número diferente a cada uno. 
        ejercito.put(1, new Ejercito("Primero"));
        ejercito.put(2, new Ejercito("Segundo"));
        ejercito.put(3, new Ejercito("Tercero"));
        
        
        //Una vez he creado diferentes ejercitos los muestro. 
        for (Map.Entry<Integer, Ejercito> entry : ejercito.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            
            System.out.println("ID Ejercito: " + key + " || " + "Nombre Ejercito: " + value);
        }
        
        System.out.println("            IDENTIFICADORES UNICOS DE CADA EJERCITO");
        
        for (Integer id  : ejercito.keySet()) {
            System.out.print(id + " ");
        }
        System.out.println("\n");
        
        System.out.println("            NOMBRES DE LOS EJERCITOS                ");
        List<Ejercito> nombres = new ArrayList<>(ejercito.values());//SI NO PONGO EL VALUE ME ENSEÑA UNA LISTA EN BLANCO. 
        for (Ejercito value : nombres) {
            System.out.println(value);
        }
        
        
    }
    
}
