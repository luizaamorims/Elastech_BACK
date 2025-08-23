package aulasjava;

import java.util.Arrays;

public class Aula05 {
    public static void main(String[] args) {


        // 1. Criação e Acesso nos Extremos
        // Crie um array de String com 5 posições. Atribua um valor manualmente apenas à primeira posição (índice 0) и à última posição (índice 4). Imprima no console apenas os valores dessas duas posições.
        String[] nomes = new String[5];

        nomes[0] = "Primeiro";
        nomes[4] = "Último";

        System.out.println("Primeira posição: " + nomes[0]);
        System.out.println("Última posição: " + nomes[4]);

        // 2. Modificação de um Valor Central
        // Crie um array de int já inicializado com os valores {10, 20, 30, 40, 50}. Imprima o array completo usando Arrays.toString(). Em seguida, modifique o valor na terceira posição (índice 2) para 99. Imprima o array completo novamente para ver a alteração.
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Array original: " + Arrays.toString(numeros));
        numeros[2] = 99;
        System.out.println("Array modificado: " + Arrays.toString(numeros));

        // 3. Troca de Valores
        // Crie um array de char com os valores {'A', 'B'}. Seu desafio é trocar os valores de posição entre eles, ou seja, o valor do índice 0 vai para o índice 1, e o do índice 1 vai para o 0. Você precisará de uma variável auxiliar para guardar um dos valores temporariamente. Imprima o array antes e depois da troca.
        char[] letras = {'A', 'B'};
        System.out.println("Antes da troca: " + Arrays.toString(letras));

        char aux = letras[0];
        letras[0] = letras[1];
        letras[1] = aux;

        System.out.println("Depois da troca: " + Arrays.toString(letras));

        // 4. Acessando com Base no Tamanho
        // Crie um array de double com 4 posições. Popule todos os seus valores. Imprima o tamanho do array usando a propriedade .length. Em seguida, imprima o valor do último elemento do array usando a fórmula nomeDoArray[nomeDoArray.length - 1].
        double[] valores = {1.1, 2.9, 3.5, 4.4};

        System.out.println("Tamanho do array: " + valores.length);
        System.out.println("Último elemento: " + valores[valores.length - 1]);

        // 5. Simulação de Cópia Manual
        // Crie dois arrays de int, arrayOriginal com os valores {5, 10, 15} e arrayCopia com 3 posições vazias (new int[3]). Copie manualmente cada elemento do arrayOriginal para a posição correspondente no arrayCopia (ex: arrayCopia[0] = arrayOriginal[0];). Imprima o arrayCopia no final para confirmar que ele contém os mesmos valores.
        int[] arrayOriginal = {5, 10, 15};
        int[] arrayCopia = new int[3];

        arrayCopia[0] = arrayOriginal[0];
        arrayCopia[1] = arrayOriginal[1];
        arrayCopia[2] = arrayOriginal[2];
        System.out.println("Array cópia: " + Arrays.toString(arrayCopia));
    }
}

