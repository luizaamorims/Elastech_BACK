package aulasjava.POO.RevisaoPOO;

public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    public double getLado() {
        return lado;
    }

}
