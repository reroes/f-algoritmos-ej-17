package paquete_lineal_2;

// Fig 16.2: ArregloLineal.java
// Clase que contiene un arreglo de enteros aleatorios y un m�todo 
// que busca en ese arreglo, en forma secuencial.
import java.util.Arrays;
import java.util.Random;

public class ArregloLineal
{
   private int[] datos; // arreglo de valores


   // crea un arreglo de un tama�o dado, y lo rellena con enteros aleatorios
   public ArregloLineal( int [] valores)
   {
      datos = valores; // crea un espacio para el arreglo

      // para el caso de búsqueda binaría, usar
      // Arrays.sort(datos);
   } // fin del constructor de ArregloLineal

   // realiza una b�squeda lineal en los datos
   public int busquedaLineal( int claveBusqueda )
   {
      // itera a trav�s del arreglo en forma secuencial
      for ( int indice = 0; indice < datos.length; indice++ )
         if ( datos[ indice ] == claveBusqueda )
            return indice; // devuelve el �ndice del entero

      return -1; // no se encontr� el entero
   } // fin del m�todo busquedaLineal

   // m�todo para imprimir los valores del arreglo
   public String toString()
   {
      StringBuilder temporal = new StringBuilder();

      // itera a trav�s del arreglo
      for ( int elemento : datos )
         temporal.append( elemento + " " );

      temporal.append( "\n" ); // agrega el car�cter de nueva l�nea
      return temporal.toString();
   } // fin del m�todo toString
} // fin de la clase ArregloLineal


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