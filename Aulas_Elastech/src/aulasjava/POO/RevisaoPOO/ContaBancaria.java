package aulasjava.POO.RevisaoPOO;

public abstract class ContaBancaria implements OperacoesBancarias {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado na conta " + numeroConta);
        } else {
            System.out.println("Erro: Valor inválido para depósito!");
        }
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado na conta " + numeroConta);
            return true;
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido!");
            return false;
        }
    }

    @Override
    public boolean transferir(ContaBancaria destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + String.format("%.2f", valor) +
                    " realizada de " + this.numeroConta + " para " + destino.numeroConta);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void exibirTipoConta();
}
