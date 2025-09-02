package aulasjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AulaMatriz1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Crie uma matriz 2x2 de números inteiros, preencha com valores fixos e exiba todos os elementos da matriz na tela.
        int[][] matriz1 = { {1, 2}, {3, 4} };
        System.out.println("Exercício 1:");
       for (int[] linha : matriz1)
           System.out.println(Arrays.toString(linha));


        // 2. Solicite que o usuário digite 9 números e preencha uma matriz 3x3 com eles. Depois, exiba a matriz.
        int[][] matriz2 = new int[3][3];
        System.out.println("\nExercício 2:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número para matriz2[" + i + "][" + j + "]: ");
                matriz2[i][j] = sc.nextInt();
            }

        System.out.println("Matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matriz2[i][j] + " ");
            System.out.println();
        }

        // 3. Crie uma matriz 2x3 de números inteiros e exiba a soma de todos os seus elementos.
        int[][] matriz3 = { {1, 2, 3}, {4, 5, 6} };
        int soma = 0;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                soma += matriz3[i][j];
        System.out.println("\nExercício 3: Soma dos elementos = " + soma);

        // 4. Crie uma matriz 3x3 com valores inteiros e encontre o maior número presente nela.
        int[][] matriz4 = { {7, 2, 9}, {4, 5, 6}, {1, 8, 3} };
        int maior = matriz4[0][0];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (matriz4[i][j] > maior)
                    maior = matriz4[i][j];
        System.out.println("\nExercício 4: Maior número = " + maior);

        // 5. Crie uma matriz 2x3. Em seguida, crie uma segunda matriz 3x2 e preencha-a com o valores da primeira matriz, mas com as linhas e colunas invertidas (o que era linha na primeira vira coluna na segunda). Imprima a matriz transposta.
        int[][] matriz5 = { {1, 2, 3}, {4, 5, 6} };
        int[][] transposta = new int[3][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                transposta[j][i] = matriz5[i][j];

        System.out.println("\nExercício 5: Matriz transposta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(transposta[i][j] + " ");
            System.out.println();
        }

        // 6. Crie um array de 5 números inteiros e exiba todos os valores usando um foreach.
        int[] array6 = {10, 20, 30, 40, 50};
        System.out.println("\nExercício 6:");
        for (int num : array6)
            System.out.println(num);

        // 7. Crie um ArrayList de números inteiros, adicione 5 valores e calcule a soma usando um foreach.
        ArrayList<Integer> lista7 = new ArrayList<>();
        lista7.add(1);
        lista7.add(2);
        lista7.add(9);
        lista7.add(4);
        lista7.add(3);

        int soma7 = 0;
        for (int num : lista7)
            soma7 += num;
        System.out.println("\nExercício 7: Soma = " + soma7);

        // 8. Crie um ArrayList com nomes de alunos e verifique, usando foreach, se um determinado nome está na lista.
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Ana");
        alunos.add("Vanessa");
        alunos.add("Carlos");
        alunos.add("Maria");
        alunos.add("Eduardo");
        String nomeProcurado = "Carlos";

        boolean encontrado = false;
        for (String nome : alunos)
            if (alunos.contains(nomeProcurado))
                encontrado = true;
        System.out.println("\nExercício 8: " + nomeProcurado + (encontrado ? " está" : " não está") + " na lista.");

        // 9. Crie uma matriz 2x3 com valores inteiros e exiba todos os valores utilizando dois foreach.
        int[][] matriz9 = { {1, 2, 3}, {4, 5, 6} };
        System.out.println("\nExercício 9:");
        for (int[] linha : matriz9)
            for (int valor : linha)
                System.out.println(valor);

        // 10. Crie um ArrayList com números inteiros e conte quantos são pares usando foreach.
        ArrayList<Integer> lista10 = new ArrayList<>();
        lista10.add(2);
        lista10.add(3);
        lista10.add(4);
        lista10.add(5);
        lista10.add(6);
        int pares = 0;

        for (int num : lista10)
            if (num % 2 == 0)
                pares++;
        System.out.println("\nExercício 10: Quantidade de pares = " + pares);

        sc.close();
    }
}
