package aulasjava.POO.ex5;

public class AppMain {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.idade = 20;
        aluno.matricula = 12345;

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Matrícula: " + aluno.matricula);

        Carro carro = new Carro("Toyota", 2020, 4);
        System.out.println("Marca: " + carro.marca);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Portas: " + carro.portas);

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();

        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();

        funcionario.trabalhar();
        gerente.trabalhar();

        Carro carro2 = new Carro("Honda", 2021, 2);
        Moto moto = new Moto("Yamaha", 2022, 600);

        carro2.acelerar();
        moto.acelerar();

        Aluno estudante = new Aluno();
        estudante.nome = "Maria";
        estudante.idade = 19;
        estudante.matricula = 54321;

        Professor professor = new Professor();
        professor.nome = "Dr. Silva";
        professor.idade = 45;

        estudante.estudar();
        professor.ensinar();

        ContaCorrente conta = new ContaCorrente(1000.0);
        System.out.println("Saldo inicial: R$ " + conta.saldoInicial);

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Pedro";
        aluno2.idade = 22;
        aluno2.setCpf(123456789);

        System.out.println("Nome: " + aluno2.nome);
        System.out.println("CPF: " + aluno2.getCpf());

        Carro carroCompleto = new Carro("Volkswagen", 2023, 4);
        carroCompleto.mostrarInfo();

        Moto motoCompleta = new Moto("Honda", 2023, 750);
        motoCompleta.mostrarInfo();
    }


}

