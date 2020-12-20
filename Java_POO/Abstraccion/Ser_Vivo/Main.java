public class Main {

  public static void main (String[] args){

      /*Instanciamos objetos en las clases*/
      Planta planta = new Planta();
      AnimalCarnivoro tigre = new AnimalCarnivoro();
      AnimalHerbivoro ciervo = new AnimalHerbivoro();

      /*Implementamos el método Alimentarse en cada objeto*/
      planta.Alimentarse();
      tigre.Alimentarse();
      ciervo.Alimentarse();

  }

}
