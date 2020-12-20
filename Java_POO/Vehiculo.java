/*
* Construir un programa que dada una serie de vehículos caracterizados por su marca,
* modelo y precio, imprima las propiedades del vehículo más barato. Para ello, se deberán
* leer por taclado las caracteristicas de cada vehículo y crear una clase que represente a
* cada uno de ellos.
*/

public class Vehiculo {

  //Atributos:
  private String marca = "";
  private String modelo = "";
  private float precio = 0.0f;

  public Vehiculo(String marca, String modelo, float precio){
    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;
  }

  public float getPrecio(){
    return precio;
  }

  public String mostrarDatos(){
    return "Marca:" + marca + ", Modelo:" + modelo + ", Precio:" + precio + "\n";
  }
}
