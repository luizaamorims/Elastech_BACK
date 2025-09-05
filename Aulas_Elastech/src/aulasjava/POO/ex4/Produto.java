package aulasjava.POO.ex4;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setPreco(double valor) {
        if (valor >= 0) {
            this.preco = valor;
            System.out.println("Preço definido com sucesso: R$ " + valor);
        } else {
            System.out.println("Erro: Preço não pode ser negativo");
            return;
        }
    }

    public void setEstoque(int quantidade) {
        if (quantidade >= 0) {
            this.estoque = quantidade;
            System.out.println("Estoque definido com sucesso: " + quantidade + " unidades");
        } else {
            System.out.println("Erro: Estoque não pode ser negativo");
            return;
        }
    }

    public double getValorTotalEmEstoque() {
        return preco * estoque;
    }
}
