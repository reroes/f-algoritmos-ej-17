/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soloarreglos;

/**
 *
 * @author reroes
 * En Java, los Array pueden ser de cualquier tipo de dato, incluidos objetos
 */
public class EjemploArreglos2 {
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] fila = new int[100]; ejemplo de enteros
        Pais mipais = new Pais("Ecuador", "Quito", 12000001.0, "Cálido");
        Pais tupais = new Pais("Perú", "Lima", 14000001.0, "Frío");
        Pais elpais = new Pais("España", "Madrid", 34000001.0, "Variado");
        
        System.out.println("Un Arreglo solo de paises");
        
        
        
        Pais cadenas[] = new Pais[3];
        cadenas[0] = mipais;
        cadenas[1] = tupais;
        cadenas[2] = elpais;
        
        //caso 1
        for(int i = 0; i<cadenas.length; i++){
            System.out.println(cadenas[i]);
            System.out.println(cadenas[i].getCapital());
            
        }
        
        //caso 2
        for(Pais cadena: cadenas){
            System.out.println(cadena);
            System.out.println(cadena.getCapital());
        }
        
        
        
    }
}
