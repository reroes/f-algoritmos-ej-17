package busquedaBinaria;


import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reroes
 * tomado de "Cómo programar en Java, 7a edición"
 */
public class ArregloUno {
   private int[] datos;
    

    // 
    public ArregloUno(int [] valores) {
        datos = valores;
        
    } // fin del constructor 

    // realiza una búsqueda binaria en los datos
    public int busquedaBinaria(int elementoBusqueda) {
         // devuelve la ubicación de la clave de búsqueda binaria
         Arrays.sort(datos);
         // implementar proceso de búsqueda binaria.
         return 0;
    } // fin del método busquedaBinaria

    // realiza una búsqueda lineal en los datos
    public int busquedaLineal(int elementoBusqueda) {
         // devuelve la ubicación de la clave de búsqueda binaria
         // implementar proceso de búsqueda líneal.
         return 0;
    } // fin del método busquedaBinaria
    
} // fin de la clase 

