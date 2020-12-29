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

public class Medico extends Persona {

  //Atributos de la clase Medico:
  private String titulacion;
  private String anios_exp;

  //Método constructor:
  public Medico(String nombre, String apellido, String edad, String titulacion, String anios_exp){
    super(nombre, apellido, edad);
    this.titulacion = titulacion;
    this.anios_exp = anios_exp;
  }

  //Métodos getter
  public String getTitulacion(){
    return titulacion;
  }

  public String getAnios_exp(){
    return anios_exp;
  }


  //Método to String:
  @Override
  public String toString(){
    return super.toString() + "\nCargo: medico del equipo con especialidad en " + titulacion + "\nTiempo de expereciencia: " + anios_exp;
  }

  @Override
  public String Entrenamiento(){
    return "";
  }

  @Override
  public String enPartido(){
    return "";
  }

  @Override
  public String lesion(){
    return "El medico con especialidad en " + titulacion + ": " + nombre + " " + apellido + " atendera la lesion de los jugadores";
  }

  @Override
  public String entrevista(){
    return "";
  }
}
