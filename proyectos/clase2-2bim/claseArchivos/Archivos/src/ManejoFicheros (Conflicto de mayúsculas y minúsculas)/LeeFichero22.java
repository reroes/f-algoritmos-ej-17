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

class LeeFichero22 {

    public static void main(String[] arg) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            //archivo = new File ("C:\\archivo.txt");
            archivo = new File("archivos/prueba2.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            //String[] parts;
            int suma_columna1 = 0;
            int suma2_columna2 = 0;
            ArrayList<Integer> columna1 = new ArrayList<Integer>();
            ArrayList<Integer> columna2 = new ArrayList<Integer>();
            while ((linea = br.readLine()) != null) {
                //System.out.println(linea);
                ArrayList<String> parts = new ArrayList<String>(Arrays.asList(linea.split(";")));

                // System.out.println(parts.size());
                columna1.add(Integer.parseInt(parts.get(0)));
                columna2.add(Integer.parseInt(parts.get(1)));
                
            }
            for(int i=0;i<columna1.size();i++){
                
                suma_columna1 = suma_columna1 + columna1.get(i);
            }
            for(int i=0;i<columna2.size();i++){
                
                suma2_columna2 = suma2_columna2 + columna2.get(i);
            }
            System.out.printf("La suma de columna 1 es %d \n", suma_columna1);
            System.out.printf("La suma de columna 2 es %d \n", suma2_columna2);
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
