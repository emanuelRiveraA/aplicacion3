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
public class Vehiculo {
    
    private Motor m;
    private long distancia;
    private Personaje p;

    public Vehiculo() {
        
        //contructor de otra clase dentro de un constructor es compocicion
        this.m = new Motor();
    }
        
    //se henera una asosciacion
    public void subirMonito(Personaje p){
        this.p = p;
        
    }

    public void bajarMonito(){
        this.p = null;
    }
    
    public Motor getM() {
        return m;
    }

    public void setM(Motor m) {
        this.m = m;
    }

    public long getDistancia() {
        return distancia;
    }

    public void setDistancia(long distancia) {
        this.distancia = distancia;
    }
    
    
}
