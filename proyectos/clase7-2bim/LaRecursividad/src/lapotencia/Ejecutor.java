package lapotencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String args[]) {
        Potencia m = new Potencia();
        for (int i = 1; i <= 4; i++) {
            System.out.printf("a=%d | b=%d | %f \n", i, 2, m.obtener_potencia(i, 2));
        }

    }
}
