/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejorelaciones;

/**
 *
 * @author reroes
 */
public class DemoEjecutor {
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
        
        Matricula matriculas[] = new Matricula[3];
        matriculas[0] = m;
        matriculas[1] = m2;
        
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("rene");
        estudiante.setMatriculas(matriculas);
        
        System.out.println(estudiante.getMatriculas()[0].getModulo());
    }
}
