/*
* Crear un programa para simular un equipo de futbol (futbolista, entrenador, doctor), para lo cual tendremos lo siguiente:
*
* - Una super clase Persona, que tendrá los siguientes datos: nombre, apellido y edad.
* - Una subclase Futbolista, con los siguientes datos: dorsal y posición.
* - Una subclase Entrenador con la estrategía que va a utiliar.
* - Una subclase Doctor, con la titulación y los años de expereciencia:
*
* Hacer un menú donde se tengan las siguientes opciones: Viaje de equipo, entrenamiento, partido de futbol, planificar entrenamiento, entrevista
* y curar lesión.
*/

public abstract class Persona {

  protected String nombre;
  protected String apellido;
  protected String edad;

  //Método constructor de la clase persona:
  public Persona(String nombre, String apellido, String edad){
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
  }

  //Métodos getter:
  public String getNombre(){
    return nombre;
  }

  public String getApellido(){
    return apellido;
  }

  public String getEdad(){
    return edad;
  }

  //Método para devolver los datos:
  @Override
  public String toString(){
    return "Nombre del integrante: " + nombre + " " + apellido + "\nEdad: " + edad;
  }

  public abstract String Entrenamiento();
  public abstract String enPartido();
  public abstract String lesion();
  public abstract String entrevista();
}
