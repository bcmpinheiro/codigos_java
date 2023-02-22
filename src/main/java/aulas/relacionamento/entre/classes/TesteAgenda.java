package src.main.java.aulas.relacionamento.entre.classes;

import java.util.Scanner;

public class TesteAgenda {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda: ");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda();
        agenda.setNome(nome);

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < 3; i++){
            System.out.println("Entre com as informacoes do contato " + (i + 1));
            Contato c = new Contato();

            System.out.println("Entre com o nome: ");
            nome = scan.nextLine();
            c.setNomeContato(nome);

            System.out.println("Entre com o telefone: ");
            String telefone = scan.nextLine();
            c.setTelefoneContato(telefone);

            System.out.println("Entre com o email: ");
            String email = scan.nextLine();
            c.setEmailContato(email);

            contatos[i] = c;
        }
        agenda.setContatos(contatos);

        if (agenda != null){
            System.out.println(agenda.obterInfo());
        }
    }
}
