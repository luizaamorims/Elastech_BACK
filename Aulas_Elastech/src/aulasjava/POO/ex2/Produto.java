package aulasjava.POO.ex2;

public class Produto {
    String nome;
    double preco;
    int estoque;

    
    public Produto() {
       this("Sem nome", 0.0, 0);
    }

    
    public Produto(String nome) {
        this(nome, 0.0, 0);
        this.nome = nome;
    }

    
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

   
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$" + String.format("%.2f", this.preco));
        System.out.println("Estoque: " + this.estoque);
    }
}
