package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class descontoSalario {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o valor da sua hora trabalhada: ");
    double valorHoraTrabalhada = scan.nextDouble();
    System.out.println("Digite a quantidade de horas trabalhadas neste mês: ");
    double horaTrabalhada = scan.nextDouble();
    System.out.println(
        "Você trabalhou: " + valorHoraTrabalhada + " horas e o valor de cada hora trabalhada é: " + horaTrabalhada);
    double salario = (valorHoraTrabalhada * horaTrabalhada);
    System.out.println("Valor do salário Bruto: " + salario);

    if (salario <= 900.00) {
      double salarioDesconto = salario - (salario * 0);
      System.out.println("Esta renda está isenta de impostos.");
    } else if ((salario >= 900.01) && (salario <= 1500.00)) {
      double salarioDesconto = salario - (salario * 0.15);
      System.out.println("com desconto de 5% do INSS passará a ser: " + salarioDesconto);
    } else if ((salario >= 1500.01) && (salario <= 2500.00)) {
      double salarioDesconto = salario - (salario * 0.20);
      System.out.println("com desconto de 10% do INSS passará a ser: " + salarioDesconto);
    } else if (salario > 2500.00) {
      double salarioDesconto = salario - (salario * 0.30);
      System.out.println("com desconto de 20% do INSS passará a ser: " + salarioDesconto);
    }

    System.out.println("------------------------------------------");
    System.out.println("               Contracheque               ");
    System.out.println("Salário Bruto: (5 * 220)      : R$ 1100,00");
    System.out.println("(-) IR (5%)                   : R$   55,00");
    System.out.println("(-) INSS ( 10% )              : R$  100,00");
    System.out.println("FGTS ( 11% )                  : R$  121,00");
    System.out.println("Total de descontos            : R$  165,00");
    System.out.println("Salário Liquido               : R$  935,00");
    System.out.println("------------------------------------------");

  }
}
