import java.util.Scanner;

public class FatorialNumInteiro {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um numero: ");
    int num = scan.nextInt();

    System.out.println(num + "! = ");
    int fatorial = 1;
    for (int i = num; i > 0; i--) {
      fatorial *= i;
      System.out.println(i);
    }
    System.out.println("Resultado: " + fatorial);
  }
}
