import java.util.Scanner;

public class Operacion_Main {
  public static void main(String[] args){

    //Atributos de clase Operacion_Main
    Scanner entrada = new Scanner(System.in);
    int a, b, c;

    //Instanciar un objeto en la clase Operacion
    Operacion op1 = new Operacion();

    System.out.print("Ingrese el primer numero: ");
      a = entrada.nextInt();
    System.out.print("Ingrese el segundo numero: ");
      b = entrada.nextInt();
    System.out.print("Ingrese el tercer numero: ");
      c = entrada.nextInt();

    System.out.println("El resultado de sumar los tres numeros es: " + op1.suma(a,b,c));
  }
}
