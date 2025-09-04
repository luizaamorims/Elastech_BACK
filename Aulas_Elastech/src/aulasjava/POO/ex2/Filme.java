package aulasjava.POO.ex2;

public class Filme {
    private String titulo;
    private String diretor;
    private int anoLancamento;


    public Filme(String titulo, String diretor, int anoLancamento) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
    }


    public void mostrarDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Diretor: " + this.diretor);
        System.out.println("Ano de Lançamento: " + this.anoLancamento);
    }
}
