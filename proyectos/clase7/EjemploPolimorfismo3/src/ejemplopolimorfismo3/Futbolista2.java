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
public class Futbolista2 extends PersonaEquipo{

    public Futbolista2(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Futbolista: entrena"); 
    }
    
    
}
