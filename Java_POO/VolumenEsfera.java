/*
* Escribir un programa que pida al usuario el radio de tipo double de una esfera y que llame al método
* estático volumenEsfera() para calcular y mostrar el volumen de esa esfera en la misma clase. Use la
* siguiente fórmula para calcular el volumen: (4.0/3.0)*PI*(radio^3)
*/

import java.util.Scanner;

public class VolumenEsfera {

  public static void main(String[] args){
    volumenEsfera();
  }

  public static void volumenEsfera (){
    //Las variables deben estar siempre dentro del método estático
    Scanner entrada = new Scanner(System.in);
    double radio;
    double volumen;
    final double PI = 3.1416;

    System.out.print("Ingrese el valor del radio de la esfera: ");
    radio = entrada.nextDouble();
    volumen = (4.0/3.0)*PI*(radio*radio*radio);
    volumen = Math.floor(volumen*100)/100;
    System.out.println("\nEl volumen de la esfera es: " + volumen + "cm3");
  }
}
