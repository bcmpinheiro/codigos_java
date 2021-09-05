import java.util.Scanner;

public class horarioEstudo {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Qual o seu horário de entrada na escola? Matutino, Vespertino ou Noturno? Digite M, V ou N: ");
    String horario = scan.next();
    System.out.println("Seu horário é: " + horario);

    if (horario.equals("M") || (horario.equals("m"))) {
      System.out.printf("Bom dia!");
    } else if (horario.equals("V") || (horario.equals("v"))) {
      System.out.printf("Boa tarde!");
    } else if (horario.equals("N") || (horario.equals("n"))) {
      System.out.printf("Boa noite!");
    } else {
      System.out.println("Não é um horário valido neste caso!");
    }
  }
}
