package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class EncontreNumPrimos {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com um numero: ");
    int num = scan.nextInt();

    boolean primo;

    for (int i = 1; i <= num; i++) {

      primo = true;

      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          // System.out.println("Não é primo! Divisivel por: " + i);
          primo = false;
          // break;
        }
      }
      if (primo) {
        System.out.println(i);
      }
    }
  }
}
