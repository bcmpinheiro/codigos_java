package src.main.java.aulas.heranca;

public class TesteContas {

    public static void main(String[] args) {

        System.out.println("*** Teste ContaBancaria ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente Conta Simples");
        contaSimples.setNumConta("11111");
        contaSimples.setSaldo(0);

        contaSimples.depositar(100.00);

        realizarSaque(contaSimples,50.00);

        realizarSaque(contaSimples,70.00);

        System.out.println(contaSimples);




    }

    private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo Insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
        }
    }


}
