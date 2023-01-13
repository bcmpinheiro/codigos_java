package src.main.java.aulas.anteriores;

public class NumerosImpares {

  public static void main(String[] args) {

    for (int indice = 1; indice < 50; indice++) {

      if (indice % 2 != 0) {
        System.out.print(indice + " ");
      }
    }
  }
}
