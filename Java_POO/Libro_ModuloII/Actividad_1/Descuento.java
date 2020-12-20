/*
* Hacer un programa que resuelva el siguiente problema: Una tienda ofrece un descuento del 15% sobre el precio
* total de la compra y el cliente desea saber cuantó deberá pagar finalmente por su compra.
*/

public class Descuento {

  //Método de la clase:
  public double descuento (double costo){
    double new_costo;

    new_costo = costo*0.85;
    new_costo = Math.floor(new_costo*100)/100;

    return new_costo;
 }
}
