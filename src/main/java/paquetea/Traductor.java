/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author tomas
 */
/*Método para guardar dos entradas, y recibirá:
        ·palabraExtranjera.
        ·palabraEspañol.
 */
public class Traductor {

    private SortedMap<String, String> palabrastraducir;

//    public Traductor(SortedMap<String, String> palabrastraducir) {
//        this.palabrastraducir = palabrastraducir;
//    
//    }
//
    //Constructor.
    public Traductor() {
        this.palabrastraducir = new TreeMap<>();
    }

    //Getter & Setter.
    public SortedMap<String, String> getPalabrastraducir() {
        return palabrastraducir;
    }

    public void setPalabrastraducir(SortedMap<String, String> palabrastraducir) {
        this.palabrastraducir = palabrastraducir;
    }

    //ToString. 
    @Override
    public String toString() {
        return "Traductor{" + "palabrastraducir=" + palabrastraducir + '}';
    }

    //Método guardar entrada
    public void guardarEntrada(String palabraExtranjera, String palabraEspanola) {
        palabrastraducir.put(palabraExtranjera, palabraEspanola);
    }

    //Método para borrar palabra que se busca traducir.
    public void borrarPalabraExtranjera(String palabraExtranjera) {
        this.palabrastraducir.remove(palabraExtranjera);
    }

    //Método para modificar palabras.
    public void modificarPalabras(String palabraExtranjera, String palabraIncorpora) {
        palabrastraducir.remove(palabraExtranjera);
        palabrastraducir.put(palabraExtranjera, palabraIncorpora);
    }

    //Método para mostrar palabras
    public void mostrarPalaras() {

        for (String key : palabrastraducir.keySet()) {
            System.out.printf("%s =  %s %n", key, palabrastraducir.get(key));
        }
    }

    public String traducir(String palabraExtranjera) {
        return palabrastraducir.get(palabraExtranjera);
    }

    //Método para sacar palabrasExtranjeras.
    public ArrayList<String> sacarPalabrasExtranjeras() {

        ArrayList<String> extranjera = new ArrayList<>();

        for (String palabra : palabrastraducir.keySet()) {
            extranjera.add(palabra);
        }

        return extranjera;
    }

    //Método para sacar palabrasEspanolas.
    public ArrayList<String> sacarPalabrasEspanolas() {

        ArrayList<String> espanolas = new ArrayList<>();
        for (String palabra : palabrastraducir.keySet()) {
            espanolas.add(palabrastraducir.get(palabra));
        }
        return espanolas;
    }

}
