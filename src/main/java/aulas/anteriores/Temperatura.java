package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a qtd de temperatura");
        int qtdtemperaturas = scan.nextInt();

        double temp;
        double soma = 0;
        double menor = Double.MIN_VALUE;
        double maior = Double.MAX_VALUE;

        for (int i = 1; i <= qtdtemperaturas; i++) {
            System.out.println("Entre com a temperatura: " + i);
            temp = scan.nextDouble();

            soma += temp;

            if (temp > maior) {
                maior = temp;
            }

            if (temp < menor) {
                menor = temp;
            }
        }

        System.out.println("Média: " + (soma/qtdtemperaturas));
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
    }
}
