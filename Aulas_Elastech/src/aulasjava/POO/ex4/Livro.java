package aulasjava.POO.ex4;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro '" + titulo + "' emprestado com sucesso!");
        } else {
            System.out.println("Erro: Livro '" + titulo + "' já está emprestado");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro '" + titulo + "' devolvido com sucesso!");
        } else {
            System.out.println("Erro: Livro '" + titulo + "' já estava disponível");
        }
    }

    public String getStatus() {
        return disponivel ? "Disponível" : "Emprestado";
    }
}
