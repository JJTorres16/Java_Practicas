package Comp_seguros;

import javax.swing.JOptionPane;
/**
 * @author JJTV
 */
public class Main_Fianza {

    
    public static void main(String[] args) {
        //Atributos de la clase Main_Fianza
        int control = 0;
        double pagos[]; pagos = new double[3];
       
        JOptionPane.showMessageDialog(null, "Tiene las siguientes tres opciones de pago. Elija una de ellas.");
        
        while (control == 0){
            control = Integer.parseInt(JOptionPane.showInputDialog(null, "[1] Pagar monto a un solo pago."
                + "\n[2] Pagar monto a dos pagos." + "\n[3] Pagar monto a tres pagos."));
            
            if (control == 0)
                JOptionPane.showMessageDialog(null, "Opción no válida. Vuelva a intentar.");
                
        }
        
        for(int i = 0; i<control; i++){
            double n = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor del pago " + i+1));
            
            pagos[i] = n;
        }
        
        switch(control){
            
            case 1:
                Fianza fianza_1 = new Fianza(pagos[0]);
                break;
                
            case 2:
                Fianza fianza_2 = new Fianza(pagos[0],pagos[1]);
                break;
                
            case 3:
                Fianza fianza_3 = new Fianza(pagos[0], pagos[1], pagos[2]);
                break;
        }
  }  
}
