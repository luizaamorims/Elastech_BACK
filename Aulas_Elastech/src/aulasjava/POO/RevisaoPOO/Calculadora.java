package aulasjava.POO.RevisaoPOO;

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Erro: Divisão por zero não é permitida!");
            return 0;
        }
    }
}
