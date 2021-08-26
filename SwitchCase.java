import java.util.Scanner;

public class SwitchCase {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um número que corresponda aos dias da semana: ");

    int diaDaSemana = scan.nextInt();

    if (diaDaSemana == 1) {
      System.out.println("Domingo");
    } else if (diaDaSemana == 2) {
      System.out.println("Segunda-Feira");
    } else if (diaDaSemana == 3) {
      System.out.println("Terça-Feira");
    } else if (diaDaSemana == 4) {
      System.out.println("Quarta-Feira");
    } else if (diaDaSemana == 5) {
      System.out.println("Quinta-Feira");
    } else if (diaDaSemana == 6) {
      System.out.println("Sexta-Feira");
    } else if (diaDaSemana == 7) {
      System.out.println("Sabado");
    } else {
      System.out.println("Não é um dia da semana!");
    }

  }

}
