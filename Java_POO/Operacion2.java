public class Operacion2 {

  //Atributos:
  int suma;
  int resta;
  int mult;
  float div;

  //Métodos:
  //Método para sumar:
  public void sumar (int num1, int num2){
    suma = num1 + num2;
  }

  //Método para restar:
  public void restar (int num1, int num2){
    resta = num1 - num2;
  }

  //Método para multiplicar
  public void multipliacion (int num1, int num2){
    mult = num1*num2;
  }

  //Método para dividir;
  public void division (int num1, int num2){
    div = (float)num1/(float)num2;
  }

  //Método para mostrar resultados
  public void mostrar_resultados (){
    System.out.println("El resultado de la suma es: " + suma);
    System.out.println("El resultado de la resta es: " + resta);
    System.out.println("El resultado de la multipliacion es: " + mult);
    System.out.println("El resultado de la division es: " + div);
  }
}
