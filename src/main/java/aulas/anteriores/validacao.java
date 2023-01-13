package src.main.java.aulas.anteriores;

import java.util.Scanner;

public class validacao {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    boolean validaDados = false;
    String nome, sexo, estadoCivil;
    int idade;
    double salario;

    do {
      System.out.println("Digite seu nome: ");
      nome = scan.next();

      if (nome.length() >= 3) {
        validaDados = true;
      } else {
        // validaDados = false;
        System.out.println("O nome precisa de no minimo 3 caracteres.");
      }
    } while (!validaDados);

    validaDados = false;
    do {
      System.out.println("Digite sua idade: ");
      idade = scan.nextInt();

      if (idade >= 0 && idade <= 150) {
        validaDados = true;
      } else {
        System.out.println("Idade precisa ser entre 0 e 150.");
      }
    } while (!validaDados);

    validaDados = false;
    do {
      System.out.println("Digite seu salário: ");
      salario = scan.nextDouble();

      if (salario > 0) {
        validaDados = true;
      } else {
        System.out.println("Salário precisa ser maior que 0.");
      }
    } while (!validaDados);

    validaDados = false;
    do {
      System.out.println("Digite seu sexo: ");
      sexo = scan.next();

      if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
        validaDados = true;
      } else {
        System.out.println("Sexo precisa ser 'f' ou 'm'.");
      }
    } while (!validaDados);

    validaDados = false;
    do {
      System.out.println("Digite seu estado civil: ");
      estadoCivil = scan.next();

      if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v")
          || estadoCivil.equalsIgnoreCase("d")) {
        validaDados = true;
      } else {
        System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'.");
      }
    } while (!validaDados);

  }
}
