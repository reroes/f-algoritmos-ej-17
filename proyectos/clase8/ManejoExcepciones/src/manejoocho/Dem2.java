/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoocho;

/**
 *
 * @author reroes
 */
public class Dem2 {

    public static void main(String args[]) {

        try {
            int[] lista = new int[4];

            lista[4] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
            System.err.println("Error en manejo de data del arreglo");
        }
    }
}
