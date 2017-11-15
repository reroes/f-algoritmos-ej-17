/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soloarreglos;

/**
 *
 * @author reroes
 */
public class EjemploArreglos1 {
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] fila = new int[100]; ejemplo de enteros
        
        System.out.println("Un Arreglo solo de cadenas");
        
        String cadenas[] = new String[3];
        
        cadenas[0] = "René";
        cadenas[1] = "Elizalde";
        cadenas[2] = "Solano";
        
        //caso 1
        for(int i = 0; i<cadenas.length; i++){
            System.out.println(cadenas[i]);
        }
        
        //caso 2
        for(String cadena: cadenas){
            System.out.println(cadena);
        }
        
        
        
    }
}
