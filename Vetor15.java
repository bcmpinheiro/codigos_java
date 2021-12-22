import java.util.Scanner;

public class Vetor15 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] vetorA = new int[10];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: " + i);
      vetorA[i] = scan.nextInt();
    }

    int impares = 0;
    for (int i = 0; i < vetorA.length; i++) {
      if (vetorA[i] % 2 != 0) {
        impares++;
      }
    }

    int par = vetorA.length - impares;

    // vetorA.length - 100%
    // par
    // = x * vetorA.length == par * 100
    // = x == (par * 100)/vetorA.length
    double porcPar = (par * 100) / vetorA.length;
    double porcImpar = 100 - porcPar;

    System.out.print("Vetor A = ");
    for (int i = 0; i < vetorA.length; i++) {
      System.out.print(vetorA[i] + " ");
    }
    System.out.println();
    System.out.println("Porcentagem pares: " + porcPar);
    System.out.println("Porcentagem impares: " + porcImpar);

  }
}
