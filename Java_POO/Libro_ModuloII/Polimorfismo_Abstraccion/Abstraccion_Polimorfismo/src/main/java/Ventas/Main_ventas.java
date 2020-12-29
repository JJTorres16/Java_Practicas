
package Ventas;
import javax.swing.JOptionPane;

/**
 *
 * @author Julián Torres
 */
public class Main_ventas {

    public static void main(String[] args) {
        
         double comision = 0.0;
         double pago_total = 0.0;
         double ventas[] = new double[3]; //Vamos a guardar aquí las cantidades de las ventas hechas en la semana
        
         for(int i = 0; i < ventas.length; i++){
             ventas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la venta " + (i + 1)));
         }
         
         comision = Math.floor(Comision.pago_comisiones(ventas[0], ventas[1], ventas[2])*100)/100;
         pago_total = Math.floor(Comision.pago_total(comision)*100)/100;
         
         JOptionPane.showMessageDialog(null, "La comisión semanal que se le paga al empleado es: $" + comision);
         JOptionPane.showMessageDialog(null, "Con la venta semanala el empleado tiene un pago total de: $" + pago_total);
    }
    
}
