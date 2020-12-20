/*
* Diseñar un programa para trabajar con un triángulo isóceles. Para ello defina los atributos necesarios que se requieren
* proporcione métodos de consulta, método constructor e implemene métodos para calcular el perímetro y área del triángulo
* además implementar un método a partir de un arreglo de triángulos que devuelva el triángulo de mayor superficie.
*/

public class Triangulo_Isoceles {
  //Atributos de la clase
  private double base;
  private double lado;

  //Métodos de la clase
  //Método constructor
  public Triangulo_Isoceles(double base, double lado){
    this.base = base;
    this.lado = lado;
  }

  public double calcularPerimetro(){
    return (lado*2) + base;
  }

  public double calcularArea(){
    double area = (base*(Math.sqrt(lado*lado - (base*base)/4)))/2;
    area = Math.floor(area*100)/100;
    return area;
  }
}
