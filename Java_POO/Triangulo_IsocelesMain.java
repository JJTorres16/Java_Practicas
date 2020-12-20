import java.util.Scanner;

public class Triangulo_IsocelesMain {
  public static void main(String[] args){
    Scanner entry1 = new Scanner(System.in);
    double lado;
    double base;
    int cant_triangulo;

    System.out.print("Digite el numero de triangulos: ");
    cant_triangulo = entry1.nextInt();

    //Creamos los objetos de la clase Triangulo_Isoceles
    Triangulo_Isoceles triangulos[] = new Triangulo_Isoceles[cant_triangulo];

    for(int i=0; i<triangulos.length; i++){
      System.out.print("\nIngresa el valor de los lados del triangulo " + (i+1) + ": ");
        lado = entry1.nextDouble();
      System.out.print("Ingrese el valor de la base del triangulo " + (i+1) + ": ");
        base = entry1.nextDouble();

      triangulos[i] = new Triangulo_Isoceles(base,lado);
      System.out.println("El perimetro del triangulo " + (i+1) + " es: " + triangulos[i].calcularPerimetro());
      System.out.println("El area del triangulo " + (i+1) + " es: " + triangulos[i].calcularArea());
    }

      System.out.println(areaMayor(triangulos));
  }

  public static String areaMayor(Triangulo_Isoceles triangulos[]){
    double area = triangulos[0].calcularArea();
    for (int i=1; i<triangulos.length;i++)
    {
      if (triangulos[i].calcularArea()>area){
        area = triangulos[i].calcularArea();
      }
    }

    return "\nEl area del triangulo con mayor superficie es: " + area;
  }
}
