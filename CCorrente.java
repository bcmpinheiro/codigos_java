public class CCorrente {

  String nomeTitular;
  String numero;
  String agencia;
  int saldo;
  boolean contaEspecial;
  double limiteEspecial;
  double valorEspecialUsado;

  boolean realizarSaque(double quantiaASacar) {

    // tem saldo na conta
    if (saldo >= quantiaASacar) {
      saldo -= quantiaASacar;
      return true;
      // não tem saldo na conta
    } else {
      if (contaEspecial) {
        // verificar se o limite especial tem saldo
        double limite = limiteEspecial + saldo;
        if (limite >= quantiaASacar) {
          saldo -= quantiaASacar;
          return true;
        } else {
          return false;
        }
      } else {
        return false; // não é especial e não tem saldo sufciente
      }
    }
  }

  void depositar(double valorDepositado) {
    saldo += valorDepositado;
  }

  void consultarSaldo() {
    System.out.println("Saldo atual: " + saldo);
  }

  boolean verificarUsoChequeEspecial() {
    return saldo < 0;
  }

}
