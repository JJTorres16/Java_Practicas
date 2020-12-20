/*
* En una relación de tipo herencia, un objeto de la super clase puede almacenar un objeto
* cualquiera de sus subclases.
*/

public class Vehiculo {

  //Atributos de la clase Vehciulos -> Atributos protected
  protected String matricula;
  protected String marca;
  protected String modelo;

  /****** Métodos de la clase Vehiculo ******/

  //Método constructor:
  public Vehiculo (String matricula, String marca, String modelo){
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
  }

  /************** Métodos getter **************/
  public String getmatricula(){
    return matricula;
  }

  public String getMarca(){
    return marca;
  }

  public String getModelo(){
    return modelo;
  }
/**********************************************************/

  public String mostrarDatos(){
    return "La matricula del vehiculo es: " + matricula + "\nLa marca del vehiculo es: " + marca +
      "\nEl modelo del vehiculo es: " + modelo;
  }

}
