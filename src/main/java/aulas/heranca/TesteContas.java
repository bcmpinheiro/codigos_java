package src.main.java.aulas.heranca;

public class TesteContas {

    public static void main(String[] args) {

        System.out.println("*** Teste ContaBancaria ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente Conta Bancaria");
        contaSimples.setNumConta("11111");
        contaSimples.setSaldo(0);

        contaSimples.depositar(100.00);

        realizarSaque(contaSimples,50.00);

        realizarSaque(contaSimples,70.00);

        System.out.println(contaSimples);

        System.out.println("*** Teste ContaPoupanca ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente Conta Poupanca");
        contaPoupanca.setNumConta("22222");
        contaPoupanca.setSaldo(0);
        contaPoupanca.setDiaRendimento(25);

        contaPoupanca.depositar(100.00);

        realizarSaque(contaPoupanca,50.00);

        realizarSaque(contaPoupanca,70.00);

        if(contaPoupanca.calcularNovoSaldo(0.5)){
            System.out.println("Novo rendimento aplicado, novo saldo e de = " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje nao e dia de rendimento, novo saldo nao calculado.");
        }
        System.out.println(contaPoupanca);

        System.out.println("*** Teste ContaEspecial ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("33333");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100.00);

        realizarSaque(contaEspecial,50.00);

        realizarSaque(contaEspecial,70.00);

        realizarSaque(contaEspecial,80.00);

        System.out.println(contaEspecial);
    }

    private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo Insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
        }
    }


}
