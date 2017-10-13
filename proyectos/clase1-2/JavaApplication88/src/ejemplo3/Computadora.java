/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3;

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
}
