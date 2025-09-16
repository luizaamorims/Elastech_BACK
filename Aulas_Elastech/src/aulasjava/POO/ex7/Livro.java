package aulasjava.POO.ex7;

public class Livro extends Produto implements Promocional{

    public Livro(int preco) {
        super(preco);
    }

    public void aplicarDesconto(double valor) {
        System.out.println("desconto de 10% para livros aplicado");
    }
}
