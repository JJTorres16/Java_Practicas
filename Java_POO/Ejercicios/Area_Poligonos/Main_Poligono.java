/*
* Hacer un programa para calcular el área de polígonos (Triángulos y rectángulos) el programa debe ser capaz de almacenar en un arreglo N
* triángulos y rectángulos, y al final mostrar el área y los datos de cada uno. Se necesita lo siguiente:
*
* - Una súper clase llamada Polígono
* - Una sub clase llamada Rectángulo
* - Una sub clase llamada Triángulo
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Poligono {

  //Arreglos dinámicos:
  static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
  static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {
    //Rellenar el poligono
    llenarPoligono();

    //Mostrar los datos de cada poligono:
    resultados();
  }

  public static void llenarPoligono(){
    int opcion;
    char respuesta;

      do {

          do {

            System.out.println("Digite que poligono desea");
            System.out.println("[1] Triangulo");
            System.out.println("[2] Rectangulo");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();

          } while (opcion<1 || opcion >2);

          switch (opcion) {
              case 1: //Llenar un triangulo.
                  llenarTriangulo();
                  break;
              case 2: //Llenar un rectangulo.
                  llenarRectangulo();
                  break;
          }

          System.out.print("\nDesea introducir un nuevo poligono? Digite s/n: ");
          respuesta = entrada.next().charAt(0);
          System.out.println("");

      } while (respuesta == 's' || respuesta == 'S');

  }



  public static void llenarTriangulo(){

      double lado1;
      double lado2;
      double lado3;

      System.out.print("\nDigite el valor del lado 1 del triangulo. Lado 1 = ");
      lado1 = entrada.nextDouble();

      System.out.print("Digite el valor del lado 2 del triangulo. Lado 2 =  ");
      lado2 = entrada.nextDouble();

      System.out.print("Digite el valor del lado 3 del triangulo. Lado 3 = ");
      lado3 = entrada.nextDouble();

      //Instanciamos un objeto Triangulo:
      Triangulo triangulo = new Triangulo(lado1,lado2,lado3);

      //Agregamos el nuevo objeto al arreglo dinmámico de poligono:
      poligonos.add(triangulo);

  }


  public static void llenarRectangulo(){

    double lado1;
    double lado2;

    System.out.print("\nDigite el valor del lado 1 del rectangulo. Lado 1: ");
    lado1 = entrada.nextDouble();

    System.out.print("Digite el valor del lado 2 del rectangulo. Lado 2: ");
    lado2 = entrada.nextDouble();

    //Instanciamos un objeto Rectangulo
    Rectangulo rectangulo = new Rectangulo(lado1,lado2);

    //Agregamos el nuevo objeto al arreglo dinámico de poligono:
    poligonos.add(rectangulo);
  }

  public static void resultados(){

  for (Poligono poli: poligonos) {

      System.out.println(poli.toString());
      System.out.println("Area = " + poli.calculaArea() + " unidades cuadradas.\n");

   }
 }

}
