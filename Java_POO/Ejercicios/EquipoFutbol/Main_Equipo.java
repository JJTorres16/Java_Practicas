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
import java.util.ArrayList;

public class Main_Equipo{

  static int opcion;
  static String integrante;
  static int[] participantes = {0,1,0};
  static ArrayList<Persona> equipo = new ArrayList<Persona>();

  //Varibles comunes de objetos
  static String nombre;
  static String apellido;
  static String edad;

  public static void main(String[] args) {

    do {
      opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija alguna de las siguientes opciones: \n[1] Viaje de equipo \n[2] Entrenamiento \n[3] Partido de futbol"
                                            + "\n[4] Planificar entrenamiento \n[5] Entrevista \n[6] Curar lesion"));
    } while (opcion < 1 || opcion > 6);

    switch (opcion) {
      case 1:
          viajeEquipo();
          mostrar(opcion);
          break;
      case 2:
          Entrenamiento();
          mostrar(opcion);
          break;
      case 3:
          JOptionPane.showMessageDialog(null, Partido());
          mostrar(opcion);
          break;
      case 4:
        JOptionPane.showMessageDialog(null, planificarEntrenamiento());
          break;
      case 5:
          entrevistaJugador();
          mostrar(opcion);
          break;
      case 6:
          curarLesion();
          mostrar(opcion);
          break;
    }


  }

  public static void viajeEquipo(){

    participantes[0] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de juadores que acudiran al viaje"));

      for (int i = 0; i<participantes[0]; i++ ) {
        rellenaJugador(i);
      }

          for (int i = 0; i < participantes[1]; i++ ) {
              rellenaEntrenador(i);
            }

                  participantes[2] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de medicos que acudiran al viaje"));

                      for (int i=0; i<participantes[2]; i++) {
                          rellenaMedico(i);
                        }

  }

  public static void Entrenamiento(){
    for (int i = 0; i < participantes[1]; i++ ) {
        rellenaEntrenador(i);
      }
      participantes[0] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de juadores que participan en el entrenamiento"));
      for (int i = 0; i<participantes[0]; i++ ) {
        rellenaJugador(i);
      }
  }


  public static String Partido(){
    String juego_estrategia;
    for (int i = 0; i < participantes[1]; i++ ) {
        rellenaEntrenador(i);
      }
        juego_estrategia = equipo.get(0).enPartido();
        equipoTitular();
      return juego_estrategia;
  }


  public static String planificarEntrenamiento(){
    for (int i = 0; i < participantes[1]; i++ ) {
        rellenaEntrenador(i);
      }
      return "El entrenador: " + equipo.get(0).getNombre() + " " + equipo.get(0).getApellido() + " ha planeado la siguiente jugada: \n" + equipo.get(0).Entrenamiento();
  }


  public static void entrevistaJugador(){
    participantes[0] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de jugadores a entrevistar"));
      for (int i = 0; i<participantes[0]; i++) {
          rellenaJugador(i);
        }
        rellenaEntrenador(1);
  }

  public static void curarLesion(){
    participantes[0] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de jugadores lesionados"));
    participantes[2] = 1;

        for (int i = 0; i<participantes[0]; i++) {
            rellenaJugador(i);
        }
          rellenaMedico(0);
  }

  /******************** Método para rellenar un jugador ********************/

  public static void rellenaJugador(int i){

    //Varibles para los objetos:
     String posicion=""; String dorsal;
     int control_pos;

    nombre = JOptionPane.showInputDialog("Digite el nombre del jugador " + (i+1) + ":");
    apellido = JOptionPane.showInputDialog("Digite el apellido del jugador " + (i+1) + ":");
    edad = JOptionPane.showInputDialog("Digite la edad del jugador " + (i+1) + ":");

    do {
      control_pos = Integer.parseInt(JOptionPane.showInputDialog("Elija la posicion en la que juega el jugador: \n[1] Portero \n[2] Defensa"
                                                                + "\n[3] Mediocampista \n[4] Delantero"));
    } while (control_pos < 1 || control_pos > 4);


    switch (control_pos) {
      case 1:
          posicion = "Portero";
          break;
      case 2:
          posicion = "Defensa";
          break;
      case 3:
          posicion = "Mediocampista";
          break;
      case 4:
          posicion = "Delantero";
          break;
    }

    dorsal = JOptionPane.showInputDialog("Ingrese el dorsal del jugador: ");

    //Inicializamos un objeto de la clase Futbolista:
    Futbolista jugador = new Futbolista(nombre, apellido, edad, dorsal, posicion);

    equipo.add(jugador);
  }

  /******************** Método para rellenar un entrenador ********************/

  public static void rellenaEntrenador(int i){

    nombre = JOptionPane.showInputDialog("Digite el nombre del entrenador " + (i+1) + ":");
    apellido = JOptionPane.showInputDialog("Digite el apellido del entrenador " + (i+1) + ":");
    edad = JOptionPane.showInputDialog("Digite la edad del entrenador " + (i+1) + ":");

    //Inicializamos un objeto de la clase Futbolista:
    Entrenador dt = new Entrenador(nombre, apellido, edad);
    equipo.add(dt);

  }

  /******************** Método para rellenar un médico ********************/

  public static void rellenaMedico(int i){

    String titulacion; String anios;
    String crew_viaje = "";

    nombre = JOptionPane.showInputDialog("Digite el nombre del medico " + (i+1) + ":");
    apellido = JOptionPane.showInputDialog("Digite el apellido del medico " + (i+1) + ":");
    edad = JOptionPane.showInputDialog("Digite la edad del medico " + (i+1) + ":");
    titulacion = JOptionPane.showInputDialog("Digite la especialidad del medico " + (i+1) + ":");
    anios = JOptionPane.showInputDialog("Digite el tiempo de expereciencia del medico " + (i+1) + ":");

    //Inicializamos un objeto de la clase Futbolista:
    Medico med = new Medico(nombre, apellido, edad, titulacion, anios);
    equipo.add(med);

  }

  public static void mostrar(int control_mostrar){

    switch (control_mostrar) {
      case 1:
      JOptionPane.showMessageDialog(null, "Los integrantes del viaje de equipo son: \n");
          for (Persona crew: equipo) {
            JOptionPane.showMessageDialog(null, crew.toString() + "\n");
          }
          break;

      case 2:
          JOptionPane.showMessageDialog(null, "En el entrenamiento participan: \n");
          for (Persona crew: equipo) {
            JOptionPane.showMessageDialog(null, crew.Entrenamiento() + "\n");
          }
          break;
      case 3:
          JOptionPane.showMessageDialog(null, "Nombres de los jugadores del cuadro titular: \n");
          for (int i = 1; i<equipo.size(); i++) {
            JOptionPane.showMessageDialog(null, equipo.get(i).enPartido() + "\n");
          }
          break;
      case 5:
          JOptionPane.showMessageDialog(null, "Se van a entrevistar a los siguientes jugadores: ");
          for (Persona crew: equipo) {
            JOptionPane.showMessageDialog(null, crew.entrevista() + "\n");
          }
          break;
      case 6:
          JOptionPane.showMessageDialog(null, "Informacion acerca de las lesiones");
          for (Persona crew: equipo) {
            JOptionPane.showMessageDialog(null, crew.lesion() + "\n");
      }
    }
  }

  //Método para rellenar jugadores "Providencial para ahorrar tiempo":
  public static void equipoTitular(){

    Futbolista jugador1 = new Futbolista("Julian", "Torres", "23", "1", "Portero");
    equipo.add(jugador1);

    Futbolista jugador2 = new Futbolista("William", "Tesillo", "29", "16", "Defenesa");
    equipo.add(jugador2);

    Futbolista jugador3 = new Futbolista("Andres", "Mosquera", "30", "4", "Defenesa");
    equipo.add(jugador3);

    Futbolista jugador4 = new Futbolista("Nacho", "Gonazalez", "34", "44", "Defenesa");
    equipo.add(jugador4);

    Futbolista jugador5 = new Futbolista("Fernando", "Navarro", "31", "12", "Defenesa");
    equipo.add(jugador5);

    Futbolista jugador6 = new Futbolista("Ivan", "Ochoa", "23", "27", "Mediocampista");
    equipo.add(jugador6);

    Futbolista jugador7 = new Futbolista("Luis", "Montes", "34", "10", "Mediocampista");
    equipo.add(jugador7);

    Futbolista jugador8 = new Futbolista("Jorge", "Meneses", "25", "13", "Delantero");
    equipo.add(jugador8);

    Futbolista jugador9 = new Futbolista("Nicolas", "Sosa", "24", "16", "Delantero");
    equipo.add(jugador9);

    Futbolista jugador10 = new Futbolista("Angel", "Mena", "32", "15", "Delantero");
    equipo.add(jugador10);

    Futbolista jugador11 = new Futbolista("Emanuel", "Giglioti", "33", "20", "Delantero");
    equipo.add(jugador11);
  }

}
