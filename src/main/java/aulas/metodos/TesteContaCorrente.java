package src.main.java.aulas.metodos;

public class TesteContaCorrente {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.validarContaEspecial();
        System.out.println("A conta e especial? " + contaCorrente.contaEspecial);


    }

}
