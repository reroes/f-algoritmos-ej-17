package Fig16_04_05;

// Fig 16.5: PruebaBusquedaBinaria.java
// Usa la b�squeda binaria para localizar un elemento en un arreglo.
import java.util.Scanner;

public class PruebaBusquedaBinaria
{
   public static void main( String args[] )
   {
      // crea un objeto Scanner para recibir datos de entrada
      Scanner entrada = new Scanner( System.in );
      
      int enteroABuscar; // clave de b�squeda
      int posicion; // ubicaci�n de la clave de b�squeda en el arreglo
   
      // crea un arreglo y lo muestra en pantalla
      ArregloBinario arregloBusqueda = new ArregloBinario( 15 );
      System.out.println( arregloBusqueda );

      // obtiene la entrada del usuario
      System.out.print( 
         "Escriba un valor entero (-1 para salir): " );
      enteroABuscar = entrada.nextInt(); // lee un entero del usuario
      System.out.println();

      // recibe un entero como entrada en forma repetida; -1 termina el programa
      while ( enteroABuscar != -1 )
      {
         // usa la b�squeda binaria para tratar de encontrar el entero
         posicion = arregloBusqueda.busquedaBinaria( enteroABuscar );

         // el valor de retorno -1 indica que no se encontr� el entero
         if ( posicion == -1 )
            System.out.println( "El entero " + enteroABuscar + 
               " no se encontro.\n" );
         else
            System.out.println( "El entero " + enteroABuscar + 
               " se encontro en la posicion " + posicion + ".\n" );

         // obtiene entrada del usuario
         System.out.print( 
            "Escriba un valor entero (-1 para salir): " );
         enteroABuscar = entrada.nextInt(); // lee un entero del usuario
         System.out.println();
      } // fin de while
   } // fin de main
} // fin de la clase PruebaBusquedaBinaria


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