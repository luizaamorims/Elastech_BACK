package aulasjava.POO.ex4;

public class AppMain {
    public static void main(String[] args) {


        ControleArCondicionado ar = new ControleArCondicionado();


        ar.mostrarStatus();
        ar.aumentarTemperatura();
        ar.diminuirTemperatura();

        ar.ligar();
        ar.mostrarStatus();


        ar.aumentarTemperatura();
        ar.aumentarTemperatura();
        ar.diminuirTemperatura();
        ar.mostrarStatus();


        for (int i = 0; i < 8; i++) {
            ar.aumentarTemperatura();
        }

        for (int i = 0; i < 15; i++) {
            ar.diminuirTemperatura();
        }

        ar.desligar();
        ar.mostrarStatus();

        System.out.println("\n");



        Funcionario func1 = new Funcionario("João Silva", 2500.00);
        System.out.println("Nome: " + func1.getNome());
        System.out.println("Salário: R$ " + func1.getSalario());


        func1.setSalario(1000.00);


        func1.setSalario(3000.00);
        System.out.println("Novo salário: R$ " + func1.getSalario());


        System.out.println("\nCriando funcionário com salário inválido:");
        Funcionario func2 = new Funcionario("Maria Santos", 800.00);
        System.out.println("Salário do func2: R$ " + func2.getSalario());

        System.out.println("\n");




        Livro livro1 = new Livro("1984", "George Orwell");
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");

        System.out.println("Livro 1: " + livro1.getTitulo() + " - " + livro1.getAutor());
        System.out.println("Status: " + livro1.getStatus());


        livro1.emprestar();
        System.out.println("Status após empréstimo: " + livro1.getStatus());


        livro1.emprestar();


        livro1.devolver();
        System.out.println("Status após devolução: " + livro1.getStatus());


        livro1.devolver();


        System.out.println("\nTestando segundo livro:");
        System.out.println("Livro 2: " + livro2.getTitulo() + " - Status: " + livro2.getStatus());
        livro2.emprestar();
        livro2.devolver();

        System.out.println("\n");


        Produto produto1 = new Produto("Notebook", 2500.00, 10);
        Produto produto2 = new Produto("Mouse", 50.00, 25);

        System.out.println("Produto 1: " + produto1.getNome());
        System.out.println("Preço: R$ " + produto1.getPreco());
        System.out.println("Estoque: " + produto1.getEstoque());
        System.out.println("Valor total em estoque: R$ " + produto1.getValorTotalEmEstoque());

        produto1.setPreco(2800.00);
        produto1.setPreco(-100.00);

        produto1.setEstoque(15);
        produto1.setEstoque(-5);

        System.out.println("\nApós alterações:");
        System.out.println("Preço: R$ " + produto1.getPreco());
        System.out.println("Estoque: " + produto1.getEstoque());
        System.out.println("Valor total em estoque: R$ " + produto1.getValorTotalEmEstoque());

        System.out.println("\nProduto 2: " + produto2.getNome());
        System.out.println("Preço: R$ " + produto2.getPreco());
        System.out.println("Estoque: " + produto2.getEstoque());
        System.out.println("Valor total em estoque: R$ " + produto2.getValorTotalEmEstoque());


        Produto[] produtos = {produto1, produto2};
        double valorTotalGeral = 0;

        for (Produto p : produtos) {
            System.out.printf("%-15s | Preço: R$ %-8.2f | Estoque: %-3d | Total: R$ %.2f%n",
                    p.getNome(), p.getPreco(), p.getEstoque(), p.getValorTotalEmEstoque());
            valorTotalGeral += p.getValorTotalEmEstoque();
        }

        System.out.printf("Valor total de todos os produtos em estoque: R$ %.2f%n", valorTotalGeral);


    }
}
