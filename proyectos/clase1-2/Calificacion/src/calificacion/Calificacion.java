/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacion;

/**
 *
 * @author reroes
 */
public class Calificacion {

    private String nombre_asignatura;
    private double valor;
    
    /*
        obtener_nombre_asignatura
		agregar_nombre_asignatura
		obtener_valor
		agregar_valor
    */
    public String obtener_nombre_asignatura(){
        return nombre_asignatura;
    }
    
    public void agregar_nombre_asignatura(String nombre){
        nombre_asignatura = nombre;
    }
    
    
    public double obtener_valor(){
        return valor;
    }
    
    public void agregar_valor(double v){
        valor = v;
    }
    
    
}
