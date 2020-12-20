/*
* El dueño  de una tienda compra artículos diversos a un precio determinado, pero para poder obtener una ganancia
* de un 30% necesita un programa que calcule el precio final de cada artículo.
*/

import java.util.Scanner;

public class Compra {

  public String calcula_precio (double precios[]){
    Scanner entrada = new Scanner(System.in);
    double precio_cantidad;
    double new_precio;
    String msj = "\nEl precio nuevo de cada objeto es: ";

    System.out.println("Ingrese los precios de las cantidades: ");
    for(int i = 0; i<precios.length; i++){
      precios[i] = entrada.nextDouble();
      new_precio = Math.floor(precios[i]*1.3*100)/100;
      msj = msj + " $" + new_precio + ", ";
    }

    return msj;
  }
}
