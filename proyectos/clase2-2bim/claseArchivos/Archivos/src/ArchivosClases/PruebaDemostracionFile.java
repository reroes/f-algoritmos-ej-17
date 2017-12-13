// Fig. 14.5: PruebaDemostracionFile.java
// Prueba de la clase DemostracionFile.
import java.util.Scanner;

public class PruebaDemostracionFile
{
   public static void main( String args[] )
   {
      Scanner entrada = new Scanner( System.in );
      DemostracionFile aplicacion = new DemostracionFile();

      System.out.print( "Escriba aqui el nombre del archivo o directorio: " );
      aplicacion.analizarRuta( entrada.nextLine() );
   } // fin de main
} // fin de la clase PruebaDemostracionFile

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