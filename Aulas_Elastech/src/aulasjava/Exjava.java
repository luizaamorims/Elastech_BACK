package aulasjava;

public class Exjava {
    public static void main(String[] args) {
        String nome = "Luiza";
        int idade = 25;
        double altura = 1.56;
        boolean animalEstimacao = true;


        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Possui animal de estimação? " + animalEstimacao);



        int numero1 = 10;
        int numero2 = 20;

        int soma = numero1 + numero2;


        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a: " + soma);



       // int numero = "oi";


        String parte1 = "oi ";
        String parte2 = "meu nome é ";
        String parte3 = "Luiza ";
        String parte4 = "e tenho 22 anos";
        String fraseCompleta = parte1 + parte2 + parte3 + parte4;

        System.out.println("Frase completa: " + fraseCompleta);



        int placar = 0;

        System.out.println("Placar inicial: " + placar);
         placar = 15;

        System.out.println("Placar atualizado: " + placar);
        placar = 30;

        System.out.println("Placar final: " + placar);


        String valor1 = "15";
        String valor2 = "25";
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int soma = num1 + num2;
        System.out.println("Soma: " + soma);


        String peso = "78.5";
        String altura = "1.82";
        double pesoDouble = Double.parseDouble(peso);
        double alturaDouble = Double.parseDouble(altura);
        double imc = pesoDouble / (alturaDouble * alturaDouble);
        System.out.println("IMC: " + imc);


        String nome = "Luiza";
        String idade = "25";
        String salario = "3200.50";
        int idadeInt = Integer.parseInt(idade);
        double salarioDouble = Double.parseDouble(salario);
        String frase = String.format("O usuário %s, de %d anos, tem um salário de R$ %.2f", nome, idadeInt, salarioDouble);
        System.out.println(frase);


        String numeroInvalido = "123z";
        // java.lang.NumberFormatException: For input string: "123z"
        int numero = Integer.parseInt(numeroInvalido);
        System.out.println(numero);



        String saldoConta = "500.75";
        String precoProduto = "499.99";
        String temCredito = "true";
        double saldo = Double.parseDouble(saldoConta);
        double preco = Double.parseDouble(precoProduto);
        boolean credito = Boolean.parseBoolean(temCredito);
        System.out.println(saldo);
        System.out.println(preco);
        System.out.println(credito);








    }
}
