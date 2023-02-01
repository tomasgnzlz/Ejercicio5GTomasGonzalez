/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import java.util.Objects;

/**
 *
 * @author tomas
 */
public class PalabraExtranjera  implements Comparable<PalabraExtranjera>{

    private String palabraExtanjera;

    //Constructor predeterminado.
    public PalabraExtranjera(String palabraExtanjera) {
        this.palabraExtanjera = palabraExtanjera;
    }

    //Getter & Setter.
    public String getPalabraExtanjera() {
        return palabraExtanjera;
    }

    public void setPalabraExtanjera(String palabraExtanjera) {
        this.palabraExtanjera = palabraExtanjera;
    }

    //ToString.
    @Override
    public String toString() {
        return "PalabraExtranjera{" + "palabraExtanjera=" + palabraExtanjera + '}';
    }

    //Equals & HashCode.
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.palabraExtanjera);
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
        final PalabraExtranjera other = (PalabraExtranjera) obj;
        return Objects.equals(this.palabraExtanjera, other.palabraExtanjera);
    }

    @Override
    public int compareTo(PalabraExtranjera o) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.palabraExtanjera.compareToIgnoreCase(o.getPalabraExtanjera());
    }
    
}
