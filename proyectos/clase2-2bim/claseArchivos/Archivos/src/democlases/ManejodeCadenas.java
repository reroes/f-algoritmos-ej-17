/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democlases;

/**
 *
 * @author reroes
 */
public class ManejodeCadenas {
    public static void main(String[] args) {
        String cadena = "es una cadena, que contiene, una coma";
        String arreglo_cadena[] = cadena.split(",");
        
        for(int i = 0; i<arreglo_cadena.length; i++){
            System.out.println(arreglo_cadena[i]);
        }
        
        
        
    }
}
