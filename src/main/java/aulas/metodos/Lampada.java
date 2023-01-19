package src.main.java.aulas.metodos;

public class Lampada {

    String cor;
    boolean ligada;

    void ligar() {
        ligada = true;
    }
    void desligar() {
        ligada = false;
    }
    void mostrarEstado() {
        if (ligada) {
            System.out.println("A lampada esta ligada");
        } else {
            System.out.println("A lampada esta desligada");
        }
    }
}
