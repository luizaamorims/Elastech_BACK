package aulasjava.POO.RevisaoPOO;

public class Radio implements Controlavel{

    @Override
    public void ligar() {
        System.out.println("Ligando o radio!");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o radio!");
    }
}
