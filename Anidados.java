import java.util.Scanner;

public class Anidados {
  public static void main (String args []){
    //Delcaración de las variables.
    Scanner in =  new Scanner (System.in);
    int operacion = 0;
    int a = 4;
    int b = 5;
    float res = 0;
    int c = 0;
    boolean cond = true;

    while (cond){
      c = 0;
      System.out.println("Elige la operacion: 1-sumar, 2-restar, 3-multiplicar, 4-dividir. \nIngresa un numero:");
      operacion = in.nextInt();

      if (operacion > 0 && operacion <= 4) {
        if (operacion == 1) {
          res = a + b;
          System.out.println ("Se elige sumar. El resultado es = " + res);
        }
          if (operacion == 2) {
            res = a - b;
            System.out.println ("Se elige restar. El resultado es = " + res);
          }
            if (operacion == 3) {
              res = a*b;
              System.out.println ("Se elige multiplicar. El resultado es = " + res);
            }
              if (operacion == 4) {
                res = (float)a/(float)b;
                System.out.println("Se elige dividir. El resultado es = " + res);
              }
            }
            else {
              System.out.println("No se eligio niguna operacion.");
      }

      System.out.println("\nDesea continuar? \n Presione 1 para seguir; presione 2 para parar.");

        while (!(c == 1 || c == 2)){
        c = in.nextInt();
          if (c == 1) {
              cond = true;
            }
          else if (c == 2) {
            cond = false;
          }
          else {
            System.out.println("No se ingreso un valor correcto. Vuelva a intentar. Presione 1 para seguir; presione 2 para parar.");
          }
        }
          System.out.println("**********************************************************************************************\n\n");
    }
  }
}
