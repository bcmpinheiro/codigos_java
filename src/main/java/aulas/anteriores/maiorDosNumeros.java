package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class maiorDosNumeros {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    int numero01 = scan.nextInt();
    System.out.println("Digite o segundo número: ");
    int numero02 = scan.nextInt();
    System.out.println("Digite o terceiro número: ");
    int numero03 = scan.nextInt();

    if ((numero01 > numero02) && (numero01 > numero03)) {
      System.out.println("O primeiro número é o maior numero digitado! Que é o número: " + numero01);
    } else if ((numero02 > numero03) && (numero02 > numero01)) {
      System.out.println("O segundo número é o maior numero digitado! Que é o número: " + numero02);
    } else if ((numero03 > numero01) && (numero03 > numero02)) {
      System.out.println("O terceiro número é o maior numero digitado! Que é o número: " + numero03);
    }
  }
}
