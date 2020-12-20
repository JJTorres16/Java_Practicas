public class VehiculoTurismo extends Vehiculo {

  //Atributos propios de la clase VehiculoTurismo:
  private int noPuertas;

  /******* Métodos de la clase VehicloTurismo ********/
  public VehiculoTurismo(String matricula, String marca, String modelo, int noPuertas){
    super(matricula, marca, modelo);
    this.noPuertas = noPuertas;
  }

  //Método getter:
  public int getNoPuert(){
    return noPuertas;
  }

  @Override
  public String mostrarDatos(){
    return "La matricula del vehiculo es: " + matricula + "\nLa marca del vehiculo es: " + marca +
      "\nEl modelo del vehiculo es: " + modelo + "\nEl numero de puertas del vehiculo: " + noPuertas;
  }

}
