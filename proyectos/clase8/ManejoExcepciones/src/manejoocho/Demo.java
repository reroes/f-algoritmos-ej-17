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
public class Demo {

    public static void main(String args[]) {

        String v = "dos";
        try {
            int valor = Integer.parseInt(v);
            System.out.println(valor);
        } catch (NumberFormatException n) {
            System.err.println("Error en la data");
        }
    }
}
