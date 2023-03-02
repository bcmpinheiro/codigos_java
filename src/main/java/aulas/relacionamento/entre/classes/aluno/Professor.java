package src.main.java.aulas.relacionamento.entre.classes.aluno;

public class Professor {

    private String nomeProfessor;
    private String departamentoProfessor;
    private String emailProfessor;

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getDepartamentoProfessor() {
        return departamentoProfessor;
    }

    public void setDepartamentoProfessor(String departamentoProfessor) {
        this.departamentoProfessor = departamentoProfessor;
    }

    public String getEmailProfessor() {
        return emailProfessor;
    }

    public void setEmailProfessor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }

    public String obterInfo() {
        return "Professor = " + nomeProfessor + "\n";
    }
}
