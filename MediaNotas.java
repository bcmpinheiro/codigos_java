import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número de notas: ");
        int notas = scan.nextInt();

        double soma = 0;
        double media;
        double nota;

        for (int i = 0; i < notas; i++){
            System.out.println("Entre com a nota: " + (i + 1));
            nota = scan.nextDouble();

            soma += nota;
       }
        media = soma / notas;

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
    }
}
