package src.main.java.aulas.interfaces.polimorfismo;

public class Circulo extends Figura2D{

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        //return (raio * raio) * 3.14;
        return (raio * raio) * Math.PI;
    }
}
