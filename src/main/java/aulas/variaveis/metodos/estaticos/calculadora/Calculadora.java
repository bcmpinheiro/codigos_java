package src.main.java.aulas.variaveis.metodos.estaticos.calculadora;

public class Calculadora {

    private static int calculadora;

    public Calculadora(){

    }

    public static int somar(int num1, int num2){
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static int dividir(int num1, int num2){
        return num1 / num2;
    }

    //x^n
    //x * x * x (n vezes)
    public static int potencia (int num1, int num2){

        int total = 1;
        for (int i = 1; i <= num2; i++){
            total *= num1;
        }
        return total;
    }

    // 5! = 5 * 4 * 3 * 2 * 1 = 120
    // 0! = 1
    public static int fatorial(int num){

        if (num == 0){
            return 1;
        }

        int total = 1;
        for (int i = num; i > 1; i--){
            total *= i;
        }

        return total;
    }
}
