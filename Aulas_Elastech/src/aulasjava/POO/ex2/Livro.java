package aulasjava.POO.ex2;

public class Livro {
    String titulo;
    String autor;


    public Livro(String titulo) {
      this(titulo, "Desconhecido");
       this.titulo = titulo;
    }


    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }


    public void exibirDados() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
    }
}


