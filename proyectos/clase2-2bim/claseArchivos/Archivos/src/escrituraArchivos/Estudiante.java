/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escrituraArchivos;

/**
 *
 * @author reroes
 */
public class Estudiante {
    String nombre;
    int edad;
    
    public Estudiante(String n, int e){
        nombre = n;
        edad = e;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerEdad(){
        return edad;
    }
}
