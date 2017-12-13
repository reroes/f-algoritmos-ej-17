/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoficheros;

/**
 *
 * @author reroes
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class LeeFichero2 {

    public static void main(String[] arg) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            //archivo = new File ("C:\\archivo.txt");
            archivo = new File("archivos/prueba.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            //String[] parts;

            while ((linea = br.readLine()) != null) {
                //System.out.println(linea);
                ArrayList<String> parts = new ArrayList<String>(Arrays.asList(linea.split(" ")));

                // System.out.println(parts.size());
                
                for (int i = 0; i < parts.size(); i++) {
                    System.out.println(parts.get(i));
                }

                
                System.out.println("---------------------");
                for (String v : parts) {
                    System.out.println(v);
                }
                System.out.println("---------------------");
                System.out.println("---------------------");
                

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
