/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Trabajador t = new TrabajadorFijo("René", "Elizalde");
        Trabajador t2 = new TrabajadorporHoras("Rolando", "Elizalde");
    
        ArrayList <Trabajador> lista = new ArrayList<Trabajador>();
        lista.add(t);
        lista.add(t2);
        
    }
}
