import java.util.Scanner;

public class Main_Posicion {

  public static void main(String[] args){
    //Atributos:
    Scanner entrada = new Scanner(System.in);
    int ejeX = 0;
    int ejeY = 0;
    char move = '\0';

    //Objeto 1.
    Posicion pos1 = new Posicion(ejeX, ejeY);

    while(move != 'x'){
      System.out.println("****************************************************************************************************");

      //Ingrese el movimieno a realizar:
        System.out.print("Ingrese el movimiento a realizar: \nn = Norte \ns = Sur \ne = Este \no = Oeste \nx = Salir \nMovimiento: ");
        move = entrada.next().charAt(0);
        System.out.println("");

          switch (move){
            case 'n':
              pos1.Arriba();
              break;
            case 's':
              pos1.Abajo();
              break;
            case 'e':
              pos1.Derecha();
              break;
            case 'o':
              pos1.Izquierda();
              break;
            default:
              System.out.println("No se ha colocado un valor correcto");
              break;
            }

        System.out.println("Las coordenadas actuales del objeto es :" + "(" + pos1.getEjeX() + "," + pos1.getEjeY() + ") \n");
  }
 }
}
