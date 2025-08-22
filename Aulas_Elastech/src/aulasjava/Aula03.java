package aulasjava;

public class Aula03 {
    public static void main(String[] args) {



        // 1) Validação de Mês:
        // Peça um número de 1 a 12. Use um if para verificar se o número está nesse intervalo.
        // Se estiver, use um switch para imprimir o nome do mês. Se não, imprima "Mês inválido".
        int numeroMes = 5;

        if (numeroMes >= 1 && numeroMes <= 12) {
            switch (numeroMes) {
                case 1: System.out.println("Janeiro"); break;
                case 2: System.out.println("Fevereiro"); break;
                case 3: System.out.println("Março"); break;
                case 4: System.out.println("Abril"); break;
                case 5: System.out.println("Maio"); break;
                case 6: System.out.println("Junho"); break;
                case 7: System.out.println("Julho"); break;
                case 8: System.out.println("Agosto"); break;
                case 9: System.out.println("Setembro"); break;
                case 10: System.out.println("Outubro"); break;
                case 11: System.out.println("Novembro"); break;
                case 12: System.out.println("Dezembro"); break;
            }
        } else {
            System.out.println("Mês inválido");
        }

        // 2) Cardápio com Opções Vegetarianas:
        // Menu: 1-Hambúrguer, 2-Pizza, 3-Salada. No case da Pizza, pergunte se quer vegetariana.
        int opcaoMenu = 2;
        boolean pizzaVegetariana = true;

        switch (opcaoMenu) {
            case 1:
                System.out.println("Você escolheu Hambúrguer");
                break;
            case 2:
                if (pizzaVegetariana) {
                    System.out.println("Você escolheu Pizza Vegetariana");
                } else {
                    System.out.println("Você escolheu Pizza Tradicional");
                }
                break;
            case 3:
                System.out.println("Você escolheu Salada");
                break;
            default:
                System.out.println("Opção inválida");
        }

        // 3) Tarifa de Transporte:
        // Categoria: 'E' (Estudante), 'A' (Aposentado), 'R' (Regular). Se for horário de pico, todos pagam R$5,50.
        // Se não, estudante paga metade, aposentado isento, regular paga R$4,40.
        char categoria = 'E';
        boolean horarioPico = false;
        double tarifa;

        if (horarioPico) {
            tarifa = 5.50;
        } else {
            switch (categoria) {
                case 'E':
                    tarifa = 2.75;
                    break;
                case 'A':
                    tarifa = 0.0;
                    break;
                case 'R':
                    tarifa = 4.40;
                    break;
                default:
                    tarifa = -1;
            }
        }
        if (tarifa >= 0) {
            System.out.println("Tarifa: R$ " + String.format("%.2f", tarifa));
        } else {
            System.out.println("Categoria inválida");
        }

        // 4) Sistema de Notas com Conceito:
        // Nota de 0 a 10. <5: "Reprovado", 5-7: "Recuperação", >7: switch em "status" para parabéns.
        double nota = 8.0;

        if (nota < 5) {
            System.out.println("Reprovado");
        } else if (nota <= 7) {
            System.out.println("Recuperação");
        } else {
            String status = "Aprovado";
            switch (status) {
                case "Aprovado":
                    System.out.println("Aprovado! :)) Parabéns!");
                    break;
                default:
                    System.out.println("Status desconhecido");
            }
        }

        // 5) Operações Bancárias:
        // Switch para operação ('S' Saque, 'D' Depósito). No saque, verifique se saldo é suficiente.
        char operacao = 'S';
        double saldo = 500.0;
        double valorSaque = 600.0;
        double valorDeposito = 200.0;

        switch (operacao) {
            case 'S':
                if (valorSaque <= saldo) {
                    saldo -= valorSaque;
                    System.out.println("Saque realizado. Saldo atual: R$ " + String.format("%.2f", saldo));
                } else {
                    System.out.println("Saldo insuficiente para saque.");
                }
                break;
            case 'D':
                saldo += valorDeposito;
                System.out.println("Depósito realizado. Saldo atual: R$ " + String.format("%.2f", saldo));
                break;
            default:
                System.out.println("Operação inválida");
        }

        // 6) Tipo de Veículo e Pedágio:
        // Switch em tipoVeiculo ("Carro", "Moto", "Caminhão"). Se eixoExtra, adicione taxa extra.
        String tipoVeiculo = "Caminhão";
        boolean eixoExtra = true;
        double pedagio = 0.0;

        switch (tipoVeiculo) {
            case "Carro":
                pedagio = 15.0;
                break;
            case "Moto":
                pedagio = 5.0;
                break;
            case "Caminhão":
                pedagio = 30.0;
                break;
            default:
                System.out.println("Tipo de veículo inválido");
        }
        if (eixoExtra) {
            pedagio += 8.0;
        }
        if (pedagio > 0) {
            System.out.println("Pedágio a pagar: R$ " + String.format("%.2f", pedagio));
        }

        // 7) Login com Nível de Acesso:
        // Verifique usuario e senha. Se correto, switch no nivelDeAcesso ("admin", "usuario", "guest").
        String usuario = "admin";
        String senha = "java123";
        String usuarioDigitado = "admin";
        String senhaDigitada = "java123";
        String nivelDeAcesso = "admin";
        if (usuarioDigitado.equals(usuario) && senhaDigitada.equals(senha)) {
            switch (nivelDeAcesso) {
                case "admin":
                    System.out.println("Permissão total ao sistema.");
                    break;
                case "usuario":
                    System.out.println("Permissão limitada.");
                    break;
                case "guest":
                    System.out.println("Acesso somente leitura.");
                    break;
                default:
                    System.out.println("Nível de acesso desconhecido.");
            }
        } else {
            System.out.println("Usuário ou senha inválidos.");
        }

        // 8) Estações do Ano:
        // Switch para int mes (1 a 12). Agrupe cases para definir estacao. Se "Inverno", imprima mensagem.
        int mes = 7;
        String estacao;
        switch (mes) {
            case 12: case 1: case 2:
                estacao = "Verão";
                break;
            case 3: case 4: case 5:
                estacao = "Outono";
                break;
            case 6: case 7: case 8:
                estacao = "Inverno";
                break;
            case 9: case 10: case 11:
                estacao = "Primavera";
                break;
            default:
                estacao = "Mês inválido";
        }
        System.out.println("Estação: " + estacao);
        if (estacao.equals("Inverno")) {
            System.out.println("Época de chocolate quente!");
        }

        // 9) Calculadora Inteligente:
        // Switch em char operacao ('+', '-', '*', '/'). No '/' verifique divisor != 0.
        char op = '/';
        double n1 = 10.0;
        double n2 = 0.0;
        switch (op) {
            case '+':
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case '-':
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case '*':
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case '/':
                if (n2 != 0) {
                    System.out.println("Resultado: " + (n1 / n2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida");
                }
                break;
            default:
                System.out.println("Operação inválida");
        }

    }
}
