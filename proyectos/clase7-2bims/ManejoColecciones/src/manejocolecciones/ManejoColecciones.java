/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocolecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author reroes
 * referencia: https://jarroba.com/ordenar-un-arraylist-en-java/
 */
public class ManejoColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Estudiante> lista = new ArrayList<>();

        lista.add(new Estudiante("Marco", "Zamora", 30, 100.2));
        lista.add(new Estudiante("Andrea", "Valladares", 25, 200.2));
        lista.add(new Estudiante("Luis", "Alcivar", 15, 30.2));
        
        System.out.println("Ingrese opicón: 1) Ascendente por nombre. 2) Descendente por apellido. 3) ascendente por edad");
        Scanner entrada = new Scanner(System.in);
        int tipo = entrada.nextInt();

        if (tipo == 1) {
            System.out.println("Ordenar por los nombres ascendente");
            Collections.sort(lista, new ComparaEstudiante());

        } else {
            if (tipo == 2) {
                System.out.println("Ordenar por los apellidos descendente");
                Collections.sort(lista, new ComparaEstudiante2());

            } else {
                if (tipo == 3) {
                    System.out.println("Ordenar por la edad ascendente");
                    Collections.sort(lista, new ComparaEstudiante3());
                } else {
                    System.err.println("Ninguna opción válida");
                    System.out.println("Se imprime lista por defecto");
                }
            }
        }

        for (Estudiante e : lista) {
            System.out.println(e);
        }

    }

}
