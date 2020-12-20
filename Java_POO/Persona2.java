public class Persona2 {
  //Atributos de la clase:
  String nombre;
  int edad;
  String DNI;

  //Métodos de la clas Persona2:
  public Persona2 (String _nombre, int _edad){
    nombre = _nombre;
    edad = _edad;
  }

  public Persona2(String _DNI){
    DNI = _DNI;
  }

  public void correr(){
    System.out.println("Soy " + nombre + " tengo " + edad + " años; y estoy corriendo una mataron.");
  }

  public void correr(int km){
    System.out.println("He corrido "+ km + " kilometros");
  }
}
