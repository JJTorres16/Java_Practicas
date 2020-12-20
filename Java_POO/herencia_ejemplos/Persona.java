/*
* Clase Padre (súper clase) es Persona. Clase Hija (Sub clase) es Estudiante
*/

public class Persona {

  //Atributos de la clase persona
  private String nombre;
  private String apellido;
  private int edad;

  public Persona (String nombre, String apellido, int edad){
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
  }

  public String getNombre(){
    return nombre;
  }

  public String getApellido(){
    return apellido;
  }

  public int getEdad(){
    return edad;
  }
}
