package aulasjava.POO.ex7;

public class SmartTvReciclavel implements Reciclavel, Controlavel {

    @Override
    public void reciclar() {
        System.out.println("Reciclando Smart TV");
    }

    public void ligar(){
        System.out.println("Ligando Smart TV");
    }

    public void desligar(){
        System.out.println("Desligando Smart TV");
    }
}
