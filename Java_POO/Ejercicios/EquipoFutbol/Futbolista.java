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

import javax.swing.JOptionPane;

public class Futbolista extends Persona{

  //Atributos de la clase futbolista
  private String dorsal;
  private String posicion;

  //Método constructor de la clase Futbolista:
  public Futbolista(String nombre, String apellido, String edad, String dorsal, String posicion){
    super(nombre,apellido,edad);
    this.dorsal = dorsal;
    this.posicion = posicion;
  }

  //Métodos getter
  public String getDorsal(){
    return dorsal;
  }

  public String getPosicion(){
    return posicion;
  }


  //Método toString
  @Override
  public String toString(){
    return super.toString() + "\nCargo: Futbolista\nPosicion: " + posicion + "\nDorsal: " + dorsal;
  }

  @Override
  public String Entrenamiento(){
    return "El futbolista " + nombre  + " " + apellido + " entrena las jugadas de " + posicion + " elaboradas por su entrenador";
  }

  @Override
  public String enPartido(){
    return "Nombre: " + nombre + " " + apellido + "\nPosicion: " + posicion + "\nDorsal: " + dorsal + "\n";
  }

  @Override
  public String lesion(){
    return "El jugador: " + nombre + " " + apellido + " se ha lesionado y no podra jugar durante algunos juegos";
  }

  @Override
  public String entrevista(){
    return "El jugador: " + nombre + " " + apellido  + " de " +  edad + " de edad. Se presento a una entrevista para el puesto de: " + posicion;
  }

}
