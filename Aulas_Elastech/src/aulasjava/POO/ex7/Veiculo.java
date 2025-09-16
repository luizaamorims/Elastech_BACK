package aulasjava.POO.ex7;

public abstract class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void acelerar();

    public String getMarca() {
        return marca;
    }

    public void setModelo(String marca) {
        this.marca = marca;
    }
}
