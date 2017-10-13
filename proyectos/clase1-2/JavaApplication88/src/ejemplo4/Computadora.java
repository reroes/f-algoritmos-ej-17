/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo4;

/**
 *
 * @author reroes
 */
public class Computadora {
    private double velocidad_procesador; // variable global
    
    public void agregar_velocidad_procesador(double velocidad){
        velocidad_procesador = velocidad;
    }
    
    public double obtener_velocidad_procesador(){
        return velocidad_procesador;
    }
    
    public String toString(){
        String cadena = String.format("La computadora tiene una velocidad de "
                + "%.2f", obtener_velocidad_procesador());
        return cadena;
    }
}
