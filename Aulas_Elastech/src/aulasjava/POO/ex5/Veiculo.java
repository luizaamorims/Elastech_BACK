package aulasjava.POO.ex5;

public class Veiculo {
    String marca;
    int ano;

    public Veiculo(String marca, int ano){
     this.marca = marca;
     this.ano = ano;
    }

    public void acelerar(){
        System.out.println("acelerando...");
    }


    public void mostrarInfo(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
