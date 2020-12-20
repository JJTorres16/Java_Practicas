public class VehiculoFurgoneta extends Vehiculo{

  //Atributos de la clase VehiculoFurgoneta:
  private int carga;

  /************ Métodos de la clase VehiculoFurgoneta ************/
  public VehiculoFurgoneta (String matricula, String marca, String modelo, int carga){
    super(matricula, marca, modelo);
    this.carga = carga;
  }

  //Método getter:
  public int getCarga(){
    return carga;
  }

  //Método para mostrar datos:
  @Override
  public String mostrarDatos(){
    return "La matricula del vehiculo es: " + matricula + "\nLa marca del vehiculo es: " + marca +
      "\nEl modelo del vehiculo es: " + modelo + "\nLa carga del vehiculo: " + carga;
  }
}
