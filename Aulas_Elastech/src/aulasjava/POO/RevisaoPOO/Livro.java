package aulasjava.POO.RevisaoPOO;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibirInfo(){
        System.out.println("Livro: " + this.titulo);
        System.out.println("Autor: " + this.autor);
    }
}
