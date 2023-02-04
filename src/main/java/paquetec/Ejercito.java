/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

import java.util.Objects;

/**
 *
 * @author tomasvrrsv
 */
public class Ejercito {
    //Declaramos un nombre para que cada ejercito tenga uno y entonces poder
    //llamarlos individualmente o el conjunto de ellos.
    private String nombreEjercito;

    //Constructor predeterminado. 
    public Ejercito(String nombreEjercito) {
        this.nombreEjercito = nombreEjercito;
    }
    //Getters & Setters. 
    public String getNombreEjercito() {
        return nombreEjercito;
    }

    public void setNombreEjercito(String nombreEjercito) {
        this.nombreEjercito = nombreEjercito;
    }

    //ToString. 
    @Override
    public String toString() {
        return "Ejercito{" + "nombreEjercito=" + nombreEjercito + '}';
    }
    
    //Equals + HashCode.
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nombreEjercito);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ejercito other = (Ejercito) obj;
        return Objects.equals(this.nombreEjercito, other.nombreEjercito);
    }
}
