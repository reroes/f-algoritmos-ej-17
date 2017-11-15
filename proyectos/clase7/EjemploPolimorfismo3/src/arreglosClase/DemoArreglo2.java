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
public class DemoArreglo2 {
    public static void main(String[] args) {
        //vamos a crear los objetos
        Persona persona1 = new Persona("rené",30);
        Persona persona2 = new Persona("rolando",31);
        Persona persona3 = new Persona("josé",32);
        
        
        Persona[] paralelo = new Persona[3];
        paralelo[0] = persona1;
        paralelo[1] = persona2;
        paralelo[2] = persona3;
        
        for(int i = 0; i<paralelo.length; i++){
            //paralelo[i] es un objeto de tipo Persona
            System.out.println(paralelo[i].getEdad());
        }
        System.out.println("---------------------------");
        for(Persona p: paralelo){
            System.out.println(p.getEdad());
        }
        
        
        
    }
    
}
