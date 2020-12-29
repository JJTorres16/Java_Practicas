/*
 * Una compañía de seguros tiene contradados a n vendedores. Cada uno hace tres ventas a la semana.
 * Su polítca de pagos contempla un sueldo base para el vendedor y un 10% extra por comosiones de sus
 * ventas. El gerente de la compañía desea saber dos conceptos: ¿Cuanto dinero obtendrá en la semana
 * cada vendedor por concepto de comisiones por las tres ventas realizadas? y ¿y cuanto tomando en
 * cuenta su sueldo base y sus comisiones.
 */
package Ventas;

import javax.swing.JOptionPane;

/**
 *
 * @author Julián Torres
 */
public class Comision {
    
    //Métodos static de la clase Comision:
    protected static double pago_comisiones(double venta1, double venta2, double venta3){
    
        double comision; //Iniciamlizamos una variable llamada 'comision' en 0.
        comision = (venta1 + venta2 + venta3)*0.1;
        
        return comision;
    }
    
    protected static double pago_total(double comisiones){
        
        int control_salario = 0;
        double salario_base;
        double total = 0;
        
        while(control_salario == 0 || control_salario > 3){
            control_salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione el sueldo base del trabajador"
                + "\n[1] $15,000.00" + "\n[2] $12,000.00"));
            
            if(control_salario == 0 || control_salario > 3){
                JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelva a intentar");
            } 
        }
        
        switch (control_salario){
            case 1:
                salario_base = 15000.0;
                break;
            case 2:
                salario_base = 12000.0;
                break;
            default:
                salario_base = 0;
                break;
        }
        
        total = comisiones +  salario_base;
        return total;
    }

}

