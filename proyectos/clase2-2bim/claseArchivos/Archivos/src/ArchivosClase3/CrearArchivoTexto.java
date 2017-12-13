package ArchivosClase3;

// Fig. 14.7: CrearArchivoTexto.java
// Uso de la clase Formatter para escribir datos en un archivo de texto.
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// import com.deitel.jhtp7.cap14.RegistroCuenta;
public class CrearArchivoTexto {

    private Formatter salida; // objeto usado para enviar texto al archivo

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            salida = new Formatter("clientes2.txt");
        } // fin de try
        catch (FileNotFoundException e) {
            System.out.println("Hubo un error");
            System.out.println(e);
        }
    } // fin del m�todo abrirArchivo

    // agrega registros al archivo
    public void agregarRegistros() {

        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);
        // while ( entrada.hasNext() ) // itera hasta encontrar el indicador de fin de archivo
        while (bandera == true) // itera hasta encontrar el indicador de fin de archivo
        {
            try {
                // escribe el nuevo registro
                salida.format("%s %s %s", "1", "2", "3");

                System.out.println("Desea ingresar más cuentas si (1), no(2)");
                int valor = entrada.nextInt();
                if (valor == 2) {
                    bandera = false;
                }
                entrada.nextLine();
            } // fin de try
            catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error al escribir en el archivo.");
                return;
            } // fin de catch
            catch (NoSuchElementException elementException) {
                System.err.println("Entrada invalida. Intente de nuevo.");
                entrada.nextLine(); // descarta la entrada para que el usuario intente de nuevo
            } // fin de catch

        } // fin de while
    } // fin del m�todo agregarRegistros

    // cierra el file
    public void cerrarArchivo() {
        if (salida != null) {
            salida.close();
        }
    } // fin del m�todo cerrarArchivo
} // fin de la clase CrearArchivoTexto

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/
