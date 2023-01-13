package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class maiorNumero {
  // pede dois números e imprime o maior deles.
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    int numero01 = scan.nextInt();
    System.out.println("Digite o segundo número: ");
    int numero02 = scan.nextInt();

    if (numero01 > numero02) {
      System.out.println("O maior número digitado foi o primeiro: " + numero01);
    } else {
      System.out.println("O maior número digitado foi o segundo: " + numero02);
    }
  }
}
