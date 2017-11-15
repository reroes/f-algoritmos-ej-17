package ejemplopolimorfismo3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author reroes
 */
public abstract class PersonaEquipo {

    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public PersonaEquipo(int i, String nom, String ape, int ed) {
        setId(i);
        setNombre(nom);
        setApellidos(ape);
        setEdad(ed);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String ape) {
        apellidos = ape;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int e) {
        edad = e;
    }

    
    // IMPORTANTE -> METODO ABSTRACTO => no se implementa en la clase abstracta pero si en la clases hijas
    public abstract void entrenamiento();

    
}
