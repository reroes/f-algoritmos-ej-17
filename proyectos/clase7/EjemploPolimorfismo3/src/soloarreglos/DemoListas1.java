/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soloarreglos;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class DemoListas1 {
    public static void main(String[] args) {
        
        Pais mipais = new Pais("Ecuador", "Quito", 12000001.0, "Cálido");
        Pais tupais = new Pais("Perú", "Lima", 14000001.0, "Frío");
        Pais elpais = new Pais("España", "Madrid", 34000001.0, "Variado");
        
        ArrayList<Pais> paises = new ArrayList<Pais>();
        
        //Pais[] paises1 = new Pais[3];
        //paises1[0] = mipais;
        
        paises.add(mipais);
        paises.add(tupais);
        paises.add(elpais);
        
        for(int i = 0; i < paises.size(); i++){
            //System.out.println(paises[i].getCapital());
            System.out.println(paises.get(i).getCapital());
        }
        
        /**
        for(Pais p: paises){
            System.out.println(p.getCapital());
        }
        **/
        
        
        
        
        
        
        
        
        
        
    }
        
        
    
    
}
