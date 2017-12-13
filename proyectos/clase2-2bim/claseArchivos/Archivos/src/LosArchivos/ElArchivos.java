/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LosArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author reroes
 */
public class ElArchivos {

    File archivo = null;
    FileWriter fr = null;
    BufferedWriter br = null;

    public ElArchivos() {
        try {
            archivo = new File("archivos/prueba.txt");
            fr = new FileWriter(archivo, true);
            br = new BufferedWriter(fr);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("en el constructor");
        }
    }
    
    public void agregar_informacion(String data){
        try{
            br.write(data);
            br.flush();
        }catch(Exception e){
            System.out.println(e);
            System.out.println("en el método agregar informacion");
        }
        
    }
    
}
