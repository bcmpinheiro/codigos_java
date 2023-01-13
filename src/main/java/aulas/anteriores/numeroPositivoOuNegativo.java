package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class numeroPositivoOuNegativo {
  // programa pede entrada de numero positivo ou negativo e retorna na tela os
  // valores
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um número positivo ou negativo: ");
    int numero = scan.nextInt();

    if (numero < 0) {
      System.out.println("Esse número digitado é negativo: " + numero);
    } else {
      System.out.println("Esse número digitado é positivo: " + numero);
    }
  }
}
