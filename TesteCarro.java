public class TesteCarro {

  public static void main(String[] args) {

    Carro van = new Carro();
    van.marca = "Fiat";
    van.modelo = "Ducato";
    van.numPassageiros = 10;
    van.capCombustivel = 100;
    van.consumoCombustivel = 0.20;

    System.out.println(van.marca + " - " + van.modelo);

    Carro fusca = new Carro();
    fusca.marca = "Volkswagen";
    fusca.modelo = "Fusca";
    fusca.numPassageiros = 4;
    fusca.capCombustivel = 30;
    fusca.consumoCombustivel = 0.15;

    System.out.println(fusca.marca + " - " + fusca.modelo);

  }
}
