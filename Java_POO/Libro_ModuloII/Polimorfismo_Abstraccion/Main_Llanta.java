import java.util.Scanner;

public class Main_Llanta {

    public static void main(String[] args) {

        //Atributos de la clase Main_Llanta
        Scanner entrada = new Scanner(System.in);
        int control = 0;
        int control_inch;
        int inch = 0;
        int cantidad;
        int control_marca;
        String marca = "";

        /************ Se desea saber si se requiere compra normal o compra de marca ************/

        while(control > 2 || control == 0 ){
            System.out.println("\nIngrese la compra de la cual quiera saber su precio:\n");
            System.out.println("[1] Compra normal. \n[2] Compra de marca.");
            System.out.print("Que desea? "); control = entrada.nextInt();

            if (control > 2 || control == 0 )
              System.out.println("Se ingreso un tipo incorrecto");
        }

        /************ La cantidad y medidas de las llantas ************/

        while(inch == 0){
              System.out.println("\nDe que medida desea las llantas?");
              System.out.print("\n[1] Llantas de 13 pulgadas. \n[2] Llantas de 14 pulgadas.\nQue medida desea? ");
              control_inch = entrada.nextInt();

              inch = (control_inch == 1) ? 13 : (control_inch == 2) ? 14 : 0;

              if (inch == 0){
                System.out.println("\nSe ingreso una medida incorrecta, vuelva a intentar.\n");
              }
       }

        System.out.println("\nIngrese la cantidad de llantas que desea comprar: "); cantidad = entrada.nextInt();

        switch (control) {

          case 1:
              Llanta objLlanta_1 = new Llanta(cantidad, inch);
              break;
          case 2:
              while(marca == ""){
                  System.out.print("\nIngrese si la compra es de marca o de marca patito. \n[1] Marca original.\n[2] Marca 'patito'. \nQue desea? ");
                  control_marca = entrada.nextInt();
                  marca = (control_marca == 1) ? "original" : (control_marca == 2) ? "patito" : "";

                  if (marca == "") {
                      System.out.println("\nSe ingreso una marca no valida, vuelva a intentar.\n");
                  }
              }

                  Llanta objLlanta_2 = new Llanta(cantidad, inch, marca);

        }

  }
}
