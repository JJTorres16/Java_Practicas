public class VehiculoDeportivo extends Vehiculo {

  //Atributos de la clase VehiculoDeportivo
  private int cilindrada;

  /********** Métodos de la clase VehiculoDeportivo **********/

  //Método constructor:
  public VehiculoDeportivo (String matricula, String marca, String modelo, int cilindrada){
    super(matricula, marca, modelo);
    this.cilindrada = cilindrada;
  }

  //Método getter:
  public int cilindrada(){
    return cilindrada;
  }

  //Método para mostrarDatos:
  @Override
  public String mostrarDatos(){
    return "La matricula del vehiculo es: " + matricula + "\nLa marca del vehiculo es: " + marca +
      "\nEl modelo del vehiculo es: " + modelo + "\nLa cilindrada del vehiculo: " + cilindrada;
  }
}
