/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion2;


/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args) {
        // Se crean las asignaturas
        Asignatura a1 = new Asignatura("Matemática", 8);
        Asignatura a2 = new Asignatura("Física", 6);
        
        // Se crean los títulos
        Titulo t1 = new Titulo("Licenciado en Físico Matemáticas", "Universidad Politécnica");
        Titulo t2 = new Titulo("Magister en Docencia Matemática", "Universidad Valenciana");
                
        Docente docente = new Docente("Luis V", "Perez J", t1, t2, a1, a2);
        System.out.println(docente);
        
        
    }
}
