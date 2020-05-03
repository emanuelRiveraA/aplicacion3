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
public class Personaje {
    
    private String nombre;
    private double posX;
    private double posY;
    private  double posZ;
    private Arma[] armamento;//los arreglos son objetos

    //Inicia elestado del objeto
    public Personaje() {
        
        this.nombre = "Thanos";//this es pauntar al mismo objeto
        this.posX = 0;
        this.posY = 0;
        this.posZ = 0;
        
        //se instancia el arreglo
        this.armamento = new Arma[6];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public double getPosZ() {
        return posZ;
    }

    public void setPosZ(double posZ) {
        this.posZ = posZ;
    }
    
    //se agrega un arma a la conexion
    public void agregarArma(Arma a, int i){
        this.armamento[i] = a;
    }
    
    public void eliminarArma(int i){
        this.armamento[i] = null;
    }
    
    public Arma UsarArma(int i){
        return armamento[i];
    }
    
    
}
