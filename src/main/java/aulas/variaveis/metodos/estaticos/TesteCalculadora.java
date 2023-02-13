package src.main.java.aulas.variaveis.metodos.estaticos;

public class TesteCalculadora {

    public static void main(String[] args) {

        imprimirNaTela(Calculadora.somar(1,2));

        imprimirNaTela(Calculadora.subtrair(2,1));

        imprimirNaTela(Calculadora.multiplicar(2,2));

        imprimirNaTela(Calculadora.dividir(4,2));

        imprimirNaTela(Calculadora.potencia(2,3));
    }

    static void imprimirNaTela(int num) {
        System.out.println(num);
    }


}
