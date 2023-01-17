package src.main.java.aulas.metodos;

public class Lampada {

    String cor;
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

    public static String estadoLampada(String ligada, String desligada) {
        if (estadoLampada("1", "2") == "1") {
            System.out.println("O metodo true foi chamado.");
            System.out.println("A lampada esta: ligada");
            return ligada;
        } else {
            System.out.println("O metodo false foi chamado.");
            System.out.println("A lampada esta: desligada");
            return desligada;
        }
    }
}
