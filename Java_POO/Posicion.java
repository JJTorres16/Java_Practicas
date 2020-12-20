public class Posicion {

  //Atributo de la clase:
  private int ejeX;
  private int ejeY;

  //Métodos de la clase:
  //Método constructor:
  public Posicion (int ejeX, int ejeY){
    this.ejeX = ejeX;
    this.ejeY = ejeY;
  }

  //Mover el objeto hacia arriba. El eje Y aumenta en uno.
  public int Arriba(){
    ejeY = ejeY + 1;
    return ejeY;
  }

  //Mover el objeto hacia arriba. El eje Y disminuye en uno.
  public int Abajo(){
    ejeY = ejeY - 1;
    return ejeY;
  }

  //Mover el objeto hacia arriba. El eje X aumenta en uno.
  public int Izquierda(){
    ejeX = ejeX - 1;
    return ejeX;
  }

  //Mover el objeto hacia arriba. El eje X disminuye en uno.
  public int Derecha(){
    ejeX = ejeX + 1;
    return ejeY;
  }

  //Recuperamos la posición actual del Eje X.
  public int getEjeX(){
    return ejeX;
  }

  //Recuperamos la posición actual del Eje Y.
  public int getEjeY(){
    return ejeY;
  }

}
