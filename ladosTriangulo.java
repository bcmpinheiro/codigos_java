import java.util.Scanner;

public class ladosTriangulo {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Você quer saber os tipos de triângulo? Digite o valor de um dos lados:");
    double lado01 = scan.nextDouble();
    System.out.println("Digite o valor de mais um dos lados:");
    double lado02 = scan.nextDouble();
    System.out.println("Digite o valor do último lado:");
    double lado03 = scan.nextDouble();

    if ((lado01 == lado02) && (lado01 == lado03) && (lado02 == lado03)) {
      System.out.println("Os valores digitados é de um triângulo equilatero, pois possui todos os lados iguais");
    } else if ((lado01 == lado02) || (lado01 == lado03) || (lado02 == lado03)) {
      System.out.println("Os valores digitados é de um triângulo isóceles, pois possui quaisquer dois lados iguais");
    } else if ((lado01 != lado02) || (lado01 != lado03) || (lado02 != lado03)) {
      System.out.println("Os valores digitados é de um triângulo escaleno, pois possui todos os lados diferentes");
    }
  }
}
