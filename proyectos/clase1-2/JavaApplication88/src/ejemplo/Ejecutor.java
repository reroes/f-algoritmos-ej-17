/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    //
    public static void main(String[] args) {
        Computadora c = new Computadora();
        System.out.println(c.velocidad_procesador);
        c.velocidad_procesador = 2.0;
        System.out.println(c.velocidad_procesador);
    }
}
