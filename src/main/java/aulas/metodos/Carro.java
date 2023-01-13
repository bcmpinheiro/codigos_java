package src.main.java.aulas.metodos;

public class Carro {

    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    //metodo simples
    //void é um tipo de retorno usado para exibir resultado na tela
    //não retornará nenhum valor
    void exibirAutonomia() {
        System.out.println("A autonomia do carro e: " + capacidadeCombustivel * consumoCombustivel + " km");
    }

    //metodo com retorno
    double obterAutonomia() {

        System.out.println("O metodo obterAutonomia foi chamado.");

        return capacidadeCombustivel * consumoCombustivel;
    }

    //para calculos é necessário tiparo retorno
    double calcularCombustivel(double km) {
        double quantidadeCombustivel = km / consumoCombustivel;
        return quantidadeCombustivel;
    }
}
