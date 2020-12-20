/*La clase principal*/

public class Main {

  public static void main (String[] args){

    //Hacemos un arreglo de la clase Vehiculo
    Vehiculo misVehiculos[] = new Vehiculo[4];

    misVehiculos[0] = new Vehiculo ("XYS34", "Volkswagen", "Jetta");
    misVehiculos[1] = new VehiculoTurismo("AVF76", "Ford", "Fiesta", 4);
    misVehiculos[2] = new VehiculoDeportivo("AJK12", "Ferrari", "A89", 500);
    misVehiculos[3] = new VehiculoFurgoneta("LKU90", "Toyota", "J9", 2000);

    for(Vehiculo vehiculos: misVehiculos){
      System.out.println(vehiculos.mostrarDatos());
      System.out.println(" ");
    }

  }

}
