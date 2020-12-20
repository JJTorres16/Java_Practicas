public class Persona{
  //Atributos de la clase persona:
  String nombre;
  int edad;

  //Métodos de la clas Persona:
  //Se declara el método constructor:
  public Persona(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
  }

  public void mostrarDatos(){
    System.out.println("El nombre es: " + nombre);
    System.out.println("La edad es: " + edad);
  }
}
