package src.main.java.aulas.metodos;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno: ");
        aluno.nome = scan.nextLine();

        System.out.println("Entre com o nome do curso que o aluno esta matriculado: ");
        aluno.nomeCursoMatriculado = scan.nextLine();

        System.out.println("Entre com a matricula do aluno: ");
        aluno.matricula = scan.nextLine();

        //aluno.nomeDisciplinas = new String[3];
        for (int i = 0; i < aluno.nomeDisciplinas.length; i++){
            System.out.println("Entre com o nome da disciplina: " + i);
            aluno.nomeDisciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++){
                System.out.println("Entre com a nota " + (j+1));
                aluno.notasDisciplinas[i] [j] = scan.nextDouble();
            }
        }
        aluno.mostrarInfoAluno();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++){
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado!");
            } else {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - reprovado!");
            }
        }
    }

}
