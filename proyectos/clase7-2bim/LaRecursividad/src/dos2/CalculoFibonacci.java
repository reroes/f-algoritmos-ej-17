package dos2;

// Fig. 15.5: CalculoFibonacci.java
// M�todo fibonacci recursivo.

public class CalculoFibonacci
{
   // declaraci�n recursiva del m�todo fibonacci
   public long fibonacci( long numero )
   {
      if ( ( numero == 0 ) || ( numero == 1 ) ) // casos base
         return numero;
      else // paso recursivo
         return fibonacci( numero - 1 ) + fibonacci( numero - 2 );
   } // fin del m�todo fibonacci

   public void mostrarFibonacci()
   {
      for ( int contador = 0; contador <= 10; contador++ )
         System.out.printf( "Fibonacci de %d es: %d\n", contador,
            fibonacci( contador ) );
   } // fin del m�todo mostrarFibonacci
} // fin de la clase CalculoFibonacci

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