package src.main.java.aulas.metodos;

public class Carro {

    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro e: " + capacidadeCombustivel * consumoCombustivel + " km");
    }

}
