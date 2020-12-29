/*
 * Una compañia de seguros de autos abrió un departamento de finanzas y estableción
 * un prgrama para captar clientes que consiste en lo siguiente: si el monto por el
 * que se efectúa la fianza se hace en un pago, la cuota mensual a pagar será del 3%
 * del monto; si el monto se efectua en dos pagos, la cuota mensual a pagar será 2%
 * del monto; si el monto de la fianza se efectúa en tres pagos, la cuata a pagar será
 * del 1% mensual. La afianzadora desea determinar: ¿Cual será la cuota que debe pagar
 * un cliente dependiendo del número de pagos que haga?
 */
package Comp_seguros;

import javax.swing.JOptionPane;

/**
 *
 * @author JJTV
 */
public class Fianza {
    
    public Fianza (double pago1){
        
       double cuota_mensual;
       cuota_mensual = pago1*0.03;
       JOptionPane.showMessageDialog(null, "La cuota mensual a pagar es: $" + Math.floor(cuota_mensual*100)/100);
    
    }
    
    public Fianza (double pago1, double pago2){
        
        double cuota_mensual;
        cuota_mensual = (pago1 + pago2)*0.02;
        JOptionPane.showMessageDialog(null, "La cuota mensual a pagar es: $" + Math.floor(cuota_mensual*100)/100);
        
    }
    
    public Fianza (double pago1, double pago2, double pago3){
        
        double cuota_mensual;
        cuota_mensual = (pago1 + pago2 + pago3)*0.01;
        JOptionPane.showMessageDialog(null, "La cuota mensual a pagar es: $" + Math.floor(cuota_mensual*100)/100);
    
    } 
    
}
