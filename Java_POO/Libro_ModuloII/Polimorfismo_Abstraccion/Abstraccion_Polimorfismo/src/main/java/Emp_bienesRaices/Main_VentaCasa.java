/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emp_bienesRaices;

import javax.swing.JOptionPane;

/**
 *
 * @author Julián Torres
 */
public class Main_VentaCasa {
    
    public static void main(String[] args) {
        //Atributos de la clase Main_VentaCasa
        int controlCosto_casa = 0;
        double ingresos;
        double costo_casa;
        
        /************* Le solicitamos al usuario que digite la cantidad que gana mensualmente *************/
        ingresos = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sus ingresos mensuales, por favor:"));
        
        /************ Le solicitamos al usuario que elija una casa según su precio *******************/
        while(controlCosto_casa == 0 || controlCosto_casa > 3){
            controlCosto_casa = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija una casa: " + 
                    "\n[1] Casa de $100,000" + "\n[2] Casa de $250,000" + "\n[3] Casa de $500,000"));
            
            if(controlCosto_casa == 0 || controlCosto_casa > 3)
                JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelva a intentar");
        }
        
        /******** Dependiendo de la selección asigamos un valor a la variable 'costo_casa'*********/
        switch (controlCosto_casa){
            case 1:
                costo_casa = 100000.0;
                break;
            case 2:
                costo_casa = 250000.0;
                break;
            case 3:
                costo_casa = 500000.0;
                break;
                
            default:
                costo_casa = 0;
        }
        
        /*************** Instanciamos objetos en la clase Empres_A*******************/
        Empresa_A compra_1 = new Empresa_A();
        
        /*************** Se inicializan los métodos **********************/
        compra_1.enganche(ingresos, costo_casa);
        compra_1.mensualidad(ingresos, costo_casa);
        
    }
    
}
