package aulasjava.POO.RevisaoPOO;

public class Funcionario2 {
    private String nome;
    private Departamento departamento;

    public Funcionario2(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;

    }

    public void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
