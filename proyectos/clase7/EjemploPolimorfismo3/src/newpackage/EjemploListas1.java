/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class EjemploListas1 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Un ArrayList solo de cadenas");
        ArrayList<String> cadenas = new ArrayList<String>();
        
        cadenas.add("René");
        cadenas.add("Elizalde");
        cadenas.add("Solano");
        
        //caso 1
        for(int i = 0; i<cadenas.size(); i++){
            System.out.println(cadenas.get(i));
        }
        
        //caso 2
        for(String cadena: cadenas){
            System.out.println(cadena);
        }
        
        System.out.println("Un ArrayList que tiene de todo");
        // Un array que le ponemos de todo
        ArrayList deTodo = new ArrayList();
        deTodo.add(1);
        deTodo.add("Rene");
        //caso 1
        for(int i = 0; i<deTodo.size(); i++){
            System.out.println(deTodo.get(i));
        }
        
        for (Object deTodo1 : deTodo) {
            System.out.println(deTodo1);
        }
        
        System.out.println("Un ArrayList solo de enteros");
        ArrayList<Integer> lista_enteros = new ArrayList<Integer>();
        
        lista_enteros.add(1);
        lista_enteros.add(2);
        lista_enteros.add(3);
        
        //caso 1
        for(int i = 0; i<lista_enteros.size(); i++){
            System.out.println(lista_enteros.get(i));
        }
        
        //caso 2
        for(Integer cadena:  lista_enteros){
            System.out.println(cadena);
        }
        
    }
}
