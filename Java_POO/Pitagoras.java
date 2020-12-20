/*
* Escribir un programa que, utilizando el teorema de Pitágoras, calcule el valor de la hipotenusa
* Se hará una clase Pitágoras que un método calcularHipo().
*/

import java.util.Scanner;

public class Pitagoras {
  public static void main(String[] args){
    calcularHipo();
  }

  public static void calcularHipo(){
    Scanner entrada = new Scanner(System.in);
    double cateto1;
    double cateto2;
    double hipotenusa;

    System.out.print("Ingrese el valor del cateto 1: ");
      cateto1 = entrada.nextDouble();
    System.out.print("Ingrese el valor del cateto 2: ");
      cateto2 = entrada.nextDouble();

    hipotenusa = Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));
    hipotenusa = Math.floor(hipotenusa*100)/100;

    System.out.println("El valor de la hipotenusa es: " + hipotenusa);
  }
}
