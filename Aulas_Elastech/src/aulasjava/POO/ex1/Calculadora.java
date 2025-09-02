package aulasjava.POO.ex1;

import java.util.Scanner;

public class Calculadora {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0.0;
        }
        return a / b;
    }

    public void mostrarMenu() {
        System.out.println("\n CALCULADORA ");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Sair");
        System.out.print("digite uma opção: ");
    }


    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);


        int opcao;
        double num1, num2, resultado;

        do {
            calc.mostrarMenu();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = sc.nextDouble();
                    resultado = calc.somar(num1, num2);
                    System.out.printf("Resultado: %.1f + %.1f = %.1f\n", num1, num2, resultado);
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = sc.nextDouble();
                    resultado = calc.subtrair(num1, num2);
                    System.out.printf("Resultado: %.1f - %.1f = %.1f\n", num1, num2, resultado);
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = sc.nextDouble();
                    resultado = calc.multiplicar(num1, num2);
                    System.out.printf("Resultado: %.1f × %.1f = %.1f\n", num1, num2, resultado);
                    break;

                case 4:
                    System.out.print("Digite o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = sc.nextDouble();
                    resultado = calc.dividir(num1, num2);
                    System.out.printf("Resultado: %.1f / %.1f = %.1f\n", num1, num2, resultado);
                    break;

                case 0:
                    System.out.println("Saindo da calculadora...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }


        } while (opcao != 0);

        sc.close();
    }
}



