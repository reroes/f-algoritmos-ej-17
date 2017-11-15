/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo2;

/**
 *
 * @author reroes
 */
public class EmpleadosAsalariado extends Empleado {
    private double salarioSemanal;
    
    public EmpleadosAsalariado(String n, String a, String c, double salario){
        super(n,a,c);
        setSalarioSemanal(salario);
    }
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salario) {
        
        if(salario >= 0){
            salarioSemanal = salario;
        }else{
            salarioSemanal = 0;
        }
        
    }
    
    public double ingresos(){
        return getSalarioSemanal();
    }
    
    public String toString(){
        return  String.format("Empleado Asalariado: %s \n %s: $%,.2f", super.toString(), "salario semanal", getSalarioSemanal());
    }
}
