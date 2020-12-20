/*
* Un maestro va al banco "Unidos por México" y desea saber cuánto dinero se genera por concepto
* de intereses sobre la cantidad que tiene invertida en el banco. El decidirá reinvertir los intereses
* siempre y cuando estos excedan los $7000. En caso de que sea favorable, desea saber cuando dinero tendrá
* al finalizar el plazo de su inversión; de lo contrario, el programa muestra que no es factible la inversión.
*/

public class Intereses{
  //Atributos de la clase

  //Métodos de la clase:
  public String calculo_intereses(double dinero, double intereses)
  {
    //Declaración delas variables
    String msj = ""; //El mensaje que se mostrará al final.
    double capital = 0.0; //La cantidad de dinero incial.
    double ganancia = dinero*intereses; //El cálculo de las ganancias.

    if (ganancia > 7000){
      capital = ganancia + dinero; //Calculamos la ganancia
      msj = "Felicidades, su inversion tuvo una ganancia de: " + ganancia + ". \nEl total de su capital sera: " + capital;
    } else {
      msj = "Le inversion no obtuvo mas de $7000";
    }

    return msj;
  }
}
