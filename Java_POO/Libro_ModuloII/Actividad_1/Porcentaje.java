/*
* Tres personas decicen invertir para fundar una empresa. Cada una invierte una cantidad distina. Se requiere obtener
* el porcentaje que cada quien invierte con respecto a la cantidad total invertida e imprimirlo en la pantalla.
*
* Un extra es usar un array de objetos
*/

public class Porcentaje {

  //Método de la clase Porcentaje
  public String calcula_porcentaje(double a, double b, double c){
    double total;
    double por_a, por_b, por_c;
    String msj;

    total = a + b + c;
    por_a = (a*100)/total; por_b = (b*100)/total; por_c = (c*100)/total;
    por_a = Math.floor(por_a*100) / 100; por_b = Math.floor(por_b*100) / 100; por_c = Math.floor(por_c*100) / 100;

    return msj = "\nLos porcentajes son los siguientes:\nCantidad 1: " + por_a + "%\nCantidad 2: " + por_b + "%\nCantidad 3: " +  por_c + "%";
  }
}
