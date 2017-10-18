/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion;


/**
 *
 * @author reroes
 */
public class Titulo {
    private String nombre;
    private String nombre_universidad;
    
    public Titulo(String n, String nom_universidad){
        nombre = n;
        nombre_universidad = nom_universidad;
    }
    public void establecer_nombre(String n){
        nombre = n;
    }
    
    public void establecer_nombre_universidad(String n){
        nombre_universidad = n;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public String obtener_nombre_universidad(){
        return nombre_universidad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s - %s", obtener_nombre(),
                obtener_nombre_universidad());
        return cadena;
    }
}
