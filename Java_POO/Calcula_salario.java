import java.util.Scanner;

public class Calcula_salario{

  public static void main(String[] args){
    //Atributos de la clase:
    Scanner entrada = new Scanner(System.in);
    int horas = 0;
    char control = 'c';
    int trabajador = 1;

    Salario ob1 = new Salario();

    //Métodos de la clas:
      while (control == 'c'){
        System.out.print("Ingrese las horas del trabajador "+ trabajador + ": ");
        horas = entrada.nextInt();
        System.out.println("Al trabajador " + trabajador + " le corresponde una paga de $" + ob1.calcula_salario(horas) + "\n");
        System.out.println("Desea continuar? [c] para continuar [e] para salir");
        control = entrada.next().charAt(0);
        trabajador = trabajador + 1;
    }
  }
}
