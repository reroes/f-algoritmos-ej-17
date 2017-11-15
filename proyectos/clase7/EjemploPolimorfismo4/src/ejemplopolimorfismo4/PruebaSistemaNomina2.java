package ejemplopolimorfismo4;

// Fig. 10.9: PruebaSistemaNomina.java
// Programa de prueba para la jerarqu�a de Empleado.

public class PruebaSistemaNomina2 
{
   public static void main( String args[] ) 
   {
      // crea objetos de las subclases
      EmpleadoAsalariado empleadoAsalariado = 
         new EmpleadoAsalariado( "John", "Smith", "111-11-1111", 800.00 );
      EmpleadoPorHoras empleadoPorHoras = 
         new EmpleadoPorHoras( "Karen", "Price", "222-22-2222", 16.75, 40 );
      EmpleadoPorComision empleadoPorComision = 
         new EmpleadoPorComision( 
         "Sue", "Jones", "333-33-3333", 10000, .06 );
      EmpleadoBaseMasComision empleadoBaseMasComision = 
         new EmpleadoBaseMasComision( 
         "Bob", "Lewis", "444-44-4444", 5000, .04, 300 );

      System.out.println( "Empleados procesados por separado:\n" );
      
      System.out.printf( "%s\n%s: $%,.2f\n\n", 
         empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         empleadoPorComision, "ingresos", empleadoPorComision.ingresos() );
      System.out.printf( "%s\n%s: $%,.2f\n\n", 
         empleadoBaseMasComision, 
         "ingresos", empleadoBaseMasComision.ingresos() );

      // crea un arreglo Empleado de cuatro elementos
      Empleado empleados[] = new Empleado[ 4 ]; 
      Empleado[] empleados1 = new Empleado[ 4 ]; 

      // inicializa el arreglo con objetos Empleado
      empleados[ 0 ] = empleadoAsalariado;
      empleados[ 1 ] = empleadoPorHoras;
      empleados[ 2 ] = empleadoPorComision; 
      empleados[ 3 ] = empleadoBaseMasComision;

     System.out.println( "Empleados procesados en forma polimorfica:\n" );
      
      // procesa en forma gen�rica a cada elemento en el arreglo de empleados
      for ( Empleado empleadoActual : empleados ) 
      {
         System.out.println( empleadoActual ); // invoca a toString

         System.out.printf( 
            "ingresos $%,.2f\n\n", empleadoActual.ingresos() );
      } // fin de for
      System.out.println("---------------------------------------");
      for(int i = 0; i < empleados.length; i++){
          System.out.println(empleados[i]);
          System.out.println(empleados[i].ingresos());
      }
      // obtiene el nombre del tipo de cada objeto en el arreglo de empleados
      for ( int j = 0; j < empleados.length; j++ )
         System.out.printf( "El empleado %d es un %s\n", j, 
            empleados[ j ].getClass().getName() ); 
   } // fin de main
} // fin de la clase PruebaSistemaNomina

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

