package aulasjava.POO.RevisaoPOO;

public interface OperacoesBancarias {
    void depositar(double valor);
    boolean sacar(double valor);
    boolean transferir(ContaBancaria destino, double valor);
}
