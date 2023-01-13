package src.main.java.aulas.metodos;

public class TesteLampada {

    public static void main (String[] args) {

        Lampada estadoLampada = new Lampada();

        estadoLampada.exibirEstadoLampada();

        boolean ligar = estadoLampada.ligarLampada(true);
        boolean desligada = estadoLampada.ligarLampada(false);





    }
}
