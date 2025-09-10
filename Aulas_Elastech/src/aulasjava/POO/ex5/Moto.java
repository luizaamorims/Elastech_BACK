package aulasjava.POO.ex5;

public class Moto extends Veiculo{
    int cilindradas;

    public Moto(String marca, int ano, int cilindradas){
        super(marca, ano);
        this.cilindradas = cilindradas;

    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Cilindradas: " + this.cilindradas);
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
