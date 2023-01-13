package src.main.java.aulas.anteriores;

import java.util.Random;

public class ForEach {

  public static void main(String[] args) {

    int[] notas = new int[10];

    Random ramdon = new Random();

    for (int i = 0; i < notas.length; i++) {

      notas[i] = ramdon.nextInt(10);

    }

    for (int i = 0; i < notas.length; i++) {
      // int nota = nota[i];
      // System.out.print(nota);
      System.out.print(notas[i] + " ");
    }
    System.out.println();

    System.out.println("Usando o for each");
    for (int nota : notas) {
      System.out.print(nota + " ");
    }
  }
}
