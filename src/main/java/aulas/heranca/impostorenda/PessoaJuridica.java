package src.main.java.aulas.heranca.impostorenda;

public class PessoaJuridica extends Contribuinte {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.10;
        //return (this.get.rendaBruta()/100) * 10;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                "imposto a ser pago='" + calcularImposto() + '\'' +
                '}';
    }
}
