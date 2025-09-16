package aulasjava.POO.ex7;

public class SmartCarro extends Veiculo implements Conectavel   {

    public SmartCarro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void conectarWifi() {
        System.out.println("Conectando Wifi");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro");
    }



}
