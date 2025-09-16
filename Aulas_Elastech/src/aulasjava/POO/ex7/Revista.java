package aulasjava.POO.ex7;

public class Revista extends Produto implements Promocional{

    public Revista(int preco) {
        super(preco);
    }

    public void aplicarDesconto(double valor) {
        System.out.println("desconto de 5% para revistas aplicado");
    }
}
