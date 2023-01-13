package src.main.java.aulas.anteriores;

public class TesteLivro {

  public static void main(String[] args) {

    Livro livroDeLivraria = new Livro();
    livroDeLivraria.titulo = "Livro de Livraria";
    livroDeLivraria.autor = "Ana Ana Ana";
    livroDeLivraria.genero = "Suspense";
    livroDeLivraria.tamanho = "Grande";
    livroDeLivraria.qtdPaginas = 300;
    livroDeLivraria.valor = 37.83;

    Livro livroDeBiblioteca = new Livro();
    livroDeBiblioteca.titulo = "Livro de Biblioteca";
    livroDeBiblioteca.autor = "Maria Maria";
    livroDeBiblioteca.genero = "Ação";
    livroDeBiblioteca.tamanho = "Pequeno";
    livroDeBiblioteca.qtdPaginas = 50;
    livroDeBiblioteca.valor = 13.29;

    System.out.println(livroDeLivraria.titulo + " - " + livroDeLivraria.autor + " - " + livroDeLivraria.genero + " - "
        + "R$: " + livroDeLivraria.valor);

    System.out.println(livroDeBiblioteca.titulo + " - " + livroDeBiblioteca.autor + " - " + livroDeBiblioteca.genero
        + " - " + "R$: " + livroDeBiblioteca.valor);

  }
}
