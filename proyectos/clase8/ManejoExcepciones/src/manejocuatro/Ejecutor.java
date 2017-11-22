/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocuatro;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String args[]) {

        boolean band = true;
        while (band == true) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Ingrese un valor númerico - 1");
                String valor1 = scan.next();
                System.out.println("Ingrese un valor númerico - 2");
                String valor2 = scan.next();
                System.out.println("----- resultados -----");
                Operaciones op = new Operaciones(Integer.parseInt(valor1), Integer.parseInt(valor2));
                
                System.out.println(op.get_suma());
                System.out.println(op.get_division());
                band = false;
            } catch (Exception e) {
                // System.err.println(e);
                System.out.println("error, ejecute nuevamente");
            }
        }
    }
}
