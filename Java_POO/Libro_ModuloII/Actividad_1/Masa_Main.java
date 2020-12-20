import java.util.Scanner;

public class Masa_Main {
  public static void main(String[] args){

    //Atributos de la clase Masa_Main
    Scanner entry1 = new Scanner(System.in);
    double presion, volumen, temp;

    //Instanciamos un objeto a la clase Masa
    Masa obj = new Masa();

    //Métodos de la clase Masa_Main
    System.out.print("Ingrese el valor de la presion: ");
      presion = entry1.nextDouble();
    System.out.print("Ingrese el valor del volumen: ");
      volumen = entry1.nextDouble();
    System.out.print("Ingrese el valor de la temperatura: ");
      temp = entry1.nextDouble();

    System.out.println("\nEl valor resultante de la masa es: " + obj.calculo_masa(presion, volumen, temp));
  }
}
