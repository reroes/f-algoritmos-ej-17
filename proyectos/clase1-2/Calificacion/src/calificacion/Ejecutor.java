/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacion;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calificacion c = new Calificacion();
        Calificacion c2 = new Calificacion();
        Calificacion c3 = new Calificacion();
        
        c.agregar_valor(20);
        c2.agregar_valor(15);
        c3.agregar_valor(18.5);
        
        double suma = c.obtener_valor() + c2.obtener_valor() + c3.obtener_valor();
        
    }
}
