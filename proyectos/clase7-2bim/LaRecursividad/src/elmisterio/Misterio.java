/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elmisterio;

/**
 *
 * @author reroes
 */
public class Misterio {

    public int misterio(int a, int b) {
        if (b == 1) {
            return a;
        } else {
            return a + misterio(a, b - 1);
        }

    } // fin del método misterio
}
