import java.util.Scanner;

public class Compra_Main {
  public static void main(String[] args){
    int largoArreglo;
    Scanner entrada = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de productos que va a comprar: ");
    largoArreglo = entrada.nextInt();

    double precios[] = new double[largoArreglo];

    //Instanciamos un objeto;
    Compra inversion = new Compra();

    //Inicializamos un método:
    System.out.println(inversion.calcula_precio(precios));
  }
}
