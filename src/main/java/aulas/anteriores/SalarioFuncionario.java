package src.main.java.aulas.anteriores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioFuncionario {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double salario = 1000; // 95

    double percentual = 1.5; // 96

    salario += (salario / 100) * percentual; // 96

    DecimalFormat format = new DecimalFormat("###,###.###");

    for (int i = 1997; i < 2022; i++) {
      percentual *= 2;
      salario += (salario / 100) * percentual;
      System.out.println(i + " = " + format.format(salario) + " - " + percentual + " %");
    }
  }
}
