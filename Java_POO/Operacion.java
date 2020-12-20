import java.util.Scanner;

public class Operacion {
  //Estos son los atributos:
  Scanner entrada = new Scanner (System.in);
  int num1;
  int num2;
  int suma;
  int resta;
  int mult;
  float div;

  //Estos son los métodos:
  //Método para pedirle al usuario que nos digite dos números:
  public void leer_nums(){
    /*num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: ")); //Otra forma de pedir un número a parte del scann.
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));*/
    System.out.println("Digite un numero: ");
    num1 = entrada.nextInt();
    System.out.println("Digite un numero: ");
    num2 = entrada.nextInt();
  }

  //Método para sumar dos números
  public void sumar (){
    suma = num1 + num2;
  }

  //Método para restar dos números
  public void restar (){
    resta = num1 - num2;
  }

  //Método para multiplicar dos números
  public void multiplicar (){
    mult = num1 * num2;
  }

  //Método para dividir dos números
  public void dividir (){
    div = (float)num1 / (float)num2;
  }

  //Método para mostrar los resultados
  public void mostrar_resultados (){
    System.out.println("La suma es: " + suma);
    System.out.println("La resta es es: " + resta);
    System.out.println("La multipliacion es: " + mult);
    System.out.println("La division es: " + div);
  }
}
