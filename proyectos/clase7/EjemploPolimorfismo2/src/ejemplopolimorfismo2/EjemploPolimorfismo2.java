/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo2;

/**
 *
 * @author reroes
 */
public class EjemploPolimorfismo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadosAsalariado ea = new EmpleadosAsalariado("rené", "elizalde", "1234", 100.1);
        EmpleadoPorHoras eh = new EmpleadoPorHoras("rolando", "solano", "0987", 20.2, 8);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Sue", "Jones", "333-33-3333", 10000, .06);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

        System.out.printf("%s \n %,.2f \n", ea, ea.ingresos());
        System.out.printf("%s \n %,.2f \n", eh, eh.ingresos());
        System.out.printf("%s \n %,.2f \n", empleadoPorComision, empleadoPorComision.ingresos());
        System.out.printf("%s \n %,.2f \n", empleadoBaseMasComision, empleadoBaseMasComision.ingresos());

        Empleado empleados[] = new Empleado[4];

        empleados[0] = ea;
        empleados[1] = eh;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;

        System.out.println("\n\nProcesando en forma polimorfica\n");

        for (Empleado empleado_actual : empleados) {
            System.out.printf("ingresos $%,.2f\n\n", empleado_actual.ingresos());
        }

        // obtiene el nombre del tipo de cada objeto en el arreglo de empleados
        for (int j = 0; j < empleados.length; j++) {
            System.out.printf("El empleado %d es un %s\n", j, empleados[j].getClass().getName());

        }
    }

    }
