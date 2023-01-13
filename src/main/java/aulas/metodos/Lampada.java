package src.main.java.aulas.metodos;

public class Lampada {

    String cor;
    boolean estadoLampada;

    void exibirEstadoLampada() {
        if (estadoLampada == true) {
            System.out.println("Lampada Ligada!");
        } else {
            System.out.println("Lampada Desligada");
        }
    }

    boolean ligarLampada (boolean ligada){
        return estadoLampada = true;
    }

}
