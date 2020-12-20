import java.util.Scanner;

public class Porcentaje_Main {
  public static void main(String[] args){
    //Atributos de la clase Porcentaje_Main
    Scanner entrada = new Scanner(System.in);
    double a,b,c;

    //Instanciamos un objeto a la clase porcentaje:
    Porcentaje invesion = new Porcentaje();

    System.out.print("Ingrese la primera cantidad: ");
      a = entrada.nextDouble();
    System.out.print("Ingrese la segunda cantidad: ");
      b = entrada.nextDouble();
    System.out.print("Ingrese la tercera cantidad: ");
      c = entrada.nextDouble();

    System.out.println(invesion.calcula_porcentaje(a,b,c));
  }
}
