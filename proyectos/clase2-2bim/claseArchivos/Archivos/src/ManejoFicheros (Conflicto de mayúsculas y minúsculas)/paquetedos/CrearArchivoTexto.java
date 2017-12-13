/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoficheros.paquetedos;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class CrearArchivoTexto {
    private  Formatter salida; // objeto usado para enviar texto al archivo
    
    public void abrirArchivo(){
        try{
            salida = new Formatter("/home/reroes/carpeta/registros1.txt");
            
        }catch(SecurityException securityException){
            System.err.println("No se tiene acceso de escritura a este archivo");
            System.exit(1);
        }catch(FileNotFoundException filesNotFoundException){
            System.err.println("Error al crear archivo");
            System.exit(1);
        
        }
    }
    
    public void agregarRegistros(){
        RegistroCuenta registro = new RegistroCuenta();
        
        Scanner entrada1 = new Scanner(System.in);
        
        /**System.out.printf("%s\n%s\n%s\n%s\n\n",
                "Para terminar escriba el indicador de fin de archivo",
                "cuando se le pida que escriba los datos de entrada",
                "en gnu/linux escriba ctrl + d y oprima intro",
                "en windows escriba ctrl z y oprima intro");
        **/
        
        boolean bandera = true;
        //while(entrada.hasNext("Salir")){ //itera hasta encontrar el indicador de fin de archivo
        while(bandera){    
            System.out.printf("%s\n%s",
                "Escriba el número de cuenta (> 0), su nombre y saldo",
                "? ");
            Scanner entrada = new Scanner(System.in);

            try{
                registro.setCuenta(entrada.nextInt());
                registro.setNombre(entrada.next()); //lee cadena para nombre
                registro.setSaldo(entrada.nextDouble());
                entrada.nextLine();
                if(registro.getCuenta() > 0){
                    //se escribe em el archivo
                    salida.format("%d %s %.2f\n", 
                            registro.getCuenta(),
                            registro.getNombre(),
                            registro.getSaldo()
                        );
                }else{
                    System.out.println("El número de cuenta debe ser mayor a 0");
                }
            
            }catch(NoSuchElementException noSuchElementException){
                System.out.println("Entrada inválida.Intente de nuevo");
                entrada.nextLine(); //descarta la entrda para que el usuario intente de nuevo
            }
            
            System.out.printf("%s\n%s",
                "Desea ingresar más datos",
                "1(si), 2(no) ");
            
            int cadena_salir = entrada.nextInt();
            
            if(cadena_salir == 1){
                bandera = true;
            }else{
                bandera = false;
            }
            
        }
    }
    
    public void cerrarArchivo(){
        if(salida != null){
            salida.close();
        }
    }
}
