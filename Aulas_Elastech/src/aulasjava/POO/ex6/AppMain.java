package aulasjava.POO.ex6;

public class AppMain {
    public static void main(String[] args) {

        System.out.println("--- EXERCICIOS 1 e 2: Veículos e Oficina ---");

        Oficina oficina = new Oficina();
        Carro carro = new Carro();
        Moto moto = new Moto();


        oficina.manutencao(carro);
        oficina.manutencao(moto);


        System.out.println("--- EXERCICIOS 3 e 4: Formas Geométricas ---");


        PainelDeDesenho painel = new PainelDeDesenho();
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();


        painel.desenharForma(circulo);
        painel.desenharForma(quadrado);


        System.out.println("--- EXERCICIO 5: Sistema de Livros ---");


        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Ebook ebook = new Ebook();
        LivroFisico livroFisico = new LivroFisico();


        carrinho.adicionarLivro(ebook);
        carrinho.adicionarLivro(livroFisico);


    }
}

