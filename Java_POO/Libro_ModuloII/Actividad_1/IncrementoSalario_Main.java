import java.util.Scanner;

public class IncrementoSalario_Main {
  public static void main (String[] args) {
    Scanner entry1 = new Scanner(System.in);
    double salario;

    //Instanciamos un objeto a la clase Incremento_Salario
    Incremento_Salario ob1 = new Incremento_Salario();

    System.out.print("Ingrese el salario del trabajador: ");
    salario = entry1.nextDouble();

    System.out.println("\nLa cantidad que hay que pagar es: " + ob1.incremento(salario));
  }
}
