/*
* Clase Padre (súper clase) es Persona. Clase Hija (Sub clase) es Estudiante
*/

public class Estudiante extends Persona {
  String codigoEstudiante;
  double notaFinal;

  //Constructor de la clase Estudiante
  public Estudiante (String nombre, String apellido, int edad, String codigoEstudiante, double notaFinal){
    super(nombre, apellido, edad); //Estos atributos fueron inicializados en la clase padre, y por lo tanto se coloca de esta mander para que Java sepa que ya fueron inicializados.

    this.codigoEstudiante = codigoEstudiante;
    this.notaFinal = notaFinal;
  }

  //Los demás métodos no se colocan, pues se heredan directo de la clase Padre
  public void mostrarDatos(){
    System.out.println("\nNombre del estudiante: " + getNombre() + " " + getApellido());
    System.out.println("Edad del estudiante: " +  getEdad());
    System.out.println("Codigo del estudiante: " + codigoEstudiante + "\nNota final del estudiante: " + notaFinal);
  }
}
