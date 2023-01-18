package src.main.java.aulas.metodos;

public class TesteLampada {

    public static void main (String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligar();
        if (lampada.ligada) {
            System.out.println("A lampada esta ligada");
        } else {
            System.out.println("A lampada esta desligada");
        }


        lampada.desligar();
        if (lampada.ligada) {
            System.out.println("A lampada esta ligada");
        } else {
            System.out.println("A lampada esta desligada");
        }
    }
}
