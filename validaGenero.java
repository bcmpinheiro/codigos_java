import java.util.Scanner;

public class validaGenero {
  // código valida genêro digitando F ou M e indica se está invalido a entrada

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Qual o seu genêro? Masculino ou Feminino? Digite M ou F: ");
    String genero = scan.next();
    System.out.println("Seu genero é: " + genero);

    if (genero.equals("M") || (genero.equals("m"))) {
      System.out.printf("Seja Bem Vindo!");
    } else if (genero.equals("F") || (genero.equals("f"))) {
      System.out.printf("Seja Bem Vinda!");
    } else {
      System.out.println("Não é uma letra que corresponde a um genero válido neste caso!");
    }
  }
}
