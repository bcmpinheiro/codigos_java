package src.main.java.aulas.construtores.encapsulamento.sobrecarga;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno: ");
        aluno.setNome(scan.nextLine());

        System.out.println("Entre com o nome do curso que o aluno esta matriculado: ");
        aluno.setNomeCursoMatriculado(scan.nextLine());

        System.out.println("Entre com a matricula do aluno: ");
        aluno.setMatricula(scan.nextLine());

        //aluno.nomeDisciplinas = new String[3];
        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++){
            System.out.println("Entre com o nome da disciplina: " + i);
            aluno.setNomeDisciplinaPos(i, scan.next());
        }

        for (int i = 0; i < aluno.getNotasDisciplinas().length; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);
            for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++){
                System.out.println("Entre com a nota " + (j+1));
                aluno.setNotasPosIJ(i, j, scan.nextDouble());
            }
        }
        aluno.mostrarInfoAluno();

        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++){
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - foi aprovado!");
            } else {
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - reprovado!");
            }
        }
    }
}
