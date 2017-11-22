/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocinco;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String args[]) {
        boolean bandera = true;
        while (bandera) {
            Scanner scan = new Scanner(System.in);

            try {
                System.out.println("Ingrese un valor númerico - 1");
                int valor1 = scan.nextInt();
                System.out.println("Ingrese un valor númerico - 2");
                int valor2 = scan.nextInt();
                System.out.println("----- resultados -----");
                Operaciones op = new Operaciones(valor1, valor2);
                System.out.println(op.get_suma());
                System.out.println(op.get_division());
                bandera = false;
            } catch (Exception e) {
                scan.nextLine(); // descarta entrada para que el usuario intente otra vez
                System.err.println(e);
                System.out.println("error, ejecute nuevamente");
            }
        }
    }
}
