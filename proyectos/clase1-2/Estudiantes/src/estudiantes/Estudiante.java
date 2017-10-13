/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

/**
 *
 * @author reroes
 */
public class Estudiante {

    /**
     * @param args the command line arguments
     * nombre: String
     * apellido: String
     * universidad: Universidad
     */
    
    private String nombre;
    private String apellido;
    private Universidad universidad;

    public Universidad obtener_universidad(){
        return universidad;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public String obtener_apellido(){
        return apellido;
    }
    
    public void agregar_universidad(Universidad u){
        universidad = u;
    }
    
    public void agregar_nombre(String n){
        nombre = n;
    }
    
    public void agregar_apellido(String a){
        apellido = a;
    }
    
    public void mostrar_estudiante(){
        System.out.printf("Nombre: %s | Apellido: %s | Universidad %s", obtener_nombre(),
                obtener_apellido(), obtener_universidad());
    }
    
    
    
}
