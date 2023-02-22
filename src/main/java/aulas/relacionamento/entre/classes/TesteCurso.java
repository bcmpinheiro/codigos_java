package src.main.java.aulas.relacionamento.entre.classes;

import java.util.Scanner;

public class TesteCurso {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do Curso: ");
        String nome = scan.nextLine();

        System.out.println("Entre com o horario do Curso: ");
        String horario = scan.nextLine();

        System.out.println("Entre com o nome do Professor: ");
        String nomeProf = scan.nextLine();

        System.out.println("Entre com o departamento do Professor: ");
        String departamentoProf = scan.nextLine();

        System.out.println("Entre com o email do Professor: ");
        String emailProf = scan.nextLine();

        Curso curso = new Curso();
        curso.setNomeCurso(nome);
        curso.setHorarioCurso(horario);

        Professor professor = new Professor();
        professor.setNomeProfessor(nomeProf);
        professor.setDepartamentoProfessor(departamentoProf);
        professor.setEmailProfessor(emailProf);

        curso.setProfessor(professor);

        System.out.println("---Alunos---");

        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < 5; i++){

            scan.nextLine();

            System.out.println("Entre com o nome do aluno " + (i + 1));
            String nomeAluno = scan.nextLine();

            System.out.println("Entre com a matricula do aluno " + (i + 1));
            String matAluno = scan.nextLine();

            double[] notas = new double[4];
            for (int j = 0; j < 4; j++){
                System.out.println("Entre com a nota " + (j + 1));
                notas[j] = scan.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNomeAluno(nomeAluno);
            aluno.setMatriculaAluno(matAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;

        }

        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());
    }
}
