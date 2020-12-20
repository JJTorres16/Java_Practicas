import java.util.Scanner;

public class SistemaVacaciones{
  public static void main(String args []){

    Scanner  entrada = new Scanner(System.in);
    Scanner  in_name = new Scanner(System.in);
    String nombre = "";
    int clave = 0;
    int antig = 0;
    int intento = 0;
    boolean cond = true;

    while (cond){
      System.out.println("\n");
      System.out.println("*******************************************************");
      System.out.println("*Bienvenido al sistema vacacional de Coca-Cola company*");
      System.out.println("*******************************************************");


        System.out.println("\n\n");
        System.out.print("Ingrese por favor su nombre: \n");
        nombre = in_name.nextLine();
        System.out.print("Ingrese por favor la cantidad de años de servicio del trabajador: ");
        antig = entrada.nextInt();
        System.out.print("Ingrese por favor la clave del trabajador: ");
        clave = entrada.nextInt();
        System.out.print("\n\n");

        switch (clave){
          case 1:
            if (antig == 1) {
              System.out.println(nombre + ", derecho a 6 dias de vacaciones.");
              }

              else if (antig >= 2 && antig <= 6) {
                  System.out.println(nombre + ", derecho a 14 dias de vacaciones.");
                }

                else if (antig > 7) {
                    System.out.println(nombre + ", derecho a 20 dias de vacaciones.");
                  }

                    else{
                      System.out.println(nombre + ", aun no tiene derecho a vacaciones.");
                    }
                      System.out.println("\n");
            break;

            case 2:
              if (antig == 1) {
                System.out.println(nombre + ", derecho a 7 dias de vacaciones.");
                }

                else if (antig >= 2 && antig <= 6) {
                    System.out.println(nombre + ", derecho a 15 dias de vacaciones.");
                  }

                  else if (antig > 7) {
                      System.out.println(nombre + ", derecho a 22 dias de vacaciones.");
                    }

                      else{
                        System.out.println(nombre + ", aun no tiene derecho a vacaciones.");
                      }
                        System.out.println("\n");
              break;

              case 3:
                if (antig == 1) {
                  System.out.println(nombre + ", derecho a 10 dias de vacaciones.");
                  }

                  else if (antig >= 2 && antig <= 6) {
                      System.out.println(nombre + ", derecho a 20 dias de vacaciones.");
                    }

                    else if (antig > 7) {
                        System.out.println(nombre + ", derecho a 30 dias de vacaciones.");
                      }

                        else{
                          System.out.println(nombre + ", aun no tiene derecho a vacaciones.");
                        }

                          System.out.println("\n");
              break;

              default:
                System.out.println("La clave del departamento no existe.");
      }

      System.out.println("Desea volver a intentarlo? \n Presione 1 para continuar. Presiona 2 para salir.");

      while(!(intento == 1 || intento == 2)){
        intento = entrada.nextInt();
          if (intento == 1) {
            cond = true;
          }
            else if (intento == 2){
              cond = false;
            }
              else{
                System.out.println("\nEl dato ingresado es erroneo. Presione 1 para continuar. Presiona 2 para salir.\n");
              }
      }

      intento = 0;
    }
  }
}
