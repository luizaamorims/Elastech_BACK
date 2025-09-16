package aulasjava.POO.RevisaoPOO;

public class ContaSimples {
    private double saldo;

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
