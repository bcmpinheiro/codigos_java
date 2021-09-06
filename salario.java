import java.util.Scanner;

public class salario {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o seu salário: ");
    double salarioAtual = scan.nextDouble();

    if (salarioAtual <= 280.00) {
      System.ou.println(
          "O salário atual é: " + salarioAtual + " e teve um aumento de 20% que ficou: " + salarioAtual * 0.20);
    } else if (salario > 280.00 && <= 700.00) {
      System.ou.println(
        "O salário atual é: " + salarioAtual + " e teve um aumento de 15% que ficou: " + salarioAtual * 0.15);
    }

  }

}
