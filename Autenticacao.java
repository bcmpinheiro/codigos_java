import java.util.Scanner;

public class Autenticacao {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    boolean senhaValida = false;
    String nome;
    String senha;

    do {
      System.out.println("Informe seu nome: ");
      nome = scan.next();

      System.out.println("Informe uma senha: ");
      senha = scan.next();

      if (nome.equalsIgnoreCase(senha)) {
        // senhaValida = false;
        System.out.println("Senha iválida, está igual ao nome. Digite novamente!");
      } else {
        senhaValida = true;
        System.out.println("Informações Válidas!");
      }
    } while (!senhaValida);
  }
}