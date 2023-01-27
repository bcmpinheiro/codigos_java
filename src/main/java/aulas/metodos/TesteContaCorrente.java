package src.main.java.aulas.metodos;

public class TesteContaCorrente {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.numero = "12345";
        contaCorrente.agencia = "1234";
        contaCorrente.limiteEspecial = 500.00;
        contaCorrente.especial = true;
        contaCorrente.saldo = -10;
        contaCorrente.valorEspecialUsado = 0.00;

        System.out.println("Saldo da conta " + contaCorrente.numero + " = " + contaCorrente.saldo);

        boolean saqueEfetuado = contaCorrente.realizarSaque(10.00);

        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso!");
            contaCorrente.consultarSaldo();
        } else {
            System.out.println("Nao foi possivel realizar saque. Saldo insuficiente!");
        }

        saqueEfetuado = contaCorrente.realizarSaque(500.00);
        System.out.println("Tentativa de saque de 500,00 reais!");
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso!");
            contaCorrente.consultarSaldo();
        } else {
            System.out.println("Nao foi possivel realizar saque. Saldo insuficiente!");
        }

        System.out.println("Deposito de 500,00 reais");
        contaCorrente.depositar(500.00);
        contaCorrente.consultarSaldo();

        if (contaCorrente.verificarUsoChequeEspecial()) {
            System.out.println("Esta usando cheque especial");
        } else {
            System.out.println("Nao esta usando cheque especial");
        }

        contaCorrente.realizarSaque(600.00);
        contaCorrente.consultarSaldo();
        if (contaCorrente.verificarUsoChequeEspecial()) {
            System.out.println("Esta usando cheque especial");
        } else {
            System.out.println("Nao esta usando cheque especial");
        }


    }
}
