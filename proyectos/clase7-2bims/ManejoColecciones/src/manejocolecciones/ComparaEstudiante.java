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
public class ComparaEstudiante implements Comparator<Estudiante>{
    @Override
    public int compare(Estudiante e1, Estudiante e2){
        //
        String n1 = e1.getNombre();
        String n2 = e2.getNombre();
        // ascendente
        return n1.compareTo(n2);
    }
}


