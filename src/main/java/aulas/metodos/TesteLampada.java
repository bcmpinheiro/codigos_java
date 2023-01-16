package src.main.java.aulas.metodos;

public class TesteLampada {

    public static void main (String[] args) {

        Lampada estadoLampada = new Lampada();
        estadoLampada.ligada = "ligada";
        estadoLampada.desligada = "desligada";

        System.out.println(estadoLampada.ligada);
        System.out.println(estadoLampada.desligada);

        estadoLampada.exibirEstadoLampada();

        boolean isEstadoLampadaLigada = estadoLampada.isEstadoLampada();
        boolean isEstadoLampadaDesligada = estadoLampada.isEstadoLampada();
    }
}
