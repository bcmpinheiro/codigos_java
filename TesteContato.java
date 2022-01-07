public class TesteContato {

  public static void main(String[] args) {

    Contato contato1 = new Contato();
    contato1.nome = "Joao";
    contato1.endereco = "Av Paulista, 1000";
    contato1.email = "joao@teste.com";

    contato1.telefones = new String[2];
    contato1.telefones[0] = "(11) 91234-5678";
    contato1.telefones[1] = "(11) 1234-5678";

    Contato contato2 = new Contato();
    contato2.nome = "Maria";
    contato2.endereco = "Av Paulista, 1001";
    contato2.email = "maria@teste.com";

    contato2.telefones = new String[2];
    contato2.telefones[0] = "(11) 98765-4321";
    contato2.telefones[1] = "(11) 8765-4321";

    System.out.println(contato1.nome + " - " + contato1.telefones[1]);
    System.out.println(contato2.nome + " - " + contato2.telefones[0]);

  }
}
