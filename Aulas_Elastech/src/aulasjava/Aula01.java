package aulasjava;

public class Aula01 {
    public static void main(String[] args) {
     /* String nome = "Luiza";
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
*/

//Lista de Exercícios PARSE
//Soma de Entradas: Crie uma classe SomaStrings. Declare duas variáveis String, valor1 com o texto "15" e valor2 com o texto "25".
//Faça o parse de ambas para int, some os dois números e imprima o resultado.


        String valor1 = "15";
        String valor2 = "25";
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int soma = num1 + num2;
        System.out.println("Soma: " + soma);

//Calculadora de IMC: Crie uma classe CalculadoraIMC. Declare uma String peso com o valor "78.5" e uma String altura com o valor "1.82". Faça o parse de ambos para double, calcule o IMC (fórmula: peso / (altura * altura)) e imprima o resultado.
        String peso = "78.5";
        String altura = "1.82";
        double pesoDouble = Double.parseDouble(peso);
        double alturaDouble = Double.parseDouble(altura);
        double imc = pesoDouble / (alturaDouble * alturaDouble);
        System.out.println("IMC: " + imc);

//Cadastro Simples: Crie uma classe CadastroUsuario. Declare uma String nome com seu nome, uma String idade com sua idade em texto (ex: "29"), e uma String salario com um valor (ex: "3200.50"). Faça o parse da idade e do salário para seus tipos corretos e, no final, imprima uma frase usando String.format() que junte todas as informações, como: "O usuário [nome], de [idade] anos, tem um salário de R$ [salario]".
        String nome = "Luiza";
        String idade = "25";
        String salario = "3200.50";
        int idadeInt = Integer.parseInt(idade);
        double salarioDouble = Double.parseDouble(salario);
        String frase = String.format("O usuário %s, de %d anos, tem um salário de R$ %.2f", nome, idadeInt, salarioDouble);
        System.out.println(frase);

//O Erro Proposital: Crie uma classe TesteErro. Declare uma String numeroInvalido com o valor "123z". Tente fazer o parse dela para int usando Integer.parseInt(). Execute o programa. Ele vai quebrar. Copie a primeira linha da mensagem de erro que aparece no console e cole-a como um comentário no seu código para documentar o que aconteceu.
        String numeroInvalido = "123z";
        // java.lang.NumberFormatException: For input string: "123z"
        int numero = Integer.parseInt(numeroInvalido);
        System.out.println(numero);


//Decisão de Compra: Crie uma classe DecisaoDeCompra. Declare uma String saldoConta com o valor "500.75" e uma String precoProduto com o valor "499.99". Declare uma String temCredito com o valor "true". Faça o parse dos três valores para seus tipos corretivos (double, double e boolean). O objetivo deste exercício é apenas fazer a conversão e imprimir os três valores convertidos, cada um em uma linha.
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

    public static class RevisaoJava {
    }
}
