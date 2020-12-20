import java.util.Scanner;

public class Intereses_main {
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    double dinero = 0.0;
    double interes = 1.7; //Inicializamos la variable interes en 1.7

    //Instanciamos un nuevo objeto a la clase Intereses.
    Intereses inversion_1 = new Intereses();

    System.out.print("Ingrese la cantidad que desea invertir: ");
    dinero = entrada.nextInt();

    System.out.println(inversion_1.calculo_intereses(dinero,interes));
  }
}
