/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion3;

/**
 *
 * @author Idalia
 */
public class Rifle extends Arma{
    
    private long numBalas;//tipo de dato entero pero de mayor capacidad

    public Rifle() {
        this.numBalas = 10;
    }

    public long getNumBalas() {
        return numBalas;
    }

    public void setNumBalas(long numBalas) {
        this.numBalas = numBalas;
    }
    
    @Override
    public String usar(){
        numBalas--;
        return Mensajes.DISPARO + " Te quedan "+ numBalas+" balas";
    }
    
    
}
