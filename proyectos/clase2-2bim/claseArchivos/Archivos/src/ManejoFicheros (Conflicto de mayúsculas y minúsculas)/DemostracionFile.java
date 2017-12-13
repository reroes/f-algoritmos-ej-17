/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoficheros;

import java.io.File;

/**
 *
 * @author reroes
 */
public class DemostracionFile {
    public void analizarRuta(String ruta){
        File nombre = new File(ruta);
        if(nombre.exists()){
            System.out.println("Si existe");
        }else{
            System.out.printf("%s %s", ruta, "no existe");
        }
        
    }
}
