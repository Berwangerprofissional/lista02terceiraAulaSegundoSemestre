package exercicio07aluno;
public class testeAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos", "202312345", "Engenharia");

        double[] notas = {8.5, 7.0, 9.0, 6.5};
        double media = aluno.calcularMedia(notas);

        System.out.println("A média de " + aluno.getNome() + " é: " + media);
    }
}