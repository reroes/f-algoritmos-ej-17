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
public class EmpleadoPorHoras extends Empleado {
    private double sueldo;
    private double horas;

    public EmpleadoPorHoras(String n, String a, String c, double sue, double hor){
        super(n,a,c);
        setSueldo(sue);
        setHoras(hor);
    }
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sue) {
        sueldo = sue;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double hor) {
        horas = hor;
    }
    
    @Override
    public double ingresos(){
        return getSueldo() * getHoras();
    }
    
    @Override
    public String toString(){
        return  String.format("Empleado por horas: %s \n %s: $%,.2f \n %s: $%,.2f", super.toString(), "sueldo por hora", getSueldo(), "horas trabajadas", getHoras());
    }
}
