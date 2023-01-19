package src.main.java.aulas.metodos;

public class ContaCorrente {

    int numero;
    double saldo;
    boolean contaEspecial;
    double limite;

    double consultaSaldo() {
        return saldo;
    }

    void validarContaEspecial() {
        contaEspecial = true;
    }

    double realizarSaque(){
        return saldo;
    }

    double validarSeEstaUsandoLimite() {
        return limite;
    }





}
