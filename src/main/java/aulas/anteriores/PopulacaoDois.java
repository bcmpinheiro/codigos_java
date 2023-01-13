package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class PopulacaoDois {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o valor da primeira população: ");
    int popA = scan.nextInt();
    System.out.println("Digite o valor da segunda população: ");
    int popB = scan.nextInt();
    System.out.println("Digite o valor da primeira taxa de crescimento: ");
    int taxaA = scan.nextInt();
    System.out.println("Digite o valor da segunda taxa de crescimento: ");
    int taxaB = scan.nextInt();

    int cont = 0;

    while (popA < popB) {

      popA += (popA / 100) * taxaA;
      popB += (popB / 100) * taxaB;
      cont++;
    }
    System.out.println("População A: " + popA);
    System.out.println("População B: " + popB);
    System.out.println("Qtd anos: " + cont);
  }
}
