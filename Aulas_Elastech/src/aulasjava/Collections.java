package aulasjava;

import java.util.Stack;
import java.util.*;

public class Collections {
    public static void main(String[] args) {

       // 1. Organizando uma Pilha de Livros
        // Enunciado: Crie um programa que simule a organização de uma pequena pilha de livros. Crie uma Stack de String. "Empilhe" (push) os seguintes títulos de livros na ordem:
        // "O Senhor dos Anéis", "O Hobbit", "Silmarillion"
        // Depois de empilhar, "desempilhe" (pop) todos os livros da pilha, um por um, imprimindo o título de cada livro que é retirado. Observe a ordem em que eles são impressos.
        Stack<String> livros = new Stack<>();
        livros.push("O Senhor dos Anéis");
        livros.push("O Hobbit");
        livros.push("Silmarillion");

        System.out.println("Exercício 1: Desempilhando livros:");
        while (!livros.isEmpty()) {
            System.out.println(livros.pop());
        }

        // 2. Invertendo uma Palavra
        // Enunciado: Escreva um programa que use uma Stack para inverter uma palavra. Crie uma String (ex: "Java"). Use um loop para percorrer a palavra e empilhar (push) cada um de seus caracteres (char) na pilha. Em seguida, use outro loop para desempilhar (pop) os caracteres um por um e construir a palavra invertida. Imprima o resultado final.
        String palavra = "Java";
        Stack<Character> pilhaChar = new Stack<>();
        for (char c : palavra.toCharArray()) {
            pilhaChar.push(c);
        }
        String invertida = "";
        while (!pilhaChar.isEmpty()) {
            invertida += pilhaChar.pop();
        }
        System.out.println("\nExercício 2: Palavra invertida = " + invertida);

        // 3. Simples Histórico de Navegação
        // Enunciado: Crie um programa que simule o histórico de um navegador usando uma Stack de String.
        // Simule a visita a 3 sites, "empilhando" (push) suas URLs.
        // Imprima qual é a página atual usando o método peek().
        // Simule o clique no botão "voltar" duas vezes, usando o método pop().
        // Após cada "volta", imprima qual é a nova página atual (usando peek() novamente).
        Stack<String> historico = new Stack<>();
        historico.push("google.com");
        historico.push("oracle.com");
        historico.push("github.com");

        System.out.println("\nExercício 3: Página atual: " + historico.peek());
        historico.pop();
        System.out.println("Após voltar uma página: " + historico.peek());
        historico.pop();
        System.out.println("Após voltar mais uma página: " + historico.peek());

        // 4. Desempilhando Pratos
        // Enunciado: Crie uma Stack de Integer para representar uma pilha de pratos, onde cada prato tem um número de identificação. Empilhe 5 pratos com os números 10, 20, 30, 40 e 50. Seu programa deve então simular a retirada de 2 pratos (pop). Por fim, ele deve apenas "espiar" (peek) qual é o próximo prato no topo da pilha, sem removê-lo, e imprimir seu número.
        Stack<Integer> pratos = new Stack<>();
        pratos.push(10);
        pratos.push(20);
        pratos.push(30);
        pratos.push(40);
        pratos.push(50);
        pratos.pop();
        pratos.pop();
        System.out.println("\nExercício 4: Próximo prato no topo: " + pratos.peek());
    }
}
