/*
* Se requiere un programa que genere de forma aleatoria un password para asignarlo a cada usuario que se
* registre en un sistema, bajo las siguientes condiciones: que tenga los atributos longitud y contraseña.
* Tendrá un constructor por defecto con un parámetro de entrada, que será la longitud que nosotros le pasemos
* esto generará una contraseña aleatoria con esa longitud.
*/

public class Password_ {
  //Declaración de los atributos con encapsulamiento 'private':
  private int longitud;
  private String password;

  //Método constructor
  public Password_ (int longitud){
    this.longitud = longitud;
    password = generaPassword(); //Genera password es un método que se llama dentro de la misma clase Password_

    System.out.println("El password generado es: " + password);

    if (esFuerte()){
      System.out.println("El password es segura.");
    } else {
      System.out.println("El password es debil");
    }
  }

  public String generaPassword(){
    String _password = "";
    for (int i = 0; i<longitud; i++){
      //Generamos un número aleatorio
      Integer eleccion = ((int)Math.floor(Math.random()*5+1));
      _password = _password + eleccion.toString(); //Convertimos el número entero a un String
    }

    return _password; //Al regresar _password, que es la variable que almacena los números aleatorios, en password se pasa el valor de _password.
  }

  public boolean esFuerte(){
    int cuentaNumeros = 0;
    for (int i = 0; i<password.length(); i++){
      cuentaNumeros = cuentaNumeros + 1;
    }

    if (cuentaNumeros>=5){
      return true;
    } else {
      return false;
    }
  }
}
