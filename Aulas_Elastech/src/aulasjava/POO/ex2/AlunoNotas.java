package aulasjava.POO.ex2;

public class AlunoNotas {
    private String nome;
    private double[] notas;


    public AlunoNotas(String nome) {
        this.nome = nome;
        this.notas = new double[4];
    }


    public void adicionarNota(int bimestre, double nota) {
        if (bimestre >= 1 && bimestre <= 4) {
            if (nota >= 0 && nota <= 10) {
                this.notas[bimestre - 1] = nota;
            } else {
                System.out.println("Nota inválida! A nota deve ser entre 0 e 10.");
            }
        } else {
            System.out.println("Bimestre inválido! O bimestre deve ser entre 1 e 4.");
        }
    }


    public double calcularMedia() {
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma / this.notas.length;
    }


    public void verificarStatus() {
        double media = calcularMedia();
        System.out.println("\nAluno: " + this.nome);
        System.out.printf("Média: %.2f\n", media);
        if (media >= 7.0) {
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }
    }
}
