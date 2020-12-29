
package Emp_bienesRaices;

import javax.swing.JOptionPane;

/**
 *
 * @author Julian Torres
 */
public class Empresa_A extends Venta_Casas {
    
    @Override
    public void enganche(double ingresos, double costo_casa){
        
        if(ingresos < 8000.0){
            this.enganche = costo_casa*0.15;
        } else {
            this.enganche = costo_casa*0.3;
        }
        
        JOptionPane.showMessageDialog(null, "El enganche de la casa es de: $" + enganche);
        
    }
    
    @Override
    public void mensualidad(double ingresos, double costo_casa){
        
        if (ingresos < 8000){
            this.mensualidad = (costo_casa - enganche)/(12*10);
            JOptionPane.showMessageDialog(null,"La cantidad a pagar mensualmente durante diez años es: " 
                    + Math.floor(mensualidad*100)/100);
        } else {
            this.mensualidad = (costo_casa - enganche)/(12*7);
            JOptionPane.showMessageDialog(null,"La cantidad a pagar mensualmente durante siete años es: " 
                    + Math.floor(mensualidad*100)/100);
        }
        
    }
}
