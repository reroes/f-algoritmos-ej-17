/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escrituraArchivos;

import java.util.ArrayList;


/**
 *
 * @author reroes
 */
public class PruebaCrearArchivoTexto {
    public static void main(String[] args) {
        CrearArchivoTexto aplicacion = new CrearArchivoTexto();
        aplicacion.abrirArchivo();
        
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            estudiantes.add(new Estudiante("René", i));
        }
        
        aplicacion.agregarRegistros(estudiantes);
        aplicacion.cerrarArchivo();
    }
}
