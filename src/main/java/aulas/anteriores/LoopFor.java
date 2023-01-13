package src.main.java.aulas.anteriores;

public class LoopFor {

  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {
      System.out.println("O valor de i: " + i);
    }

    for (int i = 5; i > 0; i--) {
      System.out.println("O valor de i: " + i);
    }

    for (int i = 0, j = 10; i < j; i++, j--) {
      System.out.println("i = " + i + "; = " + j);
    }

    int count = 0;
    for (; count < 10;) {
      System.out.println("valor de count: " + count);
      count += 2; // contando de dois em dois
    }

    int soma = 0;
    for (int i = 1; i < 5; soma += i++)
      ;
    System.out.println("O valor da soma é: " + soma);
  }

}
