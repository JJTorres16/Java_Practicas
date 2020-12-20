import java.util.Scanner;

public class Descuento_Main {
  public static void main(String[] args){
    //Atributos de la clase Descuento_Main
    Scanner entrada = new Scanner(System.in);
    double costo;

    //Inicializar un objeto en la clase Descuento
    Descuento objeto = new Descuento();

    //Métodos de la clase Descuento_Main
    System.out.print("Ingrese el costo de la compra: ");
    costo = entrada.nextDouble();

    System.out.println("El costo con descuento es: " + objeto.descuento(costo));
  }
}
