package uno;

// Fig. 15.3: CalculoFactorial.java
// M�todo factorial recursivo.

public class CalculoFactorial
{
   // declaraci�n recursiva del m�todo factorial
   public double factorial( double numero )
   {
      if ( numero <= 1 ) {// eval�a el caso base
         return 1; // casos base: 0! = 1 y 1! = 1
      }else{ // paso recursivo
         return numero * factorial( numero - 1 );
      }
   } // fin del m�todo factorial

   // imprime factoriales para los valores del 0 al 10
   public void mostrarFactoriales()
   {
      // calcula los factoriales del 0 al 10
      for ( int contador = 0; contador <= 4; contador++ )
         System.out.printf( "%d! = %.0f\n", contador, factorial( contador ) );
      // System.out.printf("%.2f", 4.0); 

   } // fin del m�todo mostrarFactoriales
} // fin de la clase CalculoFactorial

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