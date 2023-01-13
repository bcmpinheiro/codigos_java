package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class NovoTabuada {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com o numero para gerar a tabuada: ");
    int num = scan.nextInt();

    boolean invalido = true;
    int numInicial, numFinal;

    do {
      System.out.println("Entre com o ínicio da tabuada");
      numInicial = scan.nextInt();

      System.out.println("Entre com o final da tabuada");
      numFinal = scan.nextInt();

      if (numFinal > numInicial) {
        invalido = false;
      }
    } while (invalido);

    System.out.println("Tabuada de " + num + ":");
    System.out.println("Começar por: " + numInicial);
    System.out.println("Terminar em:  " + numFinal);
    System.out.println();

    for (int i = numInicial; i <= numFinal; i++) {
      System.out.println(num + " x " + i + " = " + (num * i));
    }
  }
}
