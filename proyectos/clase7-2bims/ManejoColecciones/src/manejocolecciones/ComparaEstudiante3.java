/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocolecciones;
import java.util.Comparator;

/**
 *
 * @author reroes
 */
public class ComparaEstudiante3 implements Comparator<Estudiante>{
    
    @Override
    public int compare(Estudiante e1, Estudiante e2){
        //
        int n1 = e1.getEdad();
        int n2 = e2.getEdad();
        System.out.println(new Integer(n1).compareTo(new Integer(n2)));
        // ascendente
        // return new Integer(n1).compareTo(new Integer(n2));
        
        // descendente
        return new Integer(n2).compareTo(new Integer(n1));
    }
}


