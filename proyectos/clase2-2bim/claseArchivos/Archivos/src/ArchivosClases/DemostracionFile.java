package ArchivosClases;

// Fig. 14.4: DemostracionFile.java
// Demostraci�n de la clase File.
import java.io.File;
import java.text.SimpleDateFormat;

public class DemostracionFile
{
   // muestra informaci�n acerca del archivo especificado por el usuario
   public void analizarRuta( String ruta )
   {
      // crea un objeto File con base en la entrada del usuario
      File nombre = new File( ruta );

      if ( nombre.exists() ) // si existe el nombre, muestra informaci�n sobre �l
      {
         // muestra informaci�n del archivo (o directorio)
         String esArchivo;
         if(nombre.isFile()){
             esArchivo = "es un archivo";
         }else{
             esArchivo = "no es un archivo";
         }
         // aqui creo la variable para formatear la fecha de modificiación
         SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

         System.out.printf(
            "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
            nombre.getName(), 
            " existe",
            ( nombre.isFile() ? "es un archivo" : "no es un archivo" ),
            ( nombre.isDirectory() ? "es un directorio" : 
               "no es un directorio" ),
            ( nombre.isAbsolute() ? "es ruta absoluta" : 
               "no es ruta absoluta" ), "Ultima modificacion: ",
            sdf.format(nombre.lastModified()) , "Tamanio: ", nombre.length(), 
            "Ruta: ", nombre.getPath(), "Ruta absoluta: ",
            nombre.getAbsolutePath(), "Padre: ", nombre.getParent() );

         if ( nombre.isDirectory() ) // muestra el listado del directorio
         {
            String directorio[] = nombre.list();
            System.out.println( "\n\nContenido del directorio:\n" );
   
            for ( String nombreDirectorio : directorio )
               System.out.printf( "%s\n", nombreDirectorio );
         } // fin de else
      } // fin de if exterior
      else // no es archivo o directorio, muestra mensaje de error
      {
         System.out.printf( "%s %s", ruta, "no existe." );
      } // fin de else  
   } // fin del m�todo analizarRuta
} // fin de la clase DemostracionFile

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