import java.util.Scanner;

public class Main2{
  public static void main (String args []){
    Scanner entrada = new Scanner(System.in);
    int num1;
    int num2;

    System.out.print("Digite por favor, un numero: ");
    num1 = entrada.nextInt();
    System.out.print("Digite por favor, un numero: ");
    num2 = entrada.nextInt();

    Operacion2 op2 = new Operacion2();

    op2.sumar(num1,num2);
    op2.restar(num1,num2);
    op2.multipliacion(num1,num2);
    op2.division(num1,num2);
    op2.mostrar_resultados();
  }
}
