package src.main.java.aulas.variaveis.metodos.estaticos;

public class Contador {

    private static int cont;

    public Contador() {
        cont++;
    }

    public static void incrementar(){
        cont++;
    }

    public static void zerar(){
        cont = 0;
    }

    public static int obterValor() {
        return cont;
    }
}
