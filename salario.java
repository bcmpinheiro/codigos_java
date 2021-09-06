import java.util.Scanner;

public class salario {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o seu salário: ");
    double salarioAtual = scan.nextDouble(); // Double.parseDouble(scan.nextLine());
    System.out.println("Seu salário atual é: " + salarioAtual);

    if (salarioAtual <= 280.00) {
      double novoSalario = salarioAtual + (salarioAtual * 0.20);
      System.out.println("teve um aumento de 20% que ficou: " + novoSalario);
    } else if ((salarioAtual > 280.00) && (salarioAtual <= 700.00)) {
      double novoSalario = salarioAtual + (salarioAtual * 0.15);
      System.out.println("teve um aumento de 15% que ficou: " + novoSalario);
    } else if ((salarioAtual > 700.00) && (salarioAtual <= 1500.00)) {
      double novoSalario = salarioAtual + (salarioAtual * 0.10);
      System.out.println("teve um aumento de 10% que ficou: " + novoSalario);
    } else if (salarioAtual > 1500.00) {
      double novoSalario = salarioAtual + (salarioAtual * 0.05);
      System.out.println("teve um aumento de 5% que ficou: " + novoSalario);
    }
  }
}
