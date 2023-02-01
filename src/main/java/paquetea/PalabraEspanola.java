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
public class PalabraEspanola {

    private String palabraEspanola;

    //Constructor predeterminado.
    public PalabraEspanola(String palabraEspanola) {
        this.palabraEspanola = palabraEspanola;
    }

    //Getter & Setter.
    public String getPalabraEs() {
        return palabraEspanola;
    }

    public void setPalabraEs(String palabraEspanola) {
        this.palabraEspanola = palabraEspanola;
    }

    //ToString. 
    @Override
    public String toString() {
        return "PalabraEspanola{" + "palabraEspanola=" + palabraEspanola + '}';
    }

    //Equals & HashCode. 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.palabraEspanola);
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
        final PalabraEspanola other = (PalabraEspanola) obj;
        return Objects.equals(this.palabraEspanola, other.palabraEspanola);
    }
}
