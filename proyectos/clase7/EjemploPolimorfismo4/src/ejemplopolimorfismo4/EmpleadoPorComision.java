package ejemplopolimorfismo4;

// Fig. 10.7: EmpleadoPorComision.java
// La clase EmpleadoPorComision extiende a Empleado.

public class EmpleadoPorComision extends Empleado 
{
   private double ventasBrutas; // ventas totales por semana
   private double tarifaComision; // porcentaje de comisi�n

   // constructor con cinco argumentos
   public EmpleadoPorComision( String nombre, String apellido, String nss, 
      double ventas, double tarifa )
   {
      super( nombre, apellido, nss );
      establecerVentasBrutas( ventas );
      establecerTarifaComision( tarifa );
   } // fin del constructor de EmpleadoPorComision con cinco argumentos

   // establece la tarifa de comisi�n
   public void establecerTarifaComision( double tarifa )
   {
      
      if(tarifa > 0.0 && tarifa < 1.0)
          tarifaComision = tarifa;
      else
          throw new IllegalArgumentException("La tarifa de comisión debe ser mayor a 0 y menor a 1");
   } // fin del m�todo establecerTarifaComision

   // devuelve la tarifa de comisi�n
   public double obtenerTarifaComision()
   {
      return tarifaComision;
   } // fin del m�todo obtenerTarifaComision

   // establece el monto de ventas brutas
   public void establecerVentasBrutas( double ventas )
   {
      
      if(ventas > 0.0)
          ventasBrutas = ventas;
      else
          throw new IllegalArgumentException("La ventas brutas debe ser mayor o igual 0");
      
   } // fin del m�todo establecerVentasBrutas

   // devuelve el monto de ventas brutas
   public double obtenerVentasBrutas()
   {
      return ventasBrutas;
   } // fin del m�todo obtenerVentasBrutas

   // calcula los ingresos; sobrescribe el m�todo abstracto ingresos en Empleado
   public double ingresos()
   {
      return obtenerTarifaComision() * obtenerVentasBrutas();
   } // fin del m�todo ingresos

   // devuelve representaci�n String de un objeto EmpleadoPorComision
   public String toString()
   {
      return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f", 
         "empleado por comision", super.toString(), 
         "ventas brutas", obtenerVentasBrutas(), 
         "tarifa de comision", obtenerTarifaComision() );
   } // fin del m�todo toString
} // fin de la clase EmpleadoPorComision


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

