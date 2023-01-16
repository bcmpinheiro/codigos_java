package src.main.java.aulas.metodos;

public class Lampada {

    String cor;
    boolean estadoLampada;
    String ligada;
    String desligada;

    public String lampadaLigada(){
        return ligada;
    }
    public String lampadaDesligada(){
        return desligada;
    }

    void exibirEstadoLampada() {
        System.out.println("A lampada esta: " + ligada);
    }

    boolean isEstadoLampada() {
        if (estadoLampada = true) {
            System.out.println("O metodo true foi chamado.");
            System.out.println("A lampada esta: ligada");
            return true;
        } else {
            System.out.println("O metodo false foi chamado.");
            System.out.println("A lampada esta: desligada");
            return false;
        }
    }
}
