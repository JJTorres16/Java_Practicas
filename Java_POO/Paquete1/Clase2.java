public class Clase2{

  public static void main(String args []){
    Clase1 objeto1 = new Clase1();

    /*objeto1.edad = 23; -> esto no se puede hacer pues edad es 'private', está encapsulado.*/

    //Establecemos y obtenemos la edad:
    objeto1.setEdad(23);
    System.out.println("La edad de la persona es: " + objeto1.getEdad());

    //Establecemos y obtenemos el nombre:
    objeto1.setNombre("Julian Torres");
    System.out.println("El nombre de la persona es: "+ objeto1.getNombre());

  }
}
