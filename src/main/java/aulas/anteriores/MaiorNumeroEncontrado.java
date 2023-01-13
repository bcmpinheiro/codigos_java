package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class MaiorNumeroEncontrado {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int num;
    int maior = Integer.MIN_VALUE;

    for (int indice = 0; indice < 5; indice++) {
      System.out.println("Entre com um numero: ");
      num = scan.nextInt();

      if (num > maior) {
        maior = num;
        System.out.println("O numero maior mudou: " + maior);
      }
      System.out.println("O maior numero é o: " + maior);
    }
  }
}
