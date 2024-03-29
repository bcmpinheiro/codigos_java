package src.main.java.aulas.anteriores;

import src.main.java.aulas.anteriores.Automovel;

public class TesteAutomovel {

  public static void main(String[] args) {

    Automovel van = new Automovel();
    van.marca = "Fiat";
    van.modelo = "Ducato";
    van.numPassageiros = 10;
    van.capCombustivel = 100;
    van.consumoCombustivel = 0.20;

    System.out.println(van.marca);
    System.out.println(van.modelo);

    van.exibirAutonomia();

    double autonomia = van.obterAutonomia();
    System.out.println("A autonomia do carro é: " + autonomia);
    System.out.println("A autonomia do carro é: " + van.obterAutonomia());

    double qtdCombustivel10 = van.calcularCombustivel(10);
    double qtdCombustivel15 = van.calcularCombustivel(15);

    System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
    System.out.println("qtdCombustivel15 = " + qtdCombustivel15);

  }
}
