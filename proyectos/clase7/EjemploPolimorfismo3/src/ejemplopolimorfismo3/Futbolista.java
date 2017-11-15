/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo3;

/**
 *
 * @author reroes
 */
public class Futbolista extends PersonaEquipo {

   private int dorsal;
   private String nombre_demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int n_dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        setDorsal(n_dorsal);
        setDemarcacion(demarcacion);
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int n_dorsal) {
        dorsal = n_dorsal;
    }

    public String getDemarcacion() {
        return nombre_demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        nombre_demarcacion = demarcacion;
    }
   
   // constructor, getter y setter

   @Override
   public void entrenamiento() {
      System.out.printf("Realiza un entrenamiento (Clase Futbolista). Su número es %d\n", getDorsal());
   }

   
}
