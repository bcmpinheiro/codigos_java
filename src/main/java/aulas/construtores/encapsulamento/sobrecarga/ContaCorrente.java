package src.main.java.aulas.construtores.encapsulamento.sobrecarga;

public class ContaCorrente {

    private String numero;
    private String agencia;
    private double saldo;
    private double limiteEspecial;
    private boolean especial;
    private double valorEspecialUsado;

    public ContaCorrente() {

    }

    public ContaCorrente(String numero, String agencia, double saldo, double limiteEspecial, boolean especial, double valorEspecialUsado) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limiteEspecial = limiteEspecial;
        this.especial = especial;
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }



    public boolean realizarSaque(double quantiaASacar) {

        //tem saldo na conta
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        } else { //não tem saldo na conta
            if (especial) {
                //verificar se o limite epsecial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false; //não é especial e não tem saldo suficiente
            }
        }
    }

    public void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    public void consultarSaldo () {
        System.out.println("Saldo atual da conta = " + saldo);
    }

    public boolean verificarUsoChequeEspecial() {
        return saldo < 0;
    }
}
