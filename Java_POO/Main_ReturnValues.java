import java.util.Scanner;

public class Main_ReturnValues {
  public static void main (String args []){

    //Atributos:
    int num1;
    int num2;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite por favor un numero = ");
    num1 = entrada.nextInt();
    System.out.print("Digite por favor un numero = ");
    num2 = entrada.nextInt();

    //Instancias:
    RetornoValores rv = new RetornoValores();

    //Métodos:
    System.out.println("El resultado de sumar ambos numeros es = " + rv.sumar(num1,num2));
    System.out.println("El resultado de restar ambos numeros es = " + rv.restar(num1,num2));
    System.out.println("El resultado de multiplicar ambos numeros es = " + rv.multiplicar(num1,num2));
    System.out.println("El resultado de dividir ambos numeros es = " + rv.dividir(num1,num2));
  }
}
