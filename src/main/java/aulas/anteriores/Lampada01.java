package src.main.java.aulas.anteriores;

public class Lampada01 {

  String modelo;
  String tensao;
  int potencia;
  String cor;
  String tipoLuz;
  int garantiaMeses;
  String[] tipos;
  boolean tipoAbajur;

  boolean ligada;

  void ligar() {
    ligada = true;
  }

  void desligar() {
    ligada = false;
  }

  void mostrarEstado() {
    if (ligada) {
      System.out.println("Lampada está: ligada!");
    } else {
      System.out.println("Lampada está: desligada!");
    }
  }

  void mudarEstado() {
    if (ligada) {
      desligar();
    } else {
      ligar();
    }
  }

}
