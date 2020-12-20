import java.util.Scanner;

public class Vehiculo_Main {

  public static int indiceCocheBarato(Vehiculo coches[]){ //Obtener el valor mínimo de un array.
    float precio = 0;
    int indice = 0;

    precio = coches[0].getPrecio();
    for (int i = 1; i< coches.length; i++){
      if (coches[i].getPrecio() < precio){
        precio = coches[i].getPrecio();
        indice = i;
      }
    }

    return indice;
  }

  public static void main (String [] args){
    Scanner entrada = new Scanner(System.in); //Entrada de datos.
    String marca;
    String modelo;
    float precio;
    int numeroVehiculo;
    int indiceAutoBarato;

    System.out.print("Digite la cantidad de vehiculos: ");
    numeroVehiculo = entrada.nextInt();

    //Crear un arreglo de objetos
    Vehiculo coches[] = new Vehiculo[numeroVehiculo];

    for(int i = 0; i< coches.length; i++){
      System.out.println("\nDigite las caracterisicas del vehiculo " + (i+1) + ": ");
      entrada.nextLine();
      System.out.print("Digite la marca del coche: "); marca = entrada.nextLine();
      System.out.print("Digite el modelo del coche: "); modelo = entrada.nextLine();
      System.out.print("Digite el precio del coche: "); precio = entrada.nextFloat();

      coches[i] = new Vehiculo(marca, modelo, precio);
    }

    indiceAutoBarato = indiceCocheBarato(coches);
    System.out.println("\nEl auto mas barato es: " + coches[indiceAutoBarato].mostrarDatos());
  }
}
