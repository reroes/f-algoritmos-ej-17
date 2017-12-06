/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejobuffer2;

import java.util.Scanner;

/**
 *
 * @author reroes
 * referencia:
 * https://blogdelingeniero1.wordpress.com/2014/06/08/limpiar-el-buffer-de-entrada-en-java/
 */
public class Demo {

    public static void main(String args[]) {
        String nombre;
        int edad;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese su nombre");
        nombre = entrada.nextLine();
        
        
        // muestra los datos
        System.out.printf("Su nombre es %s", nombre);
        System.out.printf("Su edad es %d", edad);
    }

}
