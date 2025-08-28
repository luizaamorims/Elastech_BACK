package aulasjava;

import java.util.ArrayList;
import java.util.Scanner;

public class RevisaoJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("EXERCÍCIOS DE REVISÃO JAVA");
        System.out.println("Descomente o exercício para executar:");

        //exercicio1();
        //exercicio2(sc);
        //exercicio3(sc);
        //exercicio4(sc);
        //exercicio5();
        //exercicio6(sc);
        //exercicio7(sc);
        //exercicio8(sc);
        //exercicio9();
        exercicio10(sc);

        sc.close();
    }

    /*
    EXERCÍCIO 1 – Declaração e uso de variáveis

    Crie um programa que declare:
    - Uma variável String com seu nome
    - Uma variável int com sua idade
    - Uma variável double com sua altura
    */
    public static void exercicio1() {
        System.out.println("EXERCÍCIO 1 - Declaração de Variáveis ");

        String nome = "João Silva";
        int idade = 25;
        double altura = 1.75;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
    }

    /*
    EXERCÍCIO 2 – Operações Aritméticas

    Peça ao usuário dois números inteiros, calcule:
    - A soma
    - A subtração
    - A multiplicação
    - A divisão
    Mostre os resultados.
    */
    public static void exercicio2(Scanner sc) {
        System.out.println(" EXERCÍCIO 2 - Operações Aritméticas ");

        // Solicitando os dois números
        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();


        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Soma: " + numero1 + " + " + numero2 + " = " + soma);
        System.out.println("Subtração: " + numero1 + " - " + numero2 + " = " + subtracao);
        System.out.println("Multiplicação: " + numero1 + " × " + numero2 + " = " + multiplicacao);


        if (numero2 != 0) {
            double divisao = (double) numero1 / numero2;
            System.out.printf("Divisão: %d ÷ %d = %.2f\n", numero1, numero2, divisao);
        } else {
            System.out.println("Divisão: Não é possível dividir por zero :( ");
        }
    }

    /*
    EXERCÍCIO 3 – Condicional IF/ELSE

    Peça ao usuário sua idade.
    Se for maior ou igual a 18, exiba "Você é maior de idade".
    Caso contrário, exiba "Você é menor de idade".
    */
    public static void exercicio3(Scanner sc) {
        System.out.println("EXERCÍCIO 3 - Condicional IF/ELSE ");


        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }

    /*
    EXERCÍCIO 4 – Switch

    Peça ao usuário para digitar um número de 1 a 7
    e exiba o dia da semana correspondente.
    */
    public static void exercicio4(Scanner sc) {
        System.out.println("\n EXERCÍCIO 4 - Switch ");

        System.out.print("Digite um número de 1 a 7: ");
        int dia = sc.nextInt();


        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido! Digite um número de 1 a 7.");
        }
    }

    /*
    EXERCÍCIO 5 – Loop FOR

    Mostre na tela todos os números de 1 a 20
    e ao lado de cada um indique se ele é par ou ímpar.
    */
    public static void exercicio5() {
        System.out.println("\n EXERCÍCIO 5 - Loop FOR ");


        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - Par");
            } else {
                System.out.println(i + " - Ímpar");
            }
        }
    }

    /*
    EXERCÍCIO 6 – Loop WHILE

    Peça números ao usuário até que ele digite 0.
    Quando isso acontecer, exiba a soma de todos os números digitados.
    */
    public static void exercicio6(Scanner sc) {
        System.out.println("\n EXERCÍCIO 6 - Loop WHILE ");

        int numero = -1;
        int soma = 0;

        System.out.println("Digite números (digite 0 para parar):");

       while (numero != 0){
          int numeroresp = sc.nextInt();
          soma += numeroresp;
          numero = numeroresp;

       }

        System.out.println("Soma total dos números digitados: " + soma);
    }

    /*
    EXERCÍCIO 7 – Arrays

    Crie um array de int com tamanho 5.
    Peça ao usuário para informar 5 números e armazene-os no array.
    Depois, exiba:
    - Todos os números digitados
    - A soma total deles
    */
    public static void exercicio7(Scanner sc) {
        System.out.println("\n EXERCÍCIO 7 - Arrays");

        int[] numeros = new int[5];
        int soma = 0;

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        System.out.print("\nNúmeros digitados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\nSoma total: " + soma);
    }

    /*
    EXERCÍCIO 8 – ArrayList

    Crie um ArrayList<String> para armazenar nomes.
    - Adicione 5 nomes informados pelo usuário
    - Exiba a lista completa
    - Pergunte um nome e diga se ele existe na lista
    */
    public static void exercicio8(Scanner sc) {
        System.out.println("\n EXERCÍCIO 8 - ArrayList ");

        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite 5 nomes:");
        sc.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            String nome = sc.nextLine();
            nomes.add(nome);
        }

        System.out.println("\n Lista de nomes:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println((i + 1) + ". " + nomes.get(i));
        }

        System.out.print("\n Digite um nome para buscar: ");
        String nomeBusca = sc.nextLine();

        if (nomes.contains(nomeBusca)) {
            System.out.println("O nome '" + nomeBusca + "' existe na lista!");
        } else {
            System.out.println("O nome '" + nomeBusca + "' NÃO existe na lista!");
        }
    }

    /*
    EXERCÍCIO 9 – IF + LOOP + ARRAY

    Utilizando um int[] com 10 números fixos,
    mostre apenas os números maiores que 50.
    */
    public static void exercicio9() {
        System.out.println("\n EXERCÍCIO 9 - IF + LOOP + ARRAY");

        int[] numeros = {25, 67, 34, 89, 12, 56, 78, 23, 91, 45};

        System.out.println("Array completo:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\n\nNúmeros maiores que 50:");

        for (int numero : numeros) {
            if (numero > 50) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }

    /*
    ATIVIDADE 10 – Sistema de Conta Bancária

    Sistema simples de conta bancária utilizando todos os conceitos:
    - Variáveis, condições (if/else), loops, switch, arrays

    Menu:
    1 - Criar nova conta
    2 - Depositar
    3 - Sacar
    4 - Ver saldo de uma conta
    5 - Listar todas as contas
    6 - Sair

    Regras:
    - Arrays paralelos para armazenar dados das contas
    - Número da conta não pode ser repetido
    - Verificar saldo antes do saque
    */
    public static void exercicio10(Scanner sc) {
        System.out.println("ATIVIDADE 10 - Sistema de Conta Bancária");

        ArrayList<Integer> numerosConta = new ArrayList<>();
        ArrayList<String> titulares = new ArrayList<>();
        ArrayList<Double> saldos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1 - Criar nova conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Ver saldo de uma conta");
            System.out.println("5 - Listar todas as contas");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("CRIAR NOVA CONTA");
                    System.out.print("Digite o número da conta: ");
                    int numeroConta = sc.nextInt();
                    sc.nextLine();


                    if (numerosConta.contains(numeroConta)) {
                        System.out.println("ERRO: Número da conta já existe!");
                    } else {
                        System.out.print("Digite o nome do titular: ");
                        String titular = sc.nextLine();

                        System.out.print("Digite o saldo inicial (mínimo R$ 0,00): ");
                        double saldoInicial = sc.nextDouble();

                        if (saldoInicial < 0) {
                            System.out.println("ERRO: Saldo inicial não pode ser negativo!");
                        } else {
                            numerosConta.add(numeroConta);
                            titulares.add(titular);
                            saldos.add(saldoInicial);

                            System.out.println("Conta criada com sucesso!");
                            System.out.printf("Conta: %d | Titular: %s | Saldo: R$ %.2f\n",
                                    numeroConta, titular, saldoInicial);
                        }
                    }
                    break;

                case 2:
                    System.out.println("DEPOSITAR");

                    if (numerosConta.isEmpty()) {
                        System.out.println("Nenhuma conta cadastrada!");
                    } else {
                        System.out.print("Digite o número da conta: ");
                        int contaDeposito = sc.nextInt();

                        int indiceDeposito = numerosConta.indexOf(contaDeposito);

                        if (indiceDeposito == -1) {
                            System.out.println("ERRO: Conta não encontrada!");
                        } else {
                            System.out.print("Digite o valor do depósito: R$ ");
                            double valorDeposito = sc.nextDouble();

                            if (valorDeposito <= 0) {
                                System.out.println("ERRO: Valor deve ser positivo!");
                            } else {
                                double saldoAtual = saldos.get(indiceDeposito);
                                double novoSaldo = saldoAtual + valorDeposito;
                                saldos.set(indiceDeposito, novoSaldo);

                                System.out.println("Depósito realizado com sucesso!");
                                System.out.printf("Saldo anterior: R$ %.2f\n", saldoAtual);
                                System.out.printf("Valor depositado: R$ %.2f\n", valorDeposito);
                                System.out.printf("Novo saldo: R$ %.2f\n", novoSaldo);
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("SACAR");

                    if (numerosConta.isEmpty()) {
                        System.out.println("Nenhuma conta cadastrada!");
                    } else {
                        System.out.print("Digite o número da conta: ");
                        int contaSaque = sc.nextInt();


                        int indiceSaque = numerosConta.indexOf(contaSaque);

                        if (indiceSaque == -1) {
                            System.out.println("ERRO: Conta não encontrada!");
                        } else {
                            double saldoAtual = saldos.get(indiceSaque);

                            System.out.printf("Saldo atual: R$ %.2f\n", saldoAtual);
                            System.out.print("Digite o valor do saque: R$ ");
                            double valorSaque = sc.nextDouble();

                            if (valorSaque <= 0) {
                                System.out.println("ERRO: Valor deve ser positivo!");
                            } else if (valorSaque > saldoAtual) {
                                System.out.println("ERRO: Saldo insuficiente!");
                                System.out.printf("Valor solicitado: R$ %.2f\n", valorSaque);
                                System.out.printf("Saldo disponível: R$ %.2f\n", saldoAtual);
                            } else {
                                double novoSaldo = saldoAtual - valorSaque;
                                saldos.set(indiceSaque, novoSaldo);

                                System.out.println("Saque realizado com sucesso!");
                                System.out.printf("Valor sacado: R$ %.2f\n", valorSaque);
                                System.out.printf("Novo saldo: R$ %.2f\n", novoSaldo);
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("VER SALDO");

                    if (numerosConta.isEmpty()) {
                        System.out.println("Nenhuma conta cadastrada!");
                    } else {
                        System.out.print("Digite o número da conta: ");
                        int contaSaldo = sc.nextInt();


                        int indiceSaldo = numerosConta.indexOf(contaSaldo);

                        if (indiceSaldo == -1) {
                            System.out.println("ERRO: Conta não encontrada!");
                        } else {
                            System.out.println("INFORMAÇÕES DA CONTA");
                            System.out.printf("Número da conta: %d\n", numerosConta.get(indiceSaldo));
                            System.out.printf("Titular: %s\n", titulares.get(indiceSaldo));
                            System.out.printf("Saldo atual: R$ %.2f\n", saldos.get(indiceSaldo));
                        }
                    }
                    break;

                case 5:
                    System.out.println("LISTA DE TODAS AS CONTAS");

                    if (numerosConta.isEmpty()) {
                        System.out.println("Nenhuma conta cadastrada!");
                    } else {
                        System.out.println("-".repeat(60));
                        System.out.printf("%-10s %-25s %-15s\n", "CONTA", "TITULAR", "SALDO");
                        System.out.println("-".repeat(60));

                        for (int i = 0; i < numerosConta.size(); i++) {
                            System.out.printf("%-10d %-25s R$ %10.2f\n",
                                    numerosConta.get(i),
                                    titulares.get(i),
                                    saldos.get(i));
                        }

                        System.out.println("-".repeat(60));
                        System.out.printf("Total de contas: %d\n", numerosConta.size());

                        double saldoTotal = 0;
                        for (int i = 0; i < saldos.size(); i++) {
                            saldoTotal += saldos.get(i);
                        }
                        System.out.printf("Saldo total do banco: R$ %.2f\n", saldoTotal);
                    }
                    break;

                case 6:
                    System.out.println("Obrigado por usar o sistema bancário!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println();

        } while (opcao != 6);

        sc.close();
    }
}


