/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoficheros.paquetedos;

/**
 *
 * @author reroes
 */
public class RegistroCuenta {
    private int cuenta;
    private String nombre;
    private double saldo;
    
    public RegistroCuenta(){
        this(0, "", 0.0);
    }
    
    public RegistroCuenta(int cta, String nombre, double sal){
        setCuenta(cta);
        setNombre(nombre);
        setSaldo(sal);
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
