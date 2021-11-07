import java.util.Scanner;

public class ColecionaCds {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a quantidade de CD's que você possui: ");
    int qtdCds = scan.nextInt();

    int somaValorCds = 0;
    int mediaCds;

    for (int i = 0; i < qtdCds; i++) {
      System.out.println("Digite o valor que foi gasto em cada CD: " + (i + 1));
      double valorCds = scan.nextInt();

      somaValorCds += valorCds;

    }

    mediaCds = somaValorCds / qtdCds;

    System.out.println("Soma Qtde CD's: " + qtdCds);
    System.out.println("Media Valor CD's: " + mediaCds);
  }
}