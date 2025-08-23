package aulasjava;
import java.util.Random;
import java.util.Scanner;
public class Aula04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. A Tabuada Personalizada
        // Peça ao usuário para digitar um número inteiro e imprima a tabuada desse número de 1 a 10.
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // 2. Soma dos Números Pares
        // Calcule e imprima a soma de todos os números pares entre 1 e 100 (inclusive).
        int somaPares = 0;
        for (int i = 2; i <= 100; i += 2) {
            somaPares += i;
        }
        System.out.println("Soma dos números pares de 1 a 100: " + somaPares);

        // 3. Validação de Entrada
        // Peça ao usuário para digitar uma idade válida (entre 0 e 100).
        int idade;
        do {
            System.out.print("Digite uma idade (0 a 100): ");
            idade = sc.nextInt();
        } while (idade < 0 || idade > 100);
        System.out.println("Idade válida digitada: " + idade);

        // 4. Contagem regressiva de 10 a 1 (while)
        // Imprima os números de 10 a 1 usando um loop while.
        int cont = 10;
        while (cont >= 1) {
            System.out.println(cont);
            cont--;
        }

        // 5. Somar números até que o usuário digite 0 (do-while)
        // Some números digitados pelo usuário até que ele digite 0.
        int soma = 0;
        int valor;
        do {
            System.out.print("Digite um número para somar (0 para sair): ");
            valor = sc.nextInt();
            soma += valor;
        } while (valor != 0);
        System.out.println("Soma total: " + soma);

        sc.close();

        // 1. Sequência de Fibonacci
        // Imprime os primeiros 15 números da sequência de Fibonacci usando um loop for.
        int a = 0;
        int b = 1;
        System.out.print("Sequência de Fibonacci: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(a + (i < 14 ? ", " : "\n"));
            int temp = a + b;
            a = b;
            b = temp;
        }

        // 2. Desenhando um Triângulo de Asteriscos
        // Desenha um triângulo de asteriscos com 10 linhas de altura usando loops aninhados.
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3. Soma de Compras até Parar
        // Simula um caixa de supermercado, somando valores até o usuário digitar 0.
        double total = 0, valorProduto;
        do {
            System.out.print("Digite o valor do produto (0 para finalizar): ");
            valorProduto = sc.nextDouble();
            total += valorProduto;
        } while (valorProduto != 0);
        System.out.printf("Valor total da compra: R$ %.2f\n", total);

        // 4. Adivinhe o Número Secreto
        // Jogo onde o usuário tenta adivinhar um número aleatório entre 1 e 100.
        int numeroSecreto = new Random().nextInt(100) + 1;
        int palpite;
        System.out.println("Adivinhe o número secreto entre 1 e 100!");
        do {
            System.out.print("Seu palpite: ");
            palpite = sc.nextInt();
            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior!");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor!");
            }
        } while (palpite != numeroSecreto);
        System.out.println("Parabéns! Você acertou o número secreto :)) ");

        // 5. Verificador de Número Primo
        // Verifica se um número digitado pelo usuário é primo.
//        System.out.print("Digite um número inteiro positivo para verificar se é primo: ");
//        int numero = sc.nextInt();
//        boolean ehPrimo = true;
//        if (numero <= 1) {
//            ehPrimo = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(numero); i++) {
//                if (numero % i == 0) {
//                    ehPrimo = false;
//                    break;
//                }
//            }
//        }
//        if (ehPrimo) {
//            System.out.println(numero + " é primo.");
//        } else {
//            System.out.println(numero + " não é primo.");
//        }

    }
}

