package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class GeradorTabuada {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com o número para gerar a Tabuada: ");
    int num = scan.nextInt();

    System.out.println("Tabuada de " + num + ":");

    for (int indice = 1; indice <= 10; indice++) {
      System.out.println(num + " x " + indice + " = " + (num * indice));
    }
  }
}
