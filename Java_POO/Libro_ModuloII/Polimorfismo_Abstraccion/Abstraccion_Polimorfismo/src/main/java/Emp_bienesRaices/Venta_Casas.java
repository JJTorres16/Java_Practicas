/*
 * Una empresa de bienes raíces ofrece casas de interés social bajo las siguientes condiciones:
 * si los ingresos del comprador son menores a $8000, el enganche será del 15% del costo de la casa
 * y el resto se distribuirá en pagos mensuales a pagar en diez años. Si los ingresos del comprador
 * son de $8000 o más, el enganche será del 30% del costo de la casa y el resto se distribuirá en 
 * pagos mensuales a pagar en siete años. La empresa desa saber cuando debe pagar un comprador por
 * concepto de enganche y cuanto por cada pago parcial, por lo que requiere elaborar una aplicación
 * que resuelva esta cuestión pero que también se pueda adaptar a cualquier empresa del ramo con 
 * diferentes políticas.
 */
package Emp_bienesRaices;

/**
 *
 * @author Julian Torres
 */

abstract class Venta_Casas {
    
    //Atributos de clase Venta_Casas:
    protected double enganche;
    protected double mensualidad;

     //Se declaran los métodos abstractos
    public abstract void enganche(double ingresos, double costo_casa);
    public abstract void mensualidad(double ingresos, double costo_casa);
    
}
