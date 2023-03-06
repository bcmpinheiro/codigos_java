package src.main.java.aulas.heranca.zoo;

public class Animal {

    private String nome;
    private int comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public Animal() {
        this.patas = 4;
    }

    @Override
    public String toString() {
        String s = "Animal{" +
                "\nnome='" + nome + '\'' +
                ", \ncomprimento=" + comprimento + " cm" +
                ", \npatas=" + patas +
                ", \ncor='" + cor + '\'' +
                ", \nambiente='" + ambiente + '\'' +
                ", \nvelocidade=" + velocidade + " ms" +
                '}';
        return s;
    }
}
