import java.util.Scanner;

public class verificaPreco {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o valor de um produto que você queira comprar: ");
    double preco01 = scan.nextDouble();
    System.out.println("Digite o valor de outro produto que você queira comprar: ");
    double preco02 = scan.nextDouble();
    System.out.println("Digite o valor do último produto que você queira comprar: ");
    double preco03 = scan.nextDouble();

    if ((preco01 < preco02) && (preco01 < preco03)) {
      System.out.println("O primeiro produto está mais barato:  " + preco01);
    } else if ((preco02 < preco01) && (preco02 < preco03)) {
      System.out.println("O segundo produto está mais barato:  " + preco02);
    } else if ((preco03 < preco01) && (preco03 < preco02)) {
      System.out.println("O terceiro produto está mais barato:  " + preco03);
    }
  }
}
