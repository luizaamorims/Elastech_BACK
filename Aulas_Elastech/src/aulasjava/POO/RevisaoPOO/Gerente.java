package aulasjava.POO.RevisaoPOO;

public class Gerente extends Funcionario{

    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public double calcularSalario() {
        return 5000.00;
    }
}
