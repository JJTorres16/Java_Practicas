/*
* En una conocida tienda vendedora de llantas para automoviles se desea implementar un programa para calcular
* el total que una persona debe pagar por su compra en cualquiera de estos casos: cuando hay una oferta o promoción
* el precio de cada llanta es de $800 o más si compran menos de tres llantas y de $600 si se compran tres o más
* llantas en el tamaño de 13 pulgadas. Para el caso del tamaño de 14 pulgadas, el precio de cada llanta es de $900
* o más si se compran menos de tres llantas y de $800 se se compran tres o más. Si la marca es "patito" se hace un
* descuento adicional del 5%. Cuando es temporada normal el precio es de $950 para las llantas de 13 pulgadas y default:
* $1200 para las de  14 pulgadas.
*/

public class Llanta {

//Atributos de la clase llanta
/***********************************/

/***** Métodos de la clase Llanta *****/

//Método constructor (con sobrescritura de métodos):

  public Llanta (int cantidad, int medida){

    double precio = 0;

    if (cantidad >= 3 && medida == 13){
      precio = (double)cantidad*600.0;
      System.out.println("El total a pagar es: " + precio);
    }

      else if (cantidad < 3 && medida == 13) {
        precio = (double)cantidad*800.0;
        System.out.println("El total a pagar es: " + precio);
      }

        else if (cantidad >= 3 && medida == 14) {
          precio = (double)cantidad*800.0;
          System.out.println("El total a pagar es: " + precio);
        }

          else if (cantidad < 3 && medida == 14) {
            precio = (double)cantidad*900.0;
            System.out.println("\nEl total a pagar es: $" +  precio);
          }

           else {
              System.out.println("No se ingresó una medida registrada.");
           }

    }


    //El segundo método constructor
    public Llanta(int cantidad, int medida, String marca){

      double precio = 0.0;
      //float descuento;
      //float total;

        if (cantidad >= 3 && medida == 13) {
            precio = (double)cantidad*600.0;
        }
          else if (cantidad < 3 && medida == 13) {
              precio = (double)cantidad*800.0;
          }
            else if (cantidad >= 3 && medida == 14) {
              precio = (double)cantidad*800.0;
            }
              else if (cantidad >= 3 && medida == 14) {
                precio = (double)cantidad*900.0;
              }

                if (marca == "patito") {
                  precio = precio*0.95;
                }

                //Imprimos el resultado:
                System.out.println("\nEl total a pagar es: $" + precio);

      }

      /*public Llanta(int cantidad, int medida, String temporada, String marca){

        double precio = 0.0;

          if (medida == 14) {
            precio = (double)cantidad*1200;
            System.out.println("El total a pagar es: " +  precio);
          } else {
            precio = (double)cantidad*950;
            System.out.println("El total a pagar es: " +  precio);
          }

      }*/
  }
