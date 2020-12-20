public class Estatico {
  //Atributos de la clase Estatico:
  //private String frase = "Primera frase"; //Cada objeto hace una copia de este atributo. Cada copia es independiente y le pertenece a cada objeto.
  private static String frase = "Primera frase"; //Ahora es 'static'. Los objetos copian este atributo, pero ahora no les pertenece a ellos
                                                 //les pertenece a la clase.

  public static int sumar(int n1, int n2){ //Lo mismo, esto ya no le pertenece al objeto, le pertenece a la clase.
    int suma = n1 + n2;
    return suma;
  }

  public static void main(String args []){
    /*Estatico ob1 = new Estatico();
    Estatico ob2 = new Estatico();

    ob2.frase  = "segunda frase"; //Accedemos al atribto de la clase. El objeto ob2 ahora es propietario de ese atributo.
                                  //Ahora, si el atributo es 'static'; al cambiar el atribto en un objeto, cambia en todos los objetos.

    System.out.println(ob1.frase);//En mabos se imprime: "Segunda frase, que es el cambio que se hizo en el objeto ob2"
    System.out.println(ob2.frase);*/

    //Al ser un atributo estático ya no es necesario instanciar objetos, se puede llamar desde la clase Estatico
    System.out.println(Estatico.frase);//De un atribto estático, así se puede llamar, en lugar del objeto usar la clase.
    System.out.println("La suma es: " + Estatico.sumar(3,4));
  }
}
