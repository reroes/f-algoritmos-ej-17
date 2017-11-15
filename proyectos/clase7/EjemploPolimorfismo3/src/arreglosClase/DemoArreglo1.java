/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosClase;

/**
 *
 * @author reroes
 */
public class DemoArreglo1 {
    public static void main(String[] args) {
        int[] valores = new int[5]; // tamanio de mi arreglo es 5
        
        
        
        valores[0] = 100; //posicion 0
        valores[1] = 200; //posicion 1
        valores[2] = 300; //posicion 2
        valores[3] = 400; //posicion 3
        valores[4] = 500; //posicion 4
        
        
        
        for(int i=0; i<valores.length; i++){
            System.out.println(valores[i]);
        }
        
        
    }
}
