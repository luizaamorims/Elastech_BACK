package aulasjava.POO.ex4;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double valor) {
        if (valor >= 1320.00) {
            this.salario = valor;
            System.out.println("Salário definido com sucesso: R$ " + valor);
        } else {
            System.out.println("Erro: Salário não pode ser menor que R$ 1320.00");
            return;
        }
    }
}
