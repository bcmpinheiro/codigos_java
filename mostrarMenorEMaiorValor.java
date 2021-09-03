import java.util.Scanner;

public class mostrarMenorEMaiorValor {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    int numero01 = scan.nextInt();
    System.out.println("Digite o segundo número: ");
    int numero02 = scan.nextInt();
    System.out.println("Digite o terceiro número: ");
    int numero03 = scan.nextInt();

    if ((numero01 > numero02) && (numero01 > numero03)) {
      System.out.println("O primeiro é o maior número digitado: " + numero01);
    } else if ((numero02 > numero01) && (numero02 > numero03)) {
      System.out.println("O segundo é o maior número digitado: " + numero02);
    } else if ((numero03 > numero01) && (numero03 > numero02)) {
      System.out.println("O terceiro é o maior número digitado: " + numero03);
    }

    if ((numero01 < numero02) && (numero01 < numero03)) {
      System.out.println("O primeiro é o menor número digitado: " + numero01);
    } else if ((numero02 < numero01) && (numero02 < numero03)) {
      System.out.println("O segundo é o menor número digitado: " + numero02);
    } else if ((numero03 < numero01) && (numero03 < numero02)) {
      System.out.println("O terceiro é o menor número digitado: " + numero03);
    }
  }
}
