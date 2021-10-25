import java.util.Scanner;

public class NumParOuImpar {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int num;
    int pares = 0;
    int impares = 0;

    for (int i = 0; i < 10; i++) {
      System.out.println("Entre com um número: ");
      num = scan.nextInt();

      if (num % 2 == 0) {
        pares++;
      } else {
        impares++;
      }
    }
    System.out.println("Quantidade de pares: " + pares);
    System.out.println("Quantidade de impares: " + impares);
  }
}
