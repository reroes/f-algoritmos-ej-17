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
 
public class Demo1
{
    public static void main(String[] args)
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("/home/reroes/carpeta/prueba_suma.txt");
            //fichero = new FileWriter("z:/ejemplosarchivos/prueba.txt");
            //fichero = new FileWriter("prueba.txt");
            pw = new PrintWriter(fichero);
 
            for (int i = 0; i < 10; i++)
                //pw.println("Linea253 " + i);
                pw.printf("numero a utilizar %s\n", i);
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
}
