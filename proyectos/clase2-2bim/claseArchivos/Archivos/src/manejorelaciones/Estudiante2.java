/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejorelaciones;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Estudiante2 {
    private String nombre;
    private String cedula;
    //private Matricula matriculas[];
    private ArrayList<Matricula> matriculas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
    
    @Override
    public String toString(){
        String cadena = "";
        for(Matricula m: getMatriculas()){
            String c = String.format("\nmodulo denominado %s", m.getModulo());
            cadena = cadena + c;
        }
        return cadena;
    }

    
    
}
