public class PrecoPao {
  public static void main(String[] args) {
    System.out.println("Preço do Pão: R$: 0.18");
    System.out.println("Panificadora Pão de Ontem - Tabela de Preços");

    for (int i = 1; i <= 50; i++) {
      System.out.println(i + " - R$: " + (0.18 * i));
    }
  }
}
