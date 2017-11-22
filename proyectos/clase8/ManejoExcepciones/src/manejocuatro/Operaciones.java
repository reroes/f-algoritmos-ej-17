/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocuatro;

/**
 *
 * @author reroes
 */
public class Operaciones {
    int a;
    int b;
    
    public Operaciones(int primer_valor, int segundo_valor){
        set_a(primer_valor);
        set_b(segundo_valor);
        
    }
    
    public void set_a(int pv){
        a = pv;
    }
    
    public void set_b(int sv){
        b = sv;
    }
    
    public int get_a(){
        return a;
    }
    
    public int get_b(){
        return b;
    }
    
    public int get_suma(){
        return get_a() + get_b();
    }
    
    
    public int get_division(){
        int valor = 0;
        // try{
        valor = get_a() / get_b();
        // }catch(Exception e){
        //     System.err.println(e);
           
        // }
        return valor;
        
    }
    
}
