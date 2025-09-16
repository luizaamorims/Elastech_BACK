package aulasjava.POO.RevisaoPOO;

public class ContaCorrente extends ContaBancaria {
    private double limite = 500.0;

    public ContaCorrente(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= (getSaldo() + limite)) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$ " + String.format("%.2f", valor) +
                    " realizado na conta corrente " + getNumeroConta());
            return true;
        } else {
            System.out.println("Erro: Limite excedido! Limite disponível: R$ " +
                    String.format("%.2f", getSaldo() + limite));
            return false;
        }
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Conta Corrente - " + getTitular() + " (" + getNumeroConta() +
                ") - Saldo: R$ " + String.format("%.2f", getSaldo()) +
                " - Limite: R$ " + String.format("%.2f", limite));
    }
}

