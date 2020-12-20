/*
* La clase Planta hereda de SerVivo, y al ser SerVivo clase abstracta, entonces también se debe colocar
* el método Alimentarse.
*/

public class Planta extends SerVivo {

  @Override
  public void Alimentarse () {
    System.out.println("La planta se alimenta por medio de la fotosintesis.");
  }

}
