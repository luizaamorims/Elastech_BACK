package aulasjava.POO.ex2;

public class Carro {
    String marca;
    int ano;

    public Carro() {
        this.marca = "Desconhecida";
        this.ano = 0;
    }

    public void exibirValores() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
    }
}
