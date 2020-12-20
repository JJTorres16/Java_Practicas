import java.util.Scanner;

public class Main_Cuadrilatero {

  public static void main(String[] args){
      Cuadrilatero figura1;

      //Atributos:
      Scanner entrada = new Scanner(System.in);
      float lado1;
      float lado2;

      System.out.print("Digite por favor el lado 1: ");
      lado1 = entrada.nextFloat();

      System.out.print("Digite por favor el lado 2: ");
      lado2 = entrada.nextFloat();

      if (lado1 == lado2){
        figura1 = new Cuadrilatero(lado1);
      } else {
        figura1 = new Cuadrilatero(lado1,lado2);
      }

      System.out.println("El perimetro de la figura es: " + figura1.getPerimetro());
      System.out.println("El area de la figura es: " + figura1.getArea());
 }
}
