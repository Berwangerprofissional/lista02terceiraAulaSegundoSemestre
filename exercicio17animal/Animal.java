package exercicio17animal;
public class Animal {
    private String especie;
    private int idade;
    private double peso;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public void alimentar(double quantidade) {
        if (quantidade > 0) {
            peso += quantidade * 0.1; // Exemplo de como o peso pode aumentar com a alimentação
            System.out.println(especie + " foi alimentado e agora pesa " + peso + " kg.");
        } else {
            System.out.println("Quantidade de alimento inválida.");
        }
    }

    public void dormir() {
        System.out.println(especie + " está dormindo.");
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }
}