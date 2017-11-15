/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class EjemplosListas2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Pais mipais = new Pais("Ecuador", "Quito", 12000001.0, "Cálido");
        Pais tupais = new Pais("Perú", "Lima", 14000001.0, "Frío");
        Pais elpais = new Pais("España", "Madrid", 34000001.0, "Variado");

        System.out.println("Un ArrayList solo de Paises");
        ArrayList<Pais> paises = new ArrayList<Pais>();

        paises.add(mipais);
        paises.add(tupais);
        paises.add(elpais);

        //caso 1
        for (int i = 0; i < paises.size(); i++) {
            System.out.println(paises.get(i));
            System.out.println(paises.get(i).getNombre());
            System.out.println(paises.get(i).getCapital());
        }

        //caso 2
        for (Pais cadena : paises) {
            System.out.println(cadena);
            System.out.println(cadena.getNombre());
            System.out.println(cadena.getCapital());
        }

    }
}
