package aulasjava.POO.RevisaoPOO;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        // Exercício 1 - Classes e Objetos
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ana Silva";
        aluno1.idade = 22;
        System.out.println("Aluno: " + aluno1.nome + ", " + aluno1.idade + " anos");

        // Exercício 2 - Construtores
        Livro livro = new Livro("1984", "George Orwell");
        livro.exibirInfo();

        // Exercício 3 - Encapsulamento
        ContaSimples conta = new ContaSimples();
        conta.depositar(1000.0);
        System.out.println("Saldo: R$ " + conta.getSaldo());

        // Exercício 4 - Herança
        Carro carro = new Carro();
        carro.mover();

        // Exercício 5 - Polimorfismo
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Maria"));
        funcionarios.add(new Estagiario("Pedro"));

        for (Funcionario func : funcionarios) {
            System.out.println(func.getNome() + " - R$ " + func.calcularSalario());
        }

        // Exercício 6 - Abstração
        Quadrado quadrado = new Quadrado(5);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());

        // Exercício 7 - Interfaces
        Televisao tv = new Televisao();
        tv.ligar();

        // Exercício 8 - Métodos
        Calculadora calc = new Calculadora();
        System.out.println("10 + 5 = " + calc.somar(10, 5));

        // Exercício 9 - Associação
        Departamento dpto = new Departamento("TI");
        Funcionario2 func = new Funcionario2("Laura", dpto);
        func.exibirInfo();

        // Exercício 10 - Sistema Bancário
        ContaCorrente cc = new ContaCorrente("001", "Alice", 1000.0);
        ContaPoupanca cp = new ContaPoupanca("002", "Bruno", 2000.0);

        cc.depositar(500.0);
        cp.calcularRendimento();
        cc.transferir(cp, 300.0);

        List<ContaBancaria> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(cp);

        for (ContaBancaria cont : contas) {
            cont.exibirTipoConta();
            cont.getSaldo();
        }

    }
}
