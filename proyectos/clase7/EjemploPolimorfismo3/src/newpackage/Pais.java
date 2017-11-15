/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author reroes
 */
public class Pais {
    private String nombre;
    private String capital;
    private Double poblacion;
    private String clima;

    public Pais(String nombre, String capital, Double poblacion, String clima) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.clima = clima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Double poblacion) {
        this.poblacion = poblacion;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }
    
    @Override
    public String  toString(){
        return String.format("Me presento como objeto: mi nombre es %s, mi población es %f", getNombre(), getPoblacion());
    }
    
    
}
