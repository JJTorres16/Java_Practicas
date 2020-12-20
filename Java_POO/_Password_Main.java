import java.util.Scanner;

public class _Password_Main{
  public static void main(String[] args){

    //Atributos de la clase _Password_Main.java
    Scanner entry1 = new Scanner(System.in);
    int longitud;

    System.out.print("Asigne la longitud del password: ");
    longitud = entry1.nextInt();

    //Instanciamos un objeto
    Password_ objeto = new Password_ (longitud);
  }
}
