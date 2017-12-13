/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejorelaciones;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author reroes
 */
public class DemoEjecutor2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Matricula m = new Matricula();
        m.setId(1);
        m.setModulo("uno");
        m.setValor(10.2);
        
        Matricula m2 = new Matricula();
        m.setId(2);
        m.setModulo("dos");
        m.setValor(11.0);
        
        ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
        matriculas.add(m);
        matriculas.add(m2);
        
        Estudiante2 estudiante = new Estudiante2();
        estudiante.setNombre("rene");
        estudiante.setMatriculas(matriculas);
        
        System.out.println(estudiante.getMatriculas().get(0).getModulo());
    }
}
