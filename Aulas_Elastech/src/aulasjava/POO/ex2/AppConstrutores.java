package aulasjava.POO.ex2;

public class AppConstrutores {
    public static void main(String[] args) {


        System.out.println("Exercício 1: ");
        Carro meuCarro = new Carro();
        meuCarro.exibirValores();
        System.out.println();

        System.out.println("Exercício 2: ");
        Aluno aluno1 = new Aluno("Carla", 20);
        Aluno aluno2 = new Aluno("Carlos", 22);
        System.out.println("Aluno 1:");
        aluno1.exibirDados();
        System.out.println("\nAluno 2:");
        aluno2.exibirDados();
        System.out.println();

        System.out.println("Exercício 3: ");
        Livro livro1 = new Livro("A Culpa é das estrelas");
        Livro livro2 = new Livro("Noites Brancas", "Fiódor Dostoiévski");
        System.out.println("Livro 1 (apenas título):");
        livro1.exibirDados();
        System.out.println("\nLivro 2 (título e autor):");
        livro2.exibirDados();
        System.out.println();

        System.out.println("Exercício 4: ");
        Produto produto1 = new Produto();
        Produto produto2 = new Produto("Café");
        Produto produto3 = new Produto("Leite", 5.50, 50);
        System.out.println("Produto 1 (Construtor Padrão):");
        produto1.exibirDados();
        System.out.println("\nProduto 2 (Construtor com nome):");
        produto2.exibirDados();
        System.out.println("\nProduto 3 (Construtor completo):");
        produto3.exibirDados();
        System.out.println();

        System.out.println("Exercício 5: ");
        Filme meuFilme = new Filme("Interestelar", "Christopher Nolan", 2014);
        meuFilme.mostrarDetalhes();
        System.out.println();

        System.out.println("Exercício 6: ");
        AlunoNotas aluno = new AlunoNotas("Eduardo");
        aluno.adicionarNota(1, 8.5);
        aluno.adicionarNota(2, 6.0);
        aluno.adicionarNota(3, 9.5);
        aluno.adicionarNota(4, 7.0);
        aluno.verificarStatus();

    }
}
