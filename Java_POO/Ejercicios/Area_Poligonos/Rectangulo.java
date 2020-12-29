/*
* Hacer un programa para calcular el área de polígonos (Triángulos y rectángulos) el programa debe ser capaz de almacenar en un arreglo N
* triángulos y rectángulos, y al final mostrar el área y los datos de cada uno. Se necesita lo siguiente:
*
* - Una súper clase llamada Polígono
* - Una sub clase llamada Rectángulo
* - Una sub clase llamada Triángulo
*/

public class Rectangulo extends Poligono{

  //Atributos de la clase Rectangulo:
  private double lado1;
  private double lado2;

  //Método constructor
  public Rectangulo(double lado1, double lado2){
    super(2);
    this.lado1 = lado1;
    this.lado2 = lado2;
  }

  public double getLado1(){
    return lado1;
  }

  public double getLado2(){
    return lado2;
  }

  /*******************************************************************************/

  //Métodos de la clase Rectangulo:
  @Override
  public double calculaArea(){

        return Math.floor(lado1*lado2*100)/100;
  }

  @Override
  public String toString(){

    return "El rectangulo cuenta con " + super.toString() + " lados. Tiene un lado 1 con una medida de = " + lado1
            + " unidades y un lado 2, que tiene una medidad de = " + lado2 + " unidades.";

  }

}
