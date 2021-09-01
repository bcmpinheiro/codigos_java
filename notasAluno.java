import java.util.Scanner;

public class notasAluno {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a primerira nota do aluno: ");
    double nota01 = scan.nextDouble();
    System.out.println("Digite a segunda nota do aluno: ");
    double nota02 = scan.nextDouble();

    if ((nota01 + nota02) / 2 >= 10) {
      System.out.println("Aluno Aprovado com Distinção!");
    } else if ((nota01 + nota02) / 2 < 7) {
      System.out.println("Aluno Reprovado!");
    } else if ((nota01 + nota02) / 2 >= 7) {
      System.out.println("Aluno Aprovado!");
    }
  }
}
