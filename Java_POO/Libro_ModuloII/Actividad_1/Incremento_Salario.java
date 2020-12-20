/*
* Hacer un programa que calcule el nuevo salario de un obrero si obtuvo un incremento del 25%
* sobre su salario anterior y que lo imprima en la pantall.
*/

public class Incremento_Salario{

  //Métodoso de la clase Incremento_Salario
  public double incremento (double i){
    double new_salario;

    new_salario = Math.floor(i*1.25*100)/100;

    return new_salario;
  }
}
