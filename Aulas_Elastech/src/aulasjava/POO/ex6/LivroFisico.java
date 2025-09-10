package aulasjava.POO.ex6;

public class LivroFisico extends Livro{


    @Override
    public void aplicarDesconto() {
        System.out.println("desconto de 5% para livros fisicos aplicado");
    }
}
