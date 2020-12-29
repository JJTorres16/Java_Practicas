/*
* Hacer un programa para calcular el área de polígonos (Triángulos y rectángulos) el programa debe ser capaz de almacenar en un arreglo N
* triángulos y rectángulos, y al final mostrar el área y los datos de cada uno. Se necesita lo siguiente:
*
* - Una súper clase llamada Polígono
* - Una sub clase llamada Rectángulo
* - Una sub clase llamada Triángulo
*/

public abstract class Poligono{

  //Atributos de la clase Poligono
  protected int numeroLados;

  //Métodos de la clase Poligono
  public abstract double calculaArea(); //Declarar el método calcularArea como abstracto
  //public String muestraDatos();

  //Método constructor:
  public Poligono(int numeroLados){
    this.numeroLados = numeroLados;
  }

  //Método getter:
  public int getLados(){
    return numeroLados;
  }

  @Override
  public String toString(){
      return  "" + numeroLados + "";
  }

}
