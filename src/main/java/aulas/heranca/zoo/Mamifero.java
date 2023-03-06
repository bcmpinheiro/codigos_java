package src.main.java.aulas.heranca.zoo;

public class Mamifero extends Animal{

    private String alimento;

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Mamifero() {
        super();
        this.setCor("Castanho");
        this.setAlimento("Mel");
        this.setAmbiente("Terra");
    }

    @Override
    public String toString() {
        String s =  super.toString();
        s += "\nalimento='" + alimento;
        return s;
    }
}
