package aulasjava.POO.ex5;

public class Carro extends Veiculo {
    int portas;

    public Carro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Portas: " + this.portas);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}
