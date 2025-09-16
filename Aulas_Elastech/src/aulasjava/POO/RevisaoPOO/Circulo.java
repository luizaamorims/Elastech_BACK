package aulasjava.POO.RevisaoPOO;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double getRaio() {
        return raio;
    }
}
