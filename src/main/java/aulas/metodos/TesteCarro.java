package src.main.java.aulas.metodos;


public class TesteCarro {

    public static void main (String[] args) {

        //declaração de uma variavél van que é do tipo carro
        Carro van = new Carro(); //instanciamos o tipo carro
        //setamos alguns valores para os atributos da classe
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numeroPassageiros);
        System.out.println(van.capacidadeCombustivel);
        System.out.println(van.consumoCombustivel);

        van.exibirAutonomia();
    }

}
