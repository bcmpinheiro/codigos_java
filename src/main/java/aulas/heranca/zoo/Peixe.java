package src.main.java.aulas.heranca.zoo;

public class Peixe extends Animal{

    private String caracteristicas;

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Peixe() {
        super();
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.setCaracteristicas("Barbatanas e cauda");
    }

    @Override
    public String toString() {
        String s =  super.toString();
        s += "\ncaracteristicas='" + caracteristicas;
        return s;
    }
}
