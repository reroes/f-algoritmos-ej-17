/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecuta {
    public static void main(String[] args) {
        
        LeerArchivoTexto aplicacion = new LeerArchivoTexto();

        aplicacion.abrirArchivo();
        ArrayList<Estudiante> lista =  aplicacion.leerRegistros();
        Paralelo p = new Paralelo();
        p.establecerListaEstudiantes(lista);
        aplicacion.cerrarArchivo();
        System.out.println(p.promedioEdad());
    }
}
