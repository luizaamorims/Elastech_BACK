package aulasjava.POO.ex4;

public class ControleArCondicionado {

    private boolean ligado;
    private int temperatura;

    public ControleArCondicionado() {
        this.ligado = false;
        this.temperatura = 24;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Ar condicionado ligado!");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Ar condicionado desligado!");
    }

    public void aumentarTemperatura() {
        if (!ligado) {
            System.out.println("Erro: Ar condicionado está desligado");
            return;
        }

        if (temperatura < 30) {
            temperatura++;
            System.out.println("Temperatura aumentada para " + temperatura + "°C");
        } else {
            System.out.println("Erro: Temperatura máxima (30°C) já atingida");
        }
    }

    public void diminuirTemperatura() {
        if (!ligado) {
            System.out.println("Erro: Ar condicionado está desligado");
            return;
        }

        if (temperatura > 17) {
            temperatura--;
            System.out.println("Temperatura diminuída para " + temperatura + "°C");
        } else {
            System.out.println("Erro: Temperatura mínima (17°C) já atingida");
        }
    }

    public void mostrarStatus() {
        String status = ligado ? "Ligado" : "Desligado";
        System.out.println("Status do Ar: " + status + " | Temperatura: " + temperatura + "°C");
    }
}
