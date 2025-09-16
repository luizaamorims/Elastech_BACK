package aulasjava.POO.ex7;

public class Televisao implements Controlavel {

    @Override
    public void ligar() {
        System.out.println("Ligando a TV!");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a TV!");
    }
}
