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
public class Universidad {
    private String nombre;
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public void agregar_nombre(String n){
        nombre = n;
    }
}
