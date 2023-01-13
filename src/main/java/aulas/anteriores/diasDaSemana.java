package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class diasDaSemana {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um número que corresponda a um número de dias da semana: ");
    int dias = scan.nextInt();

    switch (dias) {
      case 1:
        System.out.println("Domingo");
        break;
      case 2:
        System.out.println("Segunda-Feira");
        break;
      case 3:
        System.out.println("Terça-Feira");
        break;
      case 4:
        System.out.println("Quarta-Feira");
        break;
      case 5:
        System.out.println("Quinta-Feira");
        break;
      case 6:
        System.out.println("Sexta-Feira");
        break;
      case 7:
        System.out.println("Sábado");
        break;
      default:
        System.out.println("Não é um dia da semana válido!");
        break;
    }
  }
}
