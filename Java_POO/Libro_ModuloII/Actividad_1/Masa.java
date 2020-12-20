/*
* Hacer un programa para obtener el valor de la masa, para ello se parte de la siguiente
* fórmula:
*
* masa = (presión * volumen) / 0.37 * (temperatura + 460)
*/

public class Masa {
  //Método de la clase main:

  public double calculo_masa(double press, double volum, double temp ){
    double masa;

    masa = (press * volum) / 0.37 * (temp + 460);

    return masa;
  }
}
