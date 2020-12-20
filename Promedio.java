public class Promedio {
  public static void main (String args []){
    int mat = 5;
    int hist = 5;
    int esp = 6;
    int geo = 7;

    int promedio = (mat + hist + esp + geo)/4;

      if (promedio >= 6) {
        System.out.println("El alumno pasa con una calificacion de " + promedio);
      }
      else {
        System.out.println("El alumno no pasa.");
      }
  }
}
