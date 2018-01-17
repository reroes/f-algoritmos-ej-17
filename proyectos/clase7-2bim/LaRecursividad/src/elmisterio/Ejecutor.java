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
public class Ejecutor {

    public static void main(String args[]) {
        Misterio m = new Misterio();
        for(int i = 0;i<=4; i++){
            System.out.printf("a=%d | b=%d | %d \n",i, i+5, m.misterio(i, i+5));
        }
        
    }
}
