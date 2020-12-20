//Encapsulamiento y métodos accesores (Geters y Seters):

public class Clase1{
  //Atributos de la clase Clase1:
  private int edad;
  private String nombre;

  //Métdodos de la clase:
  //Método Setter: Establecemos la edad.
  public void setEdad(int _edad){
    edad = _edad;
  }

  //Método Getter:  Obtenemos la edad.
  public int getEdad(){
    return edad;
  }

  //Método Setter: Establecemos el nombre.
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  //Método Getter: Obtenemos el nombre.
  public String getNombre(){
    return nombre;
  }
}
