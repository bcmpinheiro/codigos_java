package src.main.java.aulas.construtores.encapsulamento.sobrecarga.contacorrente;

public class TesteContaCorrente {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setAgencia("1234");
        contaCorrente.setLimiteEspecial(500.00);
        contaCorrente.setEspecial(true);
        contaCorrente.setSaldo(-10);
        contaCorrente.setValorEspecialUsado(0.00);

        System.out.println("Saldo da conta " + contaCorrente.getNumero() + " = " + contaCorrente.getSaldo());

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
