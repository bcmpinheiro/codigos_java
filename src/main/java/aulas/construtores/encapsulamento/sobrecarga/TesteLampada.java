package src.main.java.aulas.construtores.encapsulamento.sobrecarga;

public class TesteLampada {

    public static void main (String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligar();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();
    }
}
