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
public class Calificaciones3 {
    private double valor;
    
    public void establecerValor(double v){
        valor = v;
    }
    
    public double obtenerValor(){
        return valor;
    }
    
    public void mostrarMensaje(){
        System.out.printf("El valor del curso es %s", obtenerValor());
    }
}
