/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoficheros;

import java.util.Scanner;

/**
 *
 * @author reroes
 **/
public class PruebaDemostracionFile {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        DemostracionFile aplicacion = new DemostracionFile();
        System.out.println("Escriba nombre de archivo o directorio\n\t  :");
        aplicacion.analizarRuta(entrada.nextLine());
    }
}
