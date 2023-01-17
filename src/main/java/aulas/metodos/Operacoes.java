package src.main.java.aulas.metodos;

public class Operacoes {

    public static String contador (int inicio, int fim) {
        String string = "";
        for (int contador = inicio; contador <= fim; contador++) {
            string += contador + " ";
        }
        return string;
    }
}
