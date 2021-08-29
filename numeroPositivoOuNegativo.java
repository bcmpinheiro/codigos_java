import java.util.Scanner;

public class numeroPositivoOuNegativo {

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
