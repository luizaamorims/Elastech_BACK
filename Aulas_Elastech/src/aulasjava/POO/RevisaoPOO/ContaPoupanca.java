package aulasjava.POO.RevisaoPOO;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    public void calcularRendimento() {
        double rendimento = getSaldo() * 0.02;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento de 2% aplicado! Valor: R$ " + String.format("%.2f", rendimento));
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Conta Poupança - " + getTitular() + " (" + getNumeroConta() +
                ") - Saldo: R$ " + String.format("%.2f", getSaldo()));
    }
}
