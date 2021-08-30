import java.util.Scanner;

public class validaVogalOuConsoante {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Insira uma letra do alfabeto para sabermos se é considerada vogal ou consoante: ");
    String vogal = scan.nextLine();

    if ((vogal.equals("A")) || (vogal.equals("a"))) {
      System.out.println("É uma vogal!");
    } else if (vogal.equals("E") || (vogal.equals("e"))) {
      System.out.println("É uma vogal!");
    } else if (vogal.equals("I") || (vogal.equals("i"))) {
      System.out.println("É uma vogal!");
    } else if (vogal.equals("O") || (vogal.equals("o"))) {
      System.out.println("É uma vogal!");
    } else if (vogal.equals("U") || (vogal.equals("u"))) {
      System.out.println("É uma vogal!");
    } else {
      System.out.println("É uma consoante!");
    }
  }
}
