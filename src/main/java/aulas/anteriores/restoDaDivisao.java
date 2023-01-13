package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class restoDaDivisao {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Vamos saber se o número é par ou impar? Digite um número aleatório: ");
    int numero01 = scan.nextInt();

    int divisao = (numero01 % 2);

    if (divisao == 0) {
      System.out.println("Trata-se de um número par, pois sua divisão resultou em: " + divisao);
    } else {
      System.out.println("Trata-se de um número impar, pois sua divisão resultou em: " + divisao);
    }
  }
}
