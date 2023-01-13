package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class NumerosInteiros {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com o primeiro numero: ");
    int num01 = scan.nextInt();
    System.out.println("Entre com o segundo numero: ");
    int num02 = scan.nextInt();

    for (int indice = num01; indice <= num02; indice++) {
      System.out.println(indice);
    }
  }
}
