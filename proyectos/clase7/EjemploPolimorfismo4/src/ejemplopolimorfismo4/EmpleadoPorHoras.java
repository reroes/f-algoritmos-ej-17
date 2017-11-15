package ejemplopolimorfismo4;

// Fig. 10.6: EmpleadoPorHoras.java
// La clase EmpleadoPorHoras extiende a Empleado.

public class EmpleadoPorHoras extends Empleado 
{
   private double sueldo; // sueldo por hora
   private double horas; // horas trabajadas por semana

   // constructor con cinco argumentos
   public EmpleadoPorHoras( String nombre, String apellido, String nss, 
      double sueldoPorHoras, double horasTrabajadas )
   {
      super( nombre, apellido, nss );
      establecerSueldo( sueldoPorHoras ); // valida y almacena el sueldo por horas
      establecerHoras( horasTrabajadas ); // valida y almacena las horas trabajadas
   } // fin del constructor de EmpleadoPorHoras con cinco argumentos

   // establece el sueldo
   public void establecerSueldo( double sueldoPorHoras )
   {
      
      if(sueldoPorHoras >= 0.0)
          sueldo = sueldoPorHoras;
      else
          throw new IllegalArgumentException("El sueldo por horas debe ser >= 0.0");
   } // fin del m�todo establecerSueldo

   // devuelve el sueldo
   public double obtenerSueldo()
   {
      return sueldo;
   } // fin del m�todo obtenerSueldo

   // establece las horas trabajadas
   public void establecerHoras( double horasTrabajadas )
   {
      
      if((horasTrabajadas >= 0.0) && (horasTrabajadas <= 168.0))
          horas = horasTrabajadas;
      else
          throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 00"
                  + "y menor o igual a 168");
   } // fin del m�todo establecerHoras

   // devuelve las horas trabajadas
   public double obtenerHoras()
   {
      return horas;
   } // fin del m�todo obtenerHoras

   // calcula los ingresos; sobrescribe el m�todo abstracto ingresos en Empleado
   @Override
   public double ingresos()
   {
      if ( obtenerHoras() <= 40 ) // no hay tiempo extra
         return obtenerSueldo() * obtenerHoras();
      else
         return 40 * obtenerSueldo() + ( obtenerHoras() - 40 ) * obtenerSueldo() * 1.5;
   } // fin del m�todo ingresos

   // devuelve representaci�n String de un objeto EmpleadoPorHoras
   @Override
   public String toString()
   {
      return String.format( "empleado por horas: %s\n%s: $%,.2f; %s: %,.2f", 
         super.toString(), "sueldo por hora", obtenerSueldo(), 
         "horas trabajadas", obtenerHoras() );
   } // fin del m�todo toString
} // fin de la clase EmpleadoPorHoras


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
