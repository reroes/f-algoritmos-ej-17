/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;

/**
 *
 * @author reroes
 */
public class Calificaciones4 {
    private String nombreCurso;
    
    public Calificaciones4(String n){
        nombreCurso = n;
    }
    
    public void establecerNombreCurso(String nombre){
        nombreCurso = nombre;
    }
    
    public String obtenerNombreCurso(){
        return nombreCurso;
    }
    
    public void mostrarMensaje(){
        System.out.printf("El nombre del curso es %s", obtenerNombreCurso());
    }
}
