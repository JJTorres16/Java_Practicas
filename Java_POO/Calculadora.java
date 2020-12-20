import java.util.Scanner;

public class Calculadora {
  public static void main(String [] args){

    Aritmetica obj = new Aritmetica(); //Instanciamos un nuevo objeto de la clase Aritmetica.
    //Atributos de la clase
    double a=0;
    double b=0;
    double resultado=0;
    Scanner entrada = new Scanner(System.in);
    int opc = 0;
    char c = 'c';

    //Métodos de la clase Calculadora
    while (c == 'c'){
      System.out.println("Escoge la operacion que quieres realizar:");
        System.out.println("[1] Sumar");
        System.out.println("[2] restar");
        System.out.println("[3] Divir");
        System.out.println("[4] Cuadrado");
        System.out.println("[5] Raiz");
      //entrada.nextLine();
      opc = entrada.nextInt();

        switch (opc)
        {
          case 1:
            System.out.print("Ingrese un numero: ");
              a = entrada.nextDouble(); System.out.println("");
            System.out.print("Ingrese un numero: ");
              b = entrada.nextDouble(); System.out.println("");
            System.out.println("El resultado de la suma de ambos numeros es: " + obj.sumar(a,b));
            break;

          case 2:
            System.out.print("Ingrese un numero: ");
              a = entrada.nextDouble(); System.out.println("");
            System.out.print("Ingrese un numero: ");
              b = entrada.nextDouble(); System.out.println("");
           System.out.println("El resultado de la resta de ambos numeros es: " + obj.restar(a,b));
           break;

          case 3:
            System.out.print("Ingrese un numero: ");
              a = entrada.nextDouble(); System.out.println("");
            System.out.print("Ingrese un numero: ");
              b = entrada.nextDouble(); System.out.println("");
            System.out.println("El resultado de la multiplicacion entre ambos numeros es: " + obj.multiplicar(a,b));
            break;

          case 4:
            System.out.print("Ingrese el numero: ");
              a = entrada.nextDouble(); System.out.println("");
            System.out.println("El numero elevado al cuadrado es : " + obj.cuadrado(a));
            break;

          case 5:
            System.out.print("Ingrese el numero: ");
              a = entrada.nextInt(); System.out.println("");
            System.out.println("La raiz cuadrada del numero es : " + obj.raiz(a));
            break;

          default:
            System.out.println("No se ingreso un numero correcto\n");
        }

      System.out.println("Desea continuar? [c] Para continuar | [a] Para salir");
      c = entrada.next().charAt(0);
      System.out.println("\n\n");
    }
  }
}
