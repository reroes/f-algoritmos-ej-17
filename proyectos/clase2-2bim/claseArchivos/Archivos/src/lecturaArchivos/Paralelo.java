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
public class Paralelo {
    String nombre;
    ArrayList<Estudiante> listaEstudiantes;
    
    public void establecerListaEstudiantes(ArrayList<Estudiante> lista){
        listaEstudiantes = lista;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public ArrayList<Estudiante> obtenerListaEstudiante(){
        return listaEstudiantes;
    }
    public double promedioEdad(){
        double valor = 0;
        for (int i = 0; i < obtenerListaEstudiante().size(); i++) {
            valor = valor + obtenerListaEstudiante().get(i).obtenerEdad();
        }
        
        return valor/obtenerListaEstudiante().size();
    }
    
}
