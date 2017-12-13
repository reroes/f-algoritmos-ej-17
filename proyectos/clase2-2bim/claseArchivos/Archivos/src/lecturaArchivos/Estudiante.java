/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos;

/**
 *
 * @author reroes
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    
    public Estudiante(String n, String a, int e){
        nombre = n;
        apellido = a;
        edad = e;
    }
    
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public int obtenerEdad(){
        return edad;
    }
}
