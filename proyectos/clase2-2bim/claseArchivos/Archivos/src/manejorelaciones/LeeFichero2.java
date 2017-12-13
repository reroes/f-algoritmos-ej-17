/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejorelaciones;

/**
 *
 * @author reroes
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
 
class LeeFichero2 {
   public static void main(String [] arg) {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
 
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         //archivo = new File ("C:\\archivo.txt");
         archivo = new File ("/home/reroes/carpeta/data.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
         // Lectura del fichero
         String linea;
         //String[] parts;
         
         while((linea=br.readLine())!=null){
            //System.out.println(linea);
            ArrayList<String> registro = new ArrayList<String>(Arrays.asList(linea.split(",")));
            
            System.out.println("---------------------");
            
            String nombre = registro.get(0);
            String cedula = registro.get(1);
            String matriculas_cadena = registro.get(2);
            
            
            ArrayList<String> matriculas_registros = new ArrayList<String>(Arrays.asList(matriculas_cadena.split("-")));
            System.out.println("matriculas_registros");
            //System.out.println(matriculas_registros);
            for(String v: matriculas_registros){
                
                ArrayList<String> info_modulo = new ArrayList<String>(Arrays.asList(v.split(";")));
                
                System.out.println(info_modulo.get(0));
                System.out.println(info_modulo.get(1));
                System.out.println(info_modulo.get(2));
            }
            
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
