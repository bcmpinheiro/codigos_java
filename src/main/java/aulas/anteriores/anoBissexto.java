package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class anoBissexto {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um ano aleatório e vamos informar se é um ano bissexto: ");
    int ano = scan.nextInt();

    if ((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)) {
      System.out.println("é um ano bissexto!");
    } else {
      System.out.println("não é um ano bissexto.");
    }

  }

}
