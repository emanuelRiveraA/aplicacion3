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
public class Aplicacion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personaje p = new Personaje();
        Rifle r0 = new Rifle();
        
        p.agregarArma(r0, 1);
        System.out.println(p.UsarArma(1).usar());
        System.out.println(p.UsarArma(1).usar());
        p.eliminarArma(1);
        
        Vehiculo v = new Vehiculo();
        v = null;//desctruye la clase vehiculo y motor
        
        System.out.println(Mensajes.GAME_OVER);
    }
    
}
