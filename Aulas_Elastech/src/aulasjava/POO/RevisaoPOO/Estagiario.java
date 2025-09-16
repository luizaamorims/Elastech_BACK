package aulasjava.POO.RevisaoPOO;

public class Estagiario extends Funcionario{

    public Estagiario(String nome) {
        super(nome);
    }

    @Override
    public double calcularSalario() {
        return 1200.0;
    }
}
