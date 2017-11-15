/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

/**
 *
 * @author reroes
 */
public class EjemploPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado1 = new EmpleadoComisionado();
        empleado1.setNombre("René");
        
        Empleado empleado2 = new EmpleadoNoComisionado();
        empleado2.setNombre("Rolando");
        
        System.out.println(empleado1.obtener_salario_final());
        System.out.println(empleado2.obtener_salario_final());
        
    }
    
}
