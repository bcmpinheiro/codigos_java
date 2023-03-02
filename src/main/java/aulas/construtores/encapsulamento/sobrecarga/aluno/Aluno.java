package src.main.java.aulas.construtores.encapsulamento.sobrecarga.aluno;

public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCursoMatriculado;
    private String[] nomeDisciplinas;
    private double[][] notasDisciplinas;

    public Aluno() {
        nomeDisciplinas = new String[3];
        notasDisciplinas = new double [3] [4];
    }

    public Aluno(String nome, String matricula, String nomeCursoMatriculado, String[] nomeDisciplinas, double[][] notasDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCursoMatriculado = nomeCursoMatriculado;
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double [3] [4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCursoMatriculado() {
        return nomeCursoMatriculado;
    }

    public void setNomeCursoMatriculado(String nomeCursoMatriculado) {
        this.nomeCursoMatriculado = nomeCursoMatriculado;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public void mostrarInfoAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome do Curso: " + nomeCursoMatriculado);

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++){
                System.out.println(notasDisciplinas[i] [j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarAprovado(int indice) {

        if (obterMedia(indice) >= 7){
            return true;
        }
        return false;
    }

    private double obterMedia(int indice) {
        double soma = 0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        return media;
    }

    public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
        this.nomeDisciplinas[pos] = nomeDisciplina;
    }

    public void setNotasPosIJ(int posI, int posJ, double nota){
        this.notasDisciplinas[posI][posJ] = nota;
    }
}


