package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class NotaEntreZeroEDez {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    boolean notaValida = false;

    do {
      System.out.println("Informe uma nota: ");
      double nota = scan.nextDouble();

      if (nota >= 0 && nota <= 10) {
        notaValida = true;
        System.out.println("Você digitou: " + nota);
      } else {
        // notaValida = false;
        System.out.println("Nota iválida. Digite novamente!");
      }
    } while (!notaValida);
  }
}
