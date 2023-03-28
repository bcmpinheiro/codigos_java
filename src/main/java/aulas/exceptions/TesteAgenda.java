package src.main.java.aulas.exceptions;

import java.util.Scanner;

public class TesteAgenda {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = obterOpcaoMenu(scan);

        if(opcao == 1){//consultar contato
            String nomeContato = leInformacaoString(scan, "Entre com o nome do contato a ser pesquisado");
            if(agenda.consultaContatoPorNome(nomeContato) >= 0){
                System.out.println("Contato existe!");
            }
        }else if (opcao ==2){//adicionar contato

        }else if (opcao ==3){//sair
            System.exit(0);
        }
    }

    public static String leInformacaoString(Scanner scan, String msg){
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner scan){

        boolean entradaValida = false;
        int opcao = 3;

        while(!entradaValida){
            System.out.println("Digite a opcao desejada: ");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair");

            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if(opcao == 1 || opcao == 2 || opcao == 3){
                    entradaValida = true;
                }else{
                    throw new Exception("Entrada Invalida!");
                }
            }
            catch (Exception exception){
                System.out.println("Entrada invalida, digite novamente\n");
            }
        }

        return opcao;
    }
}
