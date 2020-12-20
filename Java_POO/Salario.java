/*
* Calcular el salario semanal de una persona. Este se obtiene de la siguiente manera:
* Si se trabaja 40 horas o menos se paga $16 la hora.
* Si se trabaja más de 40 horas se pagan se pagan $16 por cada una de las 40 horas y $20 por cada hora extra.
*/

public class Salario {
  //No hay Atributos de la clase Salario.

  //Método de la clase salario:

  public int calcula_salario (int horas){
    int h_ext = 0; //Creamos dos variables, una para las horas extra (h_ext) y otra para el salario (salario).
    int salario = 0;

    if(horas > 40){ //Condición por si se trabaja más de 40 horas.
      h_ext = horas - 40; // Obtenemos las horas extras restando el total de horas trabajadas menos cuarenta, que son las fijas.
      salario = (40*16) + (h_ext*20);
    } else {
      salario = horas * 16;
    }

    return salario;
  }
}
