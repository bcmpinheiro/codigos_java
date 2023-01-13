package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class TurmaAlunos {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com a quantidade de turmas: ");
    int numTurmas = scan.nextInt();

    int numAlunos;
    int soma = 0;
    boolean invalido = true;

    for (int i = 1; i <= numTurmas; i++) {

      invalido = true;
      do {
        System.out.println("Entre com o numero de aluno por turma: " + i);
        numAlunos = scan.nextInt();

        if (numAlunos <= 40) {
          invalido = false;

        } else {
          System.out.println("Número de alunos invalido! Digite novamente!");
        }
      } while (invalido);

      soma += numAlunos;
    }
    double media = soma / numTurmas;
    System.out.println("Média: " + media);
  }
}
