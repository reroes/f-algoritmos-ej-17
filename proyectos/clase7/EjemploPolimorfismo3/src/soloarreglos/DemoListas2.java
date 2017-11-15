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
public class DemoListas2 {
    public static void main(String[] args) {
        
        
        
        ArrayList<String> cadenas = new ArrayList<String>();
        
        //Pais[] paises1 = new Pais[3];
        //paises1[0] = mipais;
        
        cadenas.add("mipais");
        cadenas.add("tupais");
        cadenas.add("elpais");
        
        for(int i = 0; i < cadenas.size(); i++){
            //System.out.println(paises[i].getCapital());
            System.out.println(cadenas.get(i));
        }
        
        
        for(String p: cadenas){
            System.out.println(p);
        }
        
        
        
        
        
        
        
        
        
        
        
    }
        
        
    
    
}
