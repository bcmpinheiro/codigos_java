import java.util.Scanner;

public class SomaEMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        double media;

        for (int indice = 0; indice < 5; indice++) {
            System.out.println("Entre com um numero: ");
            numero = scan.nextInt();

            soma += numero;
        }

        media = soma / 5;
        System.out.println("Soma: "+ soma);
        System.out.println("Media: "+ media);
    }
  }
