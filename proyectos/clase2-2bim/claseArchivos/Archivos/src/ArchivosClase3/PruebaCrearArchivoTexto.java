package ArchivosClase3;


// Prueba de la clase CrearArchivoTexto.

public class PruebaCrearArchivoTexto
{
   public static void main( String args[] )
   {
      CrearArchivoTexto aplicacion = new CrearArchivoTexto();

      aplicacion.abrirArchivo();
      aplicacion.agregarRegistros();
      aplicacion.cerrarArchivo();
   } // fin de main
} // fin de la clase PruebaCrearArchivoTexto

