package src.main.java.aulas.relacionamento.entre.classes;

public class Aluno {

    private String nomeAluno;
    private String matriculaAluno;
    private double[] notas;
    private Aluno[] alunos;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String obterInfo() {
        String info = "Nome Aluno = " + nomeAluno + "; ";
        info += "Matricula = " + matriculaAluno + "; ";
        info += "Notas: ";

        double soma = 0;
        for (double nota : notas){
            soma += nota;
            info += nota + " ; ";
        }
        double media = soma/4;
        info += "\n" + "Media = " + media + " - ";
        if (media >= 7){
            info += "Aprovado!";
        } else {
            info += "Reprovado!";
        }
        return info;
    }

    public double obterMedia() {
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        return soma/4;
    }
}
