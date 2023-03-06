package src.main.java.aulas.heranca.impostorenda;

public class TesteImpostoRenda {

    public static void main(String[] args) {

        PessoaFisica pessoaFisicaUm = new PessoaFisica();
        pessoaFisicaUm.setNome("Contribuinte Um");
        pessoaFisicaUm.setRendaBruta(1000.00);
        pessoaFisicaUm.setCpf("11503559050");

        PessoaFisica pessoaFisicaDois = new PessoaFisica();
        pessoaFisicaDois.setNome("Contribuinte Dois");
        pessoaFisicaDois.setRendaBruta(2000.00);
        pessoaFisicaDois.setCpf("09572400070");

        PessoaFisica pessoaFisicaTres = new PessoaFisica();
        pessoaFisicaTres.setNome("Contribuinte Tres");
        pessoaFisicaTres.setRendaBruta(3700.00);
        pessoaFisicaTres.setCpf("91209097052");

        PessoaJuridica pessoaJuridicaQuatro = new PessoaJuridica();
        pessoaJuridicaQuatro.setNome("Contribuinte Quatro");
        pessoaJuridicaQuatro.setRendaBruta(5000.00);
        pessoaJuridicaQuatro.setCnpj("52025641000102");

        PessoaJuridica pessoaJuridicaCinco = new PessoaJuridica();
        pessoaJuridicaCinco.setNome("Contribuinte Cinco");
        pessoaJuridicaCinco.setRendaBruta(3000.00);
        pessoaJuridicaCinco.setCnpj("27447433000146");

        PessoaJuridica pessoaJuridicaSeis = new PessoaJuridica();
        pessoaJuridicaSeis.setNome("Contribuinte Seis");
        pessoaJuridicaSeis.setRendaBruta(4000.00);
        pessoaJuridicaSeis.setCnpj("22946060000134");

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = pessoaFisicaUm;
        contribuintes[1] = pessoaFisicaDois;
        contribuintes[2] = pessoaFisicaTres;
        contribuintes[3] = pessoaJuridicaQuatro;
        contribuintes[4] = pessoaJuridicaCinco;
        contribuintes[5] = pessoaJuridicaSeis;

        for (Contribuinte c : contribuintes){
            System.out.println(c.toString());
        }

    }

}
