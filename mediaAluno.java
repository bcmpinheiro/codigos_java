import java.util.Scanner;

public class mediaAluno {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a primeira nota do aluno.");
    double nota01 = scan.nextDouble();
    System.out.println("Digite a segunda nota do aluno.");
    double nota02 = scan.nextDouble();

    double mediaNotas = ((nota01 + nota02) / 2);
    System.out.println("Média: " + mediaNotas);

    if (mediaNotas >= 9.1 && mediaNotas <= 10.0) {
      System.out.println("Conceito A - Aluno APROVADO!");
    } else if (mediaNotas >= 7.6 && mediaNotas <= 9.0) {
      System.out.println("Conceito B - Aluno APROVADO!");
    } else if (mediaNotas >= 6.1 && mediaNotas <= 7.5) {
      System.out.println("Conceito C - Aluno APROVADO!");
    } else if (mediaNotas >= 4.1 && mediaNotas <= 6.0) {
      System.out.println("Conceito D - Aluno REPROVADO!");
    } else if (mediaNotas >= 0 && mediaNotas <= 4.0) {
      System.out.println("Conceito E - Aluno REPROVADO!");
    }
  }
}
