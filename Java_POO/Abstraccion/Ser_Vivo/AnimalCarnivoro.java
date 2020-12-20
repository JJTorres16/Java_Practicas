/*
* La clase AnimalCarnivoro hereda de Animal. Se de implementar el método abstracto Alimentarse
*/

public class AnimalCarnivoro extends Animal {

    @Override
    public void Alimentarse(){
      System.out.println("El animal carnivoro se alimenta con carne");
    }

}
