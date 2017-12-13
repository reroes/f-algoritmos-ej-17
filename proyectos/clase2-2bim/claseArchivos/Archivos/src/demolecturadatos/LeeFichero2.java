/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demolecturadatos;

/**
 *
 * @author reroes
 */

import manejoficheros.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
 
class LeeFichero2 {
   public static void main(String [] arg) {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
 
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         //archivo = new File ("C:\\archivo.txt");
         archivo = new File ("/home/reroes/carpeta/prueba2.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
         // Lectura del fichero
         String linea;
         //String[] parts;
         
         while((linea=br.readLine())!=null){
            //System.out.println(linea);
            ArrayList<String> parts = new ArrayList<String>(Arrays.asList(linea.split(",")));
            
            String id = parts.get(0);
            String nombre = parts.get(1);
            String apellido = parts.get(2);
            String edad = parts.get(3);
            
            
            
            
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
   }
}
