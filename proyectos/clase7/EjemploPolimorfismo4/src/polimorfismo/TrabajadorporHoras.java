/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author reroes
 */
public class TrabajadorporHoras extends Trabajador{
    
    public TrabajadorporHoras(String n, String a){
        super(n,a);
    }
    
    @Override
    public double sueldo_trabajador(){
        return 10.0;
    }
}
