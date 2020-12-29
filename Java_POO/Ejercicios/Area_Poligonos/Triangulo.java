/*
* Hacer un programa para calcular el área de polígonos (Triángulos y rectángulos) el programa debe ser capaz de almacenar en un arreglo N
* triángulos y rectángulos, y al final mostrar el área y los datos de cada uno. Se necesita lo siguiente:
*
* - Una súper clase llamada Polígono
* - Una sub clase llamada Rectángulo
* - Una sub clase llamada Triángulo
*/

public class Triangulo extends Poligono{

  //Atributos de la clase Triangulo:
  private double lado1;
  private double lado2;
  private double lado3;

  //Método constructor:
  public Triangulo(double lado1, double lado2, double lado3){
    super(3);
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.lado3 = lado3;
  }

  //Métodos getter:
  public double getLado1(){
    return lado1;
  }

  public double getLado2(){
    return lado2;
  }

  public double getLado3(){
    return lado3;
  }

  @Override
  public String toString(){
    return "El triangulo cuenta con " + super.toString() + "lados. Tiene un lado 1 de = " + lado1 + " unidades, un lado 2 de " + lado2
            + " unidades y un lado 3 de " + lado3 + " unidades.";
  }

  @Override
  public double calculaArea(){

    double p = (lado1+lado2+lado3)/2;
    return Math.floor(Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3)))*100/100;

  }

}
