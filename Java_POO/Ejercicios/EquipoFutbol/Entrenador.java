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

public class Entrenador extends Persona{

  //Atributos de la clase Entrenador:
  private String estrategia;

  //Método constructor:
  public Entrenador (String nombre, String apellido, String edad){
    super(nombre, apellido, edad);
    this.estrategia = "";
  }

  //Método toString
  @Override
  public String toString(){
    return super.toString() + "\nCargo: Entrenador";
  }

  //Método para elegir la estrategia:
  @Override
  public String Entrenamiento(){
    return haceEstrategia();
  }

  @Override
  public String enPartido(){
    return haceEstrategia();
  }

  @Override
  public String lesion(){
    return "El entreandor: " + nombre + " " + apellido + " no podra disponer de los jugadores lesionados";
  }

  @Override
  public String entrevista(){
    return "El entreandor: " + nombre + " " + apellido + " va a entrevistar a los jugadores aspirantes";
  }

  public String haceEstrategia(){
    int opcion;
    char opcion_forma = '\u0000';
    String formacion = "";

    do {

      opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el estilo de juego: \n[1] Ofensivo \n[2] Equilibrado \n[3] Defensivo"));

        if (opcion < 1 || opcion > 3) {
          JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelva a intenar con una opción válida");
        }

    } while (opcion < 1 || opcion > 3);

    switch (opcion) {

      case 1:
        estrategia = estrategia + "Estilo de juego: Ofensivo";
        break;
      case 2:
        estrategia = estrategia + "Estilo de juego: Equilibrado";
        break;
      case 3:
        estrategia = estrategia + "Estilo de juego: Defensivo";

    }

      while (opcion_forma != 's' && opcion_forma != 'S'){

        formacion = JOptionPane.showInputDialog("Ingrese la formacion de juego: ");
        opcion_forma = '\u0000';

         while (opcion_forma != 's' && opcion_forma != 'S' && opcion_forma != 'n' && opcion_forma != 'N'){
           opcion_forma = (JOptionPane.showInputDialog("Ha ingresado la formacion: " + formacion + "\nDesea guardar esta informacion? Digite [s] para 'si' o digite [n] para volver a ingresar una formacion.")).charAt(0);
         }

      }
        return estrategia + ". Se jugara con una formacion: " + formacion;
  }
}
