package aulasjava.POO.ex2;

public class Aluno {
    String nome;
    int idade;


    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

}
