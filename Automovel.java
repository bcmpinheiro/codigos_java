public class Automovel {

  String marca;
  String modelo;
  int numPassageiros;
  double capCombustivel;
  double consumoCombustivel;

  // metodo void retorno sem parâmetro (metodo simples)
  void exibirAutonomia() {
    System.out.println("A autonnomia do carro é: " + capCombustivel * consumoCombustivel + " km");
  }

  // metodo double com retorno (metodo com retorno)
  double obterAutonomia() {
    System.out.println("Metodo obterAutonomia foi chamado.");
    return capCombustivel * consumoCombustivel;
  }

  // metodo double com parametro setado com valores que não possuimos na classe
  double calcularCombustivel(double km) {
    double qtdCombustivel = km / consumoCombustivel;
    return qtdCombustivel;
  }
}
