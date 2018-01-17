/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapotencia;

/**
 *
 * @author reroes
 */
public class Potencia {
    public double obtener_potencia(int numero, int exponente){
        if(exponente==1){
            return numero;
        }else{
            return numero * Math.pow(numero, exponente-1);
        }
    }
}
