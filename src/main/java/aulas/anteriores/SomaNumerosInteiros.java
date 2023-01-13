package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class SomaNumerosInteiros {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com o primeiro numero: ");
    int num01 = scan.nextInt();
    System.out.println("Entre com o segundo numero: ");
    int num02 = scan.nextInt();
    int soma = 0;

    for (int indice = num01; indice <= num02; indice++) {
      soma += indice;
    }
    System.out.println("A soma entre o intervalo dos numeros digitados foi: " + soma);
  }
}
