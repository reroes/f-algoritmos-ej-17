/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author reroes
 */
public abstract class Trabajador {
    protected String nombre;
    protected String apellido;
    
    public Trabajador(String n, String ap){
        nombre = n;
        apellido = ap;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setApellido(String n){
        apellido = n;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public abstract double sueldo_trabajador();
}
